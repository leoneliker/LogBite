package es.leoneliker.LogBite.Modelos;

import lombok.*;
import jakarta.persistence.*;
import java.util.Date;
import es.leoneliker.LogBite.Enums.EnumDieta;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Perfil {
    @Id
    private Long idUsuario;

    @Column(nullable = true)
    private String preferencias;

    @Column(nullable = true)
    private String descripcion;

    @Enumerated(EnumType.STRING)
    private EnumDieta EnumDieta;

    private Date fecha_calendario;

    @OneToOne
    @MapsId
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
}