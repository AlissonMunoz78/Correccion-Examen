package compra_pasajes;

public abstract class Servicio {
    private boolean television;
    private boolean internet;
    private double precioBase;

    public Servicio() {
    }

    public Servicio(double precioBase) {
        this.precioBase = precioBase;
    }

    public Servicio(boolean television, boolean internet) {
        this.television = television;
        this.internet = internet;
        calcularPrecioBase();
    }

    public boolean isTelevision() {
        return television;
    }

    public void setTelevision(boolean television) {
        this.television = television;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public abstract double calcularCosto();

    private void calcularPrecioBase() {
        if (television) {
            precioBase += 50;
        }
        if (internet) {
            precioBase += 150;
        }
    }
}
