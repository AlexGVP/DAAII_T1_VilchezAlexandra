package pe.edu.cibertec.DAAII_T1_VilchezAlexandra.service;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAAII_T1_VilchezAlexandra.model.bd.Rol;
import pe.edu.cibertec.DAAII_T1_VilchezAlexandra.model.bd.Usuario;
import pe.edu.cibertec.DAAII_T1_VilchezAlexandra.model.dto.ResultadoDto;
import pe.edu.cibertec.DAAII_T1_VilchezAlexandra.model.dto.UsuarioDto;
import pe.edu.cibertec.DAAII_T1_VilchezAlexandra.repository.RolRepository;
import pe.edu.cibertec.DAAII_T1_VilchezAlexandra.repository.UsuarioRepository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService implements IUsuarioService {

    private UsuarioRepository usuarioRepository;
    private RolRepository rolRepository;

    @Override
    public Usuario buscarUsuarioXNomUsuario(String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }
    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        usuario.setActivo(true);
        Rol usuarioRol = rolRepository.findByNomrol("ADMIN");
        usuario.setRoles(new HashSet<>(Arrays.asList(usuarioRol)));
        return usuarioRepository.save(usuario);
    }

    @Override
    public void actualizarPassword(Usuario usuario) {
        usuarioRepository.actualizarPassword(
                usuario.getPassword()
        );
    }

    @Override
    public List<Usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }
    @Override
    public Usuario buscarUsuarioXIdUsuario(Integer idusuario) {
        return usuarioRepository.findById(idusuario).orElse(null);
    }
}