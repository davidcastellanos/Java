package co.com.davidcastellanos.ninjasanddojos.controller;

import co.com.davidcastellanos.ninjasanddojos.model.Dojo;
import co.com.davidcastellanos.ninjasanddojos.service.DojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class DojoController {
    @Autowired
    private DojoService dojoService;

    @GetMapping("/")
    public String showCrateDojo() {
        return "index.jsp";
    }

    @GetMapping("/dojos/new")
    public String newUser(@ModelAttribute("nuevoDojo") Dojo dojo,
                          Model model) {

        //model.addAttribute("salones", servicio.findSalones());
        model.addAttribute(dojo);

        return "newDojo.jsp";
    }
    @PostMapping("/dojos/new")
    public String createDojo(@Valid @ModelAttribute("nuevoDojo") Dojo dojo,
                             BindingResult result,
                             Model model){
        if (result.hasErrors()) {
            return "newDojo.jsp";
        } else {
            dojoService.saveNewDojo(dojo);
            return "redirect:/";
        }
        //return "newDojo.jsp";
    }

    @GetMapping("/dojos/show/{id}")
    public String dashBoard(@PathVariable("id") Long id,
                            Model model) {
        Dojo findedDojo = dojoService.findAndReturnDojoUsingID(id);

        if (findedDojo == null) {
            return "redirect:/";
        }

        model.addAttribute("findedDojo", findedDojo);
        return "index.jsp";

    }
}
