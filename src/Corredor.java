public class Corredor extends Deportista {

    private double distancia;
    private double tiempo;

    public Corredor() {
    }

    public Corredor(int edad, int horasEntrenamiento, String nombre, String pais, double distancia, double tiempo) {
        super(edad, horasEntrenamiento, nombre, pais);
        this.distancia = distancia;
        this.tiempo = tiempo;
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
        return "Corredor{" +
                "distancia=" + distancia +
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
    public double calcularRendimiento(){

        double velocidad = calcularVelocidad();

        return velocidad*horasEntrenamiento;
    }

    public void mostrarDetalles(){
        System.out.println("distancia"+ distancia);
        System.out.println("tiempo"+ tiempo);
    }
}
