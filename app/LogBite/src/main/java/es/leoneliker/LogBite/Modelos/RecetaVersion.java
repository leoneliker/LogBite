package es.leoneliker.LogBite.Modelos;

import java.util.Date;
import java.util.List;

import es.leoneliker.LogBite.Modelos.Maestros.RecetaMaestro;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecetaVersion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecetaVersion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idRecetaMaestro")
    private RecetaMaestro recetaMaestro;

    private Date fechaCreacion; //Cuanto mas nuevo, mas reciente es la version

    @Column(columnDefinition = "TEXT")
    private String instrucciones;

    @OneToMany(mappedBy = "recetaVersion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<IngredienteReceta> ingredientesReceta;
    
}
