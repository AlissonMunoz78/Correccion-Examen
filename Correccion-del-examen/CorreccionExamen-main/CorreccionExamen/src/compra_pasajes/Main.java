package compra_pasajes;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de Ticket Normal
        Ruta ruta1 = new Ruta("Quito", "Guayaquil", 20);
        Pasajero pasajero1 = new Pasajero("Alisson Muñoz", 20);
        Normal ticketNormal = new Normal(true, false, "ventana", true);
        Tickets ticket1 = new Tickets(ruta1, ticketNormal, pasajero1, ticketNormal.calcularCosto());

        System.out.println("Ejemplo de Ticket Normal:");
        ticket1.imprimirDatos();

        // Ejemplo de Ticket VIP
        Ruta ruta2 = new Ruta("Quito", "Puyo", 15);
        Pasajero pasajero2 = new Pasajero("Tyron Iza", 21);
        Vip ticketVip = new Vip(true, true, true, false);
        Tickets ticket2 = new Tickets(ruta2, ticketVip, pasajero2, ticketVip.calcularCosto());

        System.out.println("\nEjemplo de Ticket VIP:");
        ticket2.imprimirDatos();
    }
}
