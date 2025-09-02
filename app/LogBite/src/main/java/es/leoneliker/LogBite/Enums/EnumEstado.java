package es.leoneliker.LogBite.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumEstado {
    ACTIVO(1, "Activo"),
    INACTIVO(2, "Inactivo"); // Para no eliminar maestros y evitar dejar recetas huerfanas...

    private final int id;
    private final String nombre;
}
