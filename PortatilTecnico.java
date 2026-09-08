package org.example;

public class PortatilTecnico extends Dispositivo{
    public PortatilTecnico(String nombrePropietario, String marca, String numeroSerie, String numeroFicha) {
        // super(...) llama al constructor de la clase padre (Dispositivo)
        super(nombrePropietario, marca, numeroSerie);
        this.numeroFicha = numeroFicha;
    }

    @Override
    public String obtenerAccesorios() {
        return "Cargador del portátil (Programa Técnico - Ficha: " + numeroFicha + ")";
    }



}
