package es.leoneliker.LogBite.Modelos;

import es.leoneliker.LogBite.Enums.EnumTipoRegistro;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistroCalendario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegistroCalendario;

    private LocalDateTime fecha;

    @Enumerated(EnumType.STRING)
    private EnumTipoRegistro tipo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "registroCalendario", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @Builder.Default
    private List<RegistroComida> registroComidas = new ArrayList<>();
}
