public class Main {
    public static void main(String[] args) {

   
        PortatilTecnico portatilTecnico = new PortatilTecnico("Juan Pérez", "HP", "SN-001", "2589634");
        PortatilTecnologo portatilTecnologo = new PortatilTecnologo("María Gómez", "Dell", "SN-002", "2589700", 3);


        Dispositivo[] dispositivos = { portatilTecnico, portatilTecnologo };

        for (Dispositivo d : dispositivos) {
            d.registrarEntrada(); 
            d.mostrarInformacion(); 
        }

        System.out.println("----------------------------------------");
        dispositivos[0].registrarSalida();
    }
}
