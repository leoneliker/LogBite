package es.leoneliker.LogBite.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.leoneliker.LogBite.Modelos.Usuario;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {

    Usuario findByEmail(String email);
}
