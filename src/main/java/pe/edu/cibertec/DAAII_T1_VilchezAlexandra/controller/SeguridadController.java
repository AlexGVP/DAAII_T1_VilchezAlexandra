package pe.edu.cibertec.DAAII_T1_VilchezAlexandra.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DAAII_T1_VilchezAlexandra.model.bd.Usuario;
import pe.edu.cibertec.DAAII_T1_VilchezAlexandra.model.dto.ResultadoDto;
import pe.edu.cibertec.DAAII_T1_VilchezAlexandra.model.dto.UsuarioDto;
import pe.edu.cibertec.DAAII_T1_VilchezAlexandra.service.UsuarioService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/seguridad")
public class SeguridadController {
    private UsuarioService usuarioService;

    @PostMapping("/guardarusuario")
    public String guardarUsuario(@ModelAttribute Usuario usuario){
        usuarioService.guardarUsuario(usuario);
        return "auth/login";
    }

    @GetMapping("/usuario/{id}")
    @ResponseBody
    public Usuario frmMantUsuario(@PathVariable("id") int id){
        return usuarioService.buscarUsuarioXIdUsuario(id);
    }
    @GetMapping("/usuario/lista")
    @ResponseBody
    public List<Usuario> listaUsuario(){
        return usuarioService.listarUsuario();
    }

}