public abstract class Deportista {

    protected String nombre;
    protected  int edad;
    protected  String pais;
    protected int horasEntrenamiento;

    public Deportista() {
    }

    public Deportista(int edad, int horasEntrenamiento, String nombre, String pais) {
        this.edad = edad;
        this.horasEntrenamiento = horasEntrenamiento;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHorasEntrenamiento() {
        return horasEntrenamiento;
    }

    public void setHorasEntrenamiento(int horasEntrenamiento) {
        this.horasEntrenamiento = horasEntrenamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    @Override
    public String toString() {
        return "Deportista{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", horasEntrenamiento=" + horasEntrenamiento +
                '}';
    }


    public void mostrarInformación(){
        System.out.println("Nombre" + nombre);
        System.out.println(" Edad" + edad);
        System.out.println( "Pais" + pais);
        System.out.println("Horas Entrenamiento" + horasEntrenamiento);
    }


    public abstract double calcularRendimiento ();

    }




