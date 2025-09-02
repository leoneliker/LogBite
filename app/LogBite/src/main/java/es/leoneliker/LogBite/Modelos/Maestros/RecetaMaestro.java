package es.leoneliker.LogBite.Modelos.Maestros;

import lombok.*;

import java.util.List;

import es.leoneliker.LogBite.Enums.EnumEstado;
import es.leoneliker.LogBite.Modelos.Comida;
import es.leoneliker.LogBite.Modelos.IngredienteReceta;
import es.leoneliker.LogBite.Modelos.RecetaUsuario;
import es.leoneliker.LogBite.Modelos.RecetaVersion;
import jakarta.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecetaMaestro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecetaMaestro;
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private EnumEstado estado = EnumEstado.ACTIVO;

    // Relación de uno a uno con Recetas_usuario
    @OneToOne(mappedBy = "recetaMaestro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private RecetaUsuario recetasUsuario;

    @OneToMany(mappedBy = "recetaMaestro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<IngredienteReceta> ingredientesReceta;

    @OneToMany(mappedBy = "recetaMaestro", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RecetaVersion> recetasVersiones;

    @OneToMany(mappedBy = "recetaMaestro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Comida> comidas;

}