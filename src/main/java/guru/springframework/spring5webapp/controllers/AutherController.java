package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AutherController {
    @Autowired
    private AuthorRepository authorRepository;

    @RequestMapping("/authers")
    public String getAuthers(Model model){
        model.addAttribute("authers", authorRepository.findAll());
        return "/authers/list";
    }
}
