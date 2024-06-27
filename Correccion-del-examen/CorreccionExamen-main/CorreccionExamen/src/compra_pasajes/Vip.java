package compra_pasajes;

public abstract class Vip extends Servicio {
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
    public abstract double calcularCosto();
}
