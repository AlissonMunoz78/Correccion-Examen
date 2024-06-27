package compra_pasajes;

public class Normal extends Servicio {
    private String asiento;
    private boolean maletaExt;

    public Normal() {
    }

    public Normal(boolean television, boolean internet) {
        super(television, internet);
    }

    public Normal(String asiento, boolean maleta) {
        this.asiento = asiento;
        this.maletaExt = maleta;
    }

    public Normal(boolean television, boolean internet, String asiento, boolean maleta) {
        super(television, internet);
        this.asiento = asiento;
        this.maletaExt = maleta;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public boolean isMaleta() {
        return maletaExt;
    }

    public void setMaleta(boolean maleta) {
        this.maletaExt = maleta;
    }

    @Override
    public double calcularCosto() {
        double costo = super.getPrecioBase();
        if ("ventana".equals(asiento)) {
            costo += 25;
        } else if ("pasillo".equals(asiento)) {
            costo += 20;
        } else if ("al final".equals(asiento)) {
            costo += 15;
        } else if ("adelante".equals(asiento)) {
            costo += 10;
        }
        if (maletaExt) {
            costo += 5;
        }
        return costo;
    }
}
