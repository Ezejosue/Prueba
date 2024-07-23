package Automovil;

public class Rueda {
    private String Fabricante;
    private int aro;
    private double ancho;

    public Rueda(String Fabricante, int aro, double ancho) {
        this.Fabricante = Fabricante;
        this.aro = aro;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public int getAro() {
        return aro;
    }

    public double getAncho() {
        return ancho;
    }
}
