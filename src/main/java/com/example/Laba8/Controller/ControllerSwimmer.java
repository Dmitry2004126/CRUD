package com.example.Laba8.Controller;


import com.example.Laba8.DAO.SwimmersDAO;
import com.example.Laba8.Model.Swimmer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/swimmers")
public class ControllerSwimmer {
    private final SwimmersDAO swimmersDAO = new SwimmersDAO();

    @GetMapping()
    public String index (Model model){
        model.addAttribute("swimmers", swimmersDAO.index());
        return "swimmers/index";
    }
    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
        model.addAttribute("swimmer", swimmersDAO.show(id));
        return "swimmers/show";
    }
    @GetMapping("/new")
    public String newSwimmer(Model model){
        model.addAttribute("swimmer",new Swimmer());
        return "swimmers/new";
    }
    @PostMapping()
    public String create(@ModelAttribute("swimmer") Swimmer swimmer){
        swimmersDAO.save(swimmer);
        return "redirect:/swimmers";
    }
    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id){
        model.addAttribute("swimmer",swimmersDAO.show(id));
        return "swimmers/edit";
    }
    @PostMapping("/{id}")
    public String update(@ModelAttribute("swimmer") Swimmer swimmer, @PathVariable("id") int id){
        swimmersDAO.update(id,swimmer);
        return "redirect:/swimmers";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        swimmersDAO.delete(id);
        return "redirect:/swimmers";
    }
}
