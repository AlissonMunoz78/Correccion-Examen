package compra_pasajes;

public abstract class Servicio {
    private double precioBase;

    public Servicio() {
    }

    public Servicio(double precioBase) {
        this.precioBase = precioBase;
    }

    public Servicio(boolean television, boolean internet) {
        if (television) {
            this.precioBase = 50;
        }
        if (internet) {
            this.precioBase += 150;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public abstract double calcularCosto();
}
