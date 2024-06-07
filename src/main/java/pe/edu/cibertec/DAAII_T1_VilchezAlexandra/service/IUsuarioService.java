package pe.edu.cibertec.DAAII_T1_VilchezAlexandra.service;

import pe.edu.cibertec.DAAII_T1_VilchezAlexandra.model.bd.Usuario;

import java.util.List;

public interface IUsuarioService {

    Usuario buscarUsuarioXNomUsuario(String nomusuario);
    Usuario guardarUsuario(Usuario usuario);
    void actualizarUsuario(Usuario usuario);
    List<Usuario> listarUsuario();
    Usuario buscarUsuarioXIdUsuario(Integer idusuario);
}