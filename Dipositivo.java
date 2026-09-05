
public abstract class Dispositivo {


    private String nombrePropietario;
    private String marca;
    private String numeroSerie;
    private boolean dentroDeLaInstitucion;

    public Dispositivo(String nombrePropietario, String marca, String numeroSerie) {
        this.nombrePropietario = nombrePropietario;
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.dentroDeLaInstitucion = false;
    }


    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public boolean isDentroDeLaInstitucion() {
        return dentroDeLaInstitucion;
    }

    public void registrarEntrada() {
        this.dentroDeLaInstitucion = true;
        System.out.println(nombrePropietario + " registró su entrada con: " + marca);
    }

    public void registrarSalida() {
        this.dentroDeLaInstitucion = false;
        System.out.println(nombrePropietario + " registró su salida con: " + marca);
    }


    public abstract String obtenerAccesorios();


    public void mostrarInformacion() {
        System.out.println("----------------------------------------");
        System.out.println("Propietario: " + nombrePropietario);
        System.out.println("Marca: " + marca);
        System.out.println("N° Serie: " + numeroSerie);
        System.out.println("Accesorios: " + obtenerAccesorios());
        System.out.println("Dentro de la institución: " + dentroDeLaInstitucion);
    }
}