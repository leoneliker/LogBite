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

    private String nombre;

    @Column(nullable = true)
    private String apellidos;

    @Column(nullable = true)
    private String apodo;

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