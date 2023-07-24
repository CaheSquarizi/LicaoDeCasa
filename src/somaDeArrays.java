import java.util.ArrayList;
//gerador de números aleatórios.
import java.util.Random;

public class somaDeArrays {




    public static void main(String[] args) {

        int limite = 10;
        ArrayList<Integer> numeros = new ArrayList<Integer>(limite);
        int total = 0;
        Random gerador = new Random(limite);
        int numeroGerado;


        System.out.println("A lista tem " + limite + " números.\n");
            for (int i = 0; i < limite; i++) {
                numeroGerado = gerador.nextInt(100) + 1;
                numeros.add(i, numeroGerado);
                System.out.println(numeros.get(i));
                total += numeros.get(i);
            }
        System.out.println("\nA soma dos números da lista é " + total);
    }



}