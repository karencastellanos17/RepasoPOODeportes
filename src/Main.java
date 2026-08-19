import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Deportista> lstDeportistas = new ArrayList<>();

        Corredor corredor1 = new Corredor(28, 26, "Colombia", "JUAN", 3.45,15.5);
        Ciclista ciclista1 = new Ciclista(65, 24, "España", "ANA", 123.5, 80,5.9  );
        Nadador nadador1= new Nadador("LUAN", 22, "Francia", 58, 32,12.6, "Libre" );

        lstDeportistas.add(corredor1);
        lstDeportistas.add(ciclista1);
        lstDeportistas.add(nadador1);

        for (Deportista d1: lstDeportistas){

            System.out.println(d1);
        }
    }
}