package Automovil;

public class Automovil implements Comparable<Automovil> {
    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Tanque tanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipoAutomovil;

    private static Color colorPatente = Color.NARANJO;
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoid;
    private static int indiceRuedas = 0;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 30;

    public static final String COLOR_ROJO = "ROJO";
    public static final String COLOR_AMARILLO = "AMARILLO";
    public static final String COLOR_AZUL = "AZUL";
    public static final String COLOR_BLANCO = "BLANCO";
    public static final String COLOR_GRIS = "GRIS OSCURO";

    public Automovil() {
        this.id = ++ultimoid;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque) {
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, tanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        if (tanque == null) {
            this.tanque = new Tanque();
        }
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getPersona() {
        return conductor;
    }

    public void setPersona(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public Automovil addRueda(Rueda rueda) {
        if (indiceRuedas < this.ruedas.length) {
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    public String verDetalle() {
        String detalle = "auto.id = " + this.id
                + "\nauto.fabricante = " + this.getFabricante()
                + "\nauto.modelo = " + this.getModelo();

        if (this.getTipoAutomovil() != null) {
            detalle += "\ntipoAutomovil = " + this.getTipoAutomovil().getDescripcion();
        }

        detalle += "\nauto.color = " + this.color +
                "\nauto.patenteColor = " + colorPatente;

        if (this.motor != null) {
            detalle += "\nauto.cilindrada = " + this.motor.getCilindrada();
        }

        if (conductor != null) {
            detalle += "\nConductor subaru: " + this.getPersona();
        }

        if (getRuedas() != null) {
            detalle += "\nruedas = ";
            for (Rueda rueda : this.getRuedas()) {
                detalle += "\n" + rueda.getFabricante() + ", aro: " + rueda.getAro() + ", ancho: " + rueda.getAncho();
            }
        }

        return detalle;
    }

    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (this.getTanque().getCapacidad() * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (this.getTanque().getCapacidad() * (porcentajeBencina / 100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencina) {
        return km / (Automovil.capacidadTanqueEstatico * (porcentajeBencina / 100f));
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Automovil)) return false;

        Automovil other = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null)
                && this.fabricante.equals(other.getFabricante())
                && this.modelo.equals(other.getModelo());
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'';
    }

    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }
}
