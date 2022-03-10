
package com.examen1Web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author jose
 */
@Controller
public class LoginController {
    
    @GetMapping({"/","iticket","/ITicket", })
    public String index(){
        return "inicio";
    }
    
    
    
}
