package v1trifi;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author aldah
 */
public class V1TriFi {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws IOException{
        // Declaración de variables
        int numero;
        int mult3;
        int mult5;
        BufferedReader buffentrada = new BufferedReader(new InputStreamReader(System.in));
        //Entrada de datos 
        System.out.println("Ingresa un número");
        numero = Integer.parseInt(buffentrada.readLine());
        //Procesamiento de datos 
        mult3 = numero % 3;
        mult5 = numero % 5;
        //salida de datos
        if (mult3 == 0){ System.out.println("tri");}
        if (mult5 == 0){System.out.println("fiv");}
        if (mult3 == 0 && mult5 == 0){System.out.println("trifi");}
    }
    
}
