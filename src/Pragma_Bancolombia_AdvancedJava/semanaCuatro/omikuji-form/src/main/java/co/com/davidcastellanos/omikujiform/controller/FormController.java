package co.com.davidcastellanos.omikujiform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class FormController {

    @GetMapping("/omikuji")
    public String mostrarFormulario() {
        return "index.jsp";
    }

    @PostMapping("/omikuji")
    public String enviarFormulario(@RequestParam("numero") int num,
                                   @RequestParam("ciudad") String ciudad,
                                   @RequestParam("nombre") String nombre,
                                   @RequestParam("actividad") String actividad,
                                   @RequestParam("animal") String animal,
                                   @RequestParam("frase") String frase,
                                   HttpSession session,
                                   RedirectAttributes flash ) {

        //System.out.println("num = " + num);
        //System.out.println("ciudad = " + ciudad);

        if (ciudad.length() < 4 ||  nombre.length() < 4 || actividad.length() < 4 || animal.length() < 4 || frase.length() < 4) {
            flash.addFlashAttribute("error", "Por favor, agrega un texto más extenso");
            return "redirect:/omikuji";
        }

        session.setAttribute("num", num);
        session.setAttribute("ciudad", ciudad);
        session.setAttribute("nombre", nombre);
        session.setAttribute("actividad", actividad);
        session.setAttribute("animal", animal);
        session.setAttribute("frase", frase);
        return "redirect:/show";

    }

    @GetMapping("/show")
    public String mostrarResultado() {
        return "omikuji-result.jsp";
    }

}
