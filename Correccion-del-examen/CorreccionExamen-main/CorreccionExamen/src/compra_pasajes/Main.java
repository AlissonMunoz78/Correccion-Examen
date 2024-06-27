package compra_pasajes;

public class Main {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("Tyron Iza", 30);
        Pasajero pasajero2 = new Pasajero();

        Ruta ruta1 = new Ruta("Ciudad A", "Ciudad B", 200.0);
        Ruta ruta2 = new Ruta(null, null, 0.0);


        Normal servicioNormal1 = new Normal("ventana", true);
        Normal servicioNormal2 = new Normal(false, false);


        Tickets ticket1 = new Tickets(ruta1, servicioNormal1, pasajero1, servicioNormal1.calcularCosto());
        Tickets ticket2 = new Tickets(ruta2, servicioNormal2, pasajero2, 0.0);

        ticket1.imprimirDatos();
        System.out.println();
        ticket2.imprimirDatos();
    }
}
