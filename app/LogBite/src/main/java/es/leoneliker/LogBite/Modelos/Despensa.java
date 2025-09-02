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
public class Despensa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDespensa;

    //TODO Fase 1.5: un usuario con varias casas/cocinas
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "despensa", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @Builder.Default
    private List<IngredienteDespensa> ingredientes = new ArrayList<>();
}
