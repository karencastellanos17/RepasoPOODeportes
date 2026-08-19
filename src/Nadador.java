public class Nadador extends Deportista {

    private double distancia;
    private double tiempo;
    private String estilo;

    public Nadador() {
    }

    public Nadador(String luan, double distancia, String estilo, int i1, int i, double tiempo, String libre) {
        this.distancia = distancia;
        this.estilo = estilo;
        this.tiempo = tiempo;
    }

    public Nadador(int edad, int horasEntrenamiento, String nombre, String pais, double distancia, String estilo, double tiempo) {
        super(edad, horasEntrenamiento, nombre, pais);
        this.distancia = distancia;
        this.estilo = estilo;
        this.tiempo = tiempo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Nadador{" +
                "distancia=" + distancia +
                ", tiempo=" + tiempo +
                ", estilo='" + estilo + '\'' +
                ", edad=" + edad +
                ", horasEntrenamiento=" + horasEntrenamiento +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }


    public double calcularVelocidad(){

        double porcentaje;
        switch (estilo.toLowerCase()){

            case "Libre":

                porcentaje=0.10;
                break;

            case "Espalda":

                porcentaje= 0.8;
                break;

            case "Pecho":

                porcentaje=0.6;
                break;

            case "Mariposa":
                porcentaje = 0.12;
                break;

            default:
                porcentaje=0;
                break;
        }
        return porcentaje;
    }
    public double calcularRendimientoBase(){

        return calcularVelocidad()* horasEntrenamiento;

    }

    @Override
    public double calcularRendimiento() {

        double rendimientoBase=calcularRendimientoBase();
        double bono = rendimientoBase* 0.12;


       return rendimientoBase + bono;
    }

}
