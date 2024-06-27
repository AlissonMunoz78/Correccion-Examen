package compra_pasajes;

public class Tickets {
    private Ruta ruta;
    private Servicio servicio;
    private Pasajero pasajero;
    private double costo;

    public Tickets(Ruta ruta, Servicio servicio, Pasajero pasajero, double costo) {
        this.ruta = ruta;
        this.servicio = servicio;
        this.pasajero = pasajero;
        this.costo = costo;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double calcularCosto() {
        double precioBase = servicio.getPrecioBase();
        return precioBase;
    }

    public void imprimirDatos() {
        System.out.println("Ruta: " + ruta.getOrigen() + " - " + ruta.getDestino());
        System.out.println("Servicio: " + servicio.getClass().getSimpleName());
        System.out.println("Pasajero: " + pasajero.getNombre() + ", Edad: " + pasajero.getEdad());
        System.out.println("Costo: $" + costo);
    }
}

