package es.leoneliker.LogBite.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumDieta {
    OMNIVORA(1, "Omnívora"),
    VEGETARIANA(2, "Vegetariana"),
    VEGANA(3, "Vegana"),
    PESCETARIANA(4, "Pescetariana"),
    CELIACA(5, "Celíaca"),
    LACTOVEGETARIANA(6, "Lacto-Vegetariana"),
    OVOVEGETARIANA(7, "Ovo-Vegetariana"),
    DIETA_KETOGENICA(8, "Dieta Cetogénica"),
    PALEO(9, "Dieta Paleo"),
    SIN_AZUCAR(10, "Sin Azúcar"),
    BAJA_EN_CARBOHIDRATOS(11, "Baja en Carbohidratos"),
    BAJA_EN_SODIO(12, "Baja en Sodio"),
    SIN_LACTOSA(13, "Sin Lactosa");

    private final int id;
    private final String nombre;
}
