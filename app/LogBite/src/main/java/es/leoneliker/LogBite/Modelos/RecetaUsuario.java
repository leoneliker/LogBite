package es.leoneliker.LogBite.Modelos;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

import es.leoneliker.LogBite.Modelos.Maestros.RecetaMaestro;
import jakarta.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecetaUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecetaUsuario;
    private String tipo;
    private Boolean personal;
    private Boolean autocotono;
    private String categoria;
    private String imagen;

    // Relación de uno a uno con Receta_maestro, de aqui sacaremos todas las versiones, el nombre...
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idRecetaMaestro")
    private RecetaMaestro recetaMaestro;

    // Relación con Usuario
    @ManyToMany(mappedBy = "recetaUsuario")
    @Builder.Default
    private List<Usuario> usuarios = new ArrayList<>();
}