package pe.edu.cibertec.DAAII_T1_VilchezAlexandra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "auth/frmlogin";
    }
    @GetMapping("/login-success")
    public String loginSuccess(){
        return "redirect:/auth/dashboard";
    }
    @GetMapping("/dashboard")
    public String dashboard(){ return "auth/home"; }
    @GetMapping("/registrarse")
    public String registrarse() { return "auth/frmregistrarse"; }
    @GetMapping("/frmpassword")
    public String frmpassword(){ return "auth/frmpassword"; }
}