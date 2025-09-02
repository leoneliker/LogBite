package es.leoneliker.LogBite.Modelos.Maestros;

import lombok.*;

import java.util.List;

import es.leoneliker.LogBite.Enums.EnumEstado;
import es.leoneliker.LogBite.Modelos.IngredienteDespensa;
import es.leoneliker.LogBite.Modelos.IngredienteReceta;
import jakarta.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IngredienteMaestro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngredienteMaestro;
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private EnumEstado estado = EnumEstado.ACTIVO;

    @OneToMany(mappedBy = "ingredienteMaestro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<IngredienteDespensa> ingredientesDespensa;

    @OneToMany(mappedBy = "ingredienteMaestro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<IngredienteReceta> ingredientesReceta;

}