package es.leoneliker.LogBite.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumTipoRegistro {
    DESAYUNO(1, "Desayuno"),
    ALMUERZO(2, "Almuerzo"),
    COMIDA(3, "Comida"),
    MERIENDA(4, "Merienda"),
    CENA(5, "Cena"),
    SNACK(6, "Snack"),
    OTRO(7, "Otro");

    private final int id;
    private final String nombre;
}
