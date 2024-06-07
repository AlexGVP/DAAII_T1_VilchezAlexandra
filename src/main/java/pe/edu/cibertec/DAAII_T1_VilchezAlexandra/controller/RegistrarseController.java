package pe.edu.cibertec.DAAII_T1_VilchezAlexandra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrarseController {
    @GetMapping("/frmregistrarse")
    public String frmregistrarse(){ return "frmregistrarse"; }
}