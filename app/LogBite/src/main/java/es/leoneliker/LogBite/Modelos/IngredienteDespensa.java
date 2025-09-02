package es.leoneliker.LogBite.Modelos;

import java.util.Date;

import es.leoneliker.LogBite.Modelos.Maestros.IngredienteMaestro;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ingredienteDespensa", uniqueConstraints = @UniqueConstraint(columnNames = { "idDespensa",
        "idIngredienteMaestro" }))

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IngredienteDespensa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngredienteDespensa;
    private Double cantidad;
    private String unidad;

    @Column(nullable = true)
    private Date fechaCaducidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idIngredienteMaestro")
    private IngredienteMaestro ingredienteMaestro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDespensa")
    private Despensa despensa;
}
