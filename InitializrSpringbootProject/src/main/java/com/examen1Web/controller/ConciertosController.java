
package com.examen1Web.controller;

import com.examen1Web.entity.Conciertos;
import com.examen1Web.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author jose
 */

@Controller
public class ConciertosController {
    
    @Autowired
    private IConciertoService conciertoService;
    
    @GetMapping("/concierto")
    public String index(Model model){
        List<Conciertos>listaConciertos=conciertoService.getAllConciertos();
        model.addAttribute("titulo","Conciertos");
        model.addAttribute("conciertos", listaConciertos);
        return "inicio";
    }
    @GetMapping("/nuevo")
    public String crearConciertos(Model model){
        model.addAttribute("conciertos", new Conciertos());
        return "nuevo";
    }
    @PostMapping("/guardar")
    public String guardarPersona(@ModelAttribute Conciertos concierto){
        conciertoService.saveConcierto(concierto);
        return "redirect:/inicio";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarConcierto(@PathVariable("id") Long idConcierto){
        conciertoService.delete(idConcierto);
        return "redirect:/inicio";
    }
}
