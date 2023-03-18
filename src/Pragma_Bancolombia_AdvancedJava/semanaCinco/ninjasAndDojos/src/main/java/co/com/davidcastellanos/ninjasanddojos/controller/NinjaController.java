package co.com.davidcastellanos.ninjasanddojos.controller;

import co.com.davidcastellanos.ninjasanddojos.model.Dojo;
import co.com.davidcastellanos.ninjasanddojos.model.Ninja;

import co.com.davidcastellanos.ninjasanddojos.service.DojoService;
import co.com.davidcastellanos.ninjasanddojos.service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
    @Autowired
    private NinjaService ninjaService;
    @Autowired
    private DojoService dojoService;

    @GetMapping("/new")
    public String showCrateNinja(@ModelAttribute("nuevoNinja") Ninja ninja,
                                 Model model) {
        model.addAttribute(ninja);
        return "newNinja.jsp";
    }

    @PostMapping("/new")
    public String createNinja(@Valid @ModelAttribute("nuevoNinja") Ninja ninja,
                             BindingResult result,
                             Model model){
        model.addAttribute("dojosDisponibles", dojoService.findAndReturnAllDojos());

        if (result.hasErrors()) {
            return "newNinja.jsp";
        } else {
            ninjaService.saveNewNinja(ninja);
            return "redirect:/";
        }
    }

}
