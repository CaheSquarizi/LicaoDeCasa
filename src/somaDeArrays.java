import java.util.ArrayList;
import java.util.Scanner;
//gerador de números aleatórios.
import java.util.Random;

public class somaDeArrays {




    public static void main(String[] args) {

        int limite = 10;
        ArrayList<Integer> numeros = new ArrayList<>(limite);
        int total = 0;
        Random gerador = new Random((int) Math.random());
        int numeroGerado;


        System.out.println("A lista tem " + limite + " números.\n");
            for (int i = 0; i < limite; i++) {
                numeroGerado = gerador.nextInt(100) + 1;
                numeros.add(i, numeroGerado);
                System.out.println(numeros.get(i));
                total += numeros.get(i);
            }
        System.out.println("\nA soma dos números da lista é " + total);



        System.out.println("\nAgora é sua vez! Digite 10 números para nossa lista.");

            int[] listaNumeros = new int[limite];
            Scanner lerNumero = new Scanner(System.in);
            int num;
            int cont = 0;
            int novoTotal = 0;

        while (cont < 10) {
            System.out.println("Digite um número:");
            num = lerNumero.nextInt();
            listaNumeros[cont] = num;
            novoTotal += num;
            cont++;
        }
        lerNumero.close();
       System.out.println("O novo valor total é : " + novoTotal);
    //   System.out.println("Os números da lista são: ");


    }
}