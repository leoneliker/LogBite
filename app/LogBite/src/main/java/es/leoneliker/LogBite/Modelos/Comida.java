package es.leoneliker.LogBite.Modelos;

import es.leoneliker.LogBite.Modelos.Maestros.RecetaMaestro;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComida;

    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idRecetaMaestro", nullable = true)
    private RecetaMaestro recetaMaestro; // Puede ser null

    @OneToMany(mappedBy = "comida", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @Builder.Default
    private List<RegistroComida> registroComidas = new ArrayList<>();
}
