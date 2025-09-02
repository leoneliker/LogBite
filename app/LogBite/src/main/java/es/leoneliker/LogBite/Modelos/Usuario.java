package es.leoneliker.LogBite.Modelos;

import lombok.*;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String email;
    private String contrasena;
    private String provider;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Perfil perfil;

    // Un usuario puede tener varias recetas, y a futuro, una receta podra pertenecer a varias
    @ManyToMany
    @JoinTable(name = "usuarioReceta", joinColumns = @JoinColumn(name = "idUsuario"), inverseJoinColumns = @JoinColumn(name = "idRecetaUsuario"))
    @Builder.Default
    private List<RecetaUsuario> recetaUsuario = new ArrayList<>();

    // TODO Fase 1.5: un usuario con varias casas/cocinas
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Despensa despensa;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @Builder.Default
    private List<RegistroCalendario> registrosCalendarios = new ArrayList<>();
}
