
import java.util.Arrays;
import java.util.List;


/**
 * Created by jpere on 23/01/2017.
 */

public class Application {

    public static void main(String[] args) {
        int nivelUsuario = 12;
        int max = 6;
        List<Integer> repLevels = Arrays.asList(4, 5, 6);
        if (nivelUsuario <= max) {
            int reward = nivelUsuario;
            System.out.println("El nivel de recompensa es: " + reward);
        } else {
            int cont = nivelUsuario - max;
            while (cont > repLevels.size()) {
                cont = cont - repLevels.size();
            }
            System.out.println("El nivel de recompensa es: " + repLevels.get(cont - 1));
        }


/*   public static void main(String[] args) {
        int nivelUsuario = 12;
        int max = 6;
        List<Integer> repLevels = Arrays.asList(4, 5, 6);
        if (nivelUsuario <= max) {
            int reward = nivelUsuario;
            System.out.println("nivel Reward: " + reward);
        } else {
            int resto = nivelUsuario % max;
            System.out.println("Resto: " + resto);
            System.out.println("El nivel de recompensa es: " + repLevels.get(resto - 1));
        }
    } */

    }
}