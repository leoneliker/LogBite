package es.leoneliker.LogBite.Modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistroComida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegistroComida;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idRegistroCalendario", nullable = false)
    private RegistroCalendario registroCalendario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idComida", nullable = false)
    private Comida comida;

    private Integer cantidad; // Ej: 2 flanes, 1 merluza

    private String tipoPlato; // Ej: "primero", "segundo", "postre" (opcional, si quieres normalizarlo: usar enum)
}
