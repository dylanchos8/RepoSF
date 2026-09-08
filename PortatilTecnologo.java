public class PortatilTecnologo extends Dispositivo {

    private String numeroFicha;
    private int trimestre;

    public PortatilTecnologo(String nombrePropietario, String marca, String numeroSerie, String numeroFicha, int trimestre) {
        super(nombrePropietario, marca, numeroSerie);
        this.numeroFicha = numeroFicha;
        this.trimestre = trimestre;
    }
    @Override
    public String obtenerAccesorios() {
        return "Cargador del portátil (Programa Tecnólogo - Ficha: " + numeroFicha + ", Trimestre: " + trimestre + ")";
    }
}
