package es.leoneliker.LogBite.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.leoneliker.LogBite.Modelos.Usuario;
import es.leoneliker.LogBite.Repositorios.RepositorioUsuario;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public ServicioUsuario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public List<Usuario> obtenerTodos() {
        return repositorioUsuario.findAll();
    }

    public Optional<Usuario> obtenerPorId(Long id) {
        return repositorioUsuario.findById(id);
    }

    public Usuario crearUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    public void eliminarUsuario(Long id) {
        repositorioUsuario.deleteById(id);
    }

    public Usuario obtenerPorEmail(String email) {
        return repositorioUsuario.findByEmail(email);
    }
}
