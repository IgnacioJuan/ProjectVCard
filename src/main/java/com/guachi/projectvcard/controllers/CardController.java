package com.guachi.projectvcard.controllers;

import com.guachi.projectvcard.models.domain.Persona;
import com.guachi.projectvcard.models.domain.Redes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CardController {
    /*@Autowired
    private List<Redes> list;*/
    @Autowired
    private Persona persona;
    @GetMapping("/vcard")
    public String factura(Model model){

        /*model.addAttribute("list", list);*/
        model.addAttribute("persona", persona);

        return "/Card/Card";
    }
}
