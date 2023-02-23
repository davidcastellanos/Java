package co.com.david.daikichi.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class DaikichiController {
    @GetMapping({"/", "/daikichi"})
    String home() {
        return "Hola desde el Home Daikichi Path Variables!!";
    }

    @GetMapping({ "/daikichi/travel/{destino}"})
    String travel(@PathVariable("destino") String destino) {
        return String.format("<h3>Congratulations! You will soon travel to %s </h3>", destino);
    }

    @GetMapping({ "/daikichi/lotto/{n}"})
    String travel(@PathVariable("n") int num) {
        String evenPrediction = "You will take a grand journey in the near future, but be wary of tempting offers.";
        String oddPrediction = "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        int result;
        try {
            result = num % 2;
            return result == 0 ? evenPrediction : oddPrediction;
        } catch (RuntimeException e) {
            e.printStackTrace();
            return "Dato inválido, intenta con un número par o impar";
        }

    }
}
