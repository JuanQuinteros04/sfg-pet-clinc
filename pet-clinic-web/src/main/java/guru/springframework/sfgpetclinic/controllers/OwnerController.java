package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    String listOwner(){
        return "owners/index";
    }
}
