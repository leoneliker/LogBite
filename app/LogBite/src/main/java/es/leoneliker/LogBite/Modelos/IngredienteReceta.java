package es.leoneliker.LogBite.Modelos;

import es.leoneliker.LogBite.Modelos.Maestros.IngredienteMaestro;
import es.leoneliker.LogBite.Modelos.Maestros.RecetaMaestro;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IngredienteReceta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngredienteReceta;

    private Double cantidad;
    private String unidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idIngredienteMaestro", nullable = true)
    private IngredienteMaestro ingredienteMaestro; // null si es receta

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idRecetaMaestro", nullable = true)
    private RecetaMaestro recetaMaestro; // null si es ingrediente

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idRecetaVersion", nullable = false)
    private RecetaVersion recetaVersion;
}
