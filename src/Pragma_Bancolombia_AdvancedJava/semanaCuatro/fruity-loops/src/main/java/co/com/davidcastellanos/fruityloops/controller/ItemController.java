package co.com.davidcastellanos.fruityloops.controller;

import co.com.davidcastellanos.fruityloops.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ItemController {
    @GetMapping("/")
    public String index(Model model) {
        ArrayList<Item> fruits = new ArrayList<>();
        fruits.add(new Item("Kiwi", 1.5));
        fruits.add(new Item("Mango", 2.0));
        fruits.add(new Item("Bayas de Goji", 4.0));
        fruits.add(new Item("Guayava", .75));

        //System.out.println("fruits = " + fruits);

        model.addAttribute("arrayFruits", fruits);
        return "index.jsp";

    }
}
