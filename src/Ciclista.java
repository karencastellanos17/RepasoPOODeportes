public class Ciclista extends Deportista {

    private double distancia;
    private double tiempo;
    private double desnivel;


    public Ciclista() {
    }

    public Ciclista(double desnivel, double distancia, double tiempo) {
        this.desnivel = desnivel;
        this.distancia = distancia;
        this.tiempo = tiempo;
    }

    public Ciclista(int edad, int horasEntrenamiento, String nombre, String pais, double desnivel, double distancia, double tiempo) {
        super(edad, horasEntrenamiento, nombre, pais);
        this.desnivel = desnivel;
        this.distancia = distancia;
        this.tiempo = tiempo;
    }


    public double getDesnivel() {
        return desnivel;
    }

    public void setDesnivel(double desnivel) {
        this.desnivel = desnivel;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "desnivel=" + desnivel +
                ", distancia=" + distancia +
                ", tiempo=" + tiempo +
                ", edad=" + edad +
                ", horasEntrenamiento=" + horasEntrenamiento +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }


    public double calcularVelocidad(){
        return distancia/tiempo;

    }

    @Override
    public double calcularRendimiento() {

        double velocidad =calcularVelocidad();

        return (velocidad*horasEntrenamiento)+ (desnivel/100);
    }


    public void mostrarDetalles(){

        System.out.println("Distancia"+distancia);
        System.out.println("Tiempo" +tiempo);
        System.out.println("Desnivel" + desnivel);
    }

}
