package compra_pasajes;

public class Vip extends Servicio {
    private boolean maletaExt;
    private boolean dosMaletas;

    public Vip() {
        super();
    }

    public Vip(boolean television, boolean internet) {
        super(television, internet);
    }

    public Vip(boolean asiento, boolean internet, boolean maletaExt, boolean dosMaletas) {
        super(asiento, internet);
        this.maletaExt = maletaExt;
        this.dosMaletas = dosMaletas;
    }

    public boolean isMaletaExt() {
        return maletaExt;
    }

    public void setMaletaExt(boolean maletaExt) {
        this.maletaExt = maletaExt;
    }

    public boolean isDosMaletas() {
        return dosMaletas;
    }

    public void setDosMaletas(boolean dosMaletas) {
        this.dosMaletas = dosMaletas;
    }

    @Override
    public double calcularCosto() {
        double costo = super.getPrecioBase();

        if (super.isTelevision()) {
            costo += 50;
        }
        if (super.isInternet()) {
            costo += 150;
        }

        return costo;
    }
}
