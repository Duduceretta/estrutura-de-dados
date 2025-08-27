package Desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MesmaLista {
    public static void main(String[] args) {
        //Lista 1 com n numeros aleatorios (0, 100) sem repetidos, tamanho n
        //Lista 2 com n num aleatorios (0, 100) sem repetidos, tamanho n
        //Lista 3 numeros comuns nas duas listas

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> lista3 = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
        int tamanho, numeroGerado;

        System.out.println("Quantos numeros voce quer digitar?: ");
        tamanho = teclado.nextInt();
        //System.out.println("Ate qual valor voce quer os numeros?: ");
        //tamanho = teclado.nextInt();

        for (int i = 0; i < tamanho; i++) {
            numeroGerado = gerador.nextInt(0, 100);
            if (!lista1.contains(numeroGerado)) {
                lista1.add(numeroGerado);
            }else{
                i = i - 1;
            }
        }
        
        Collections.sort(lista1);
        System.out.println(lista1);
        
        for (int i = 0; i < tamanho; i++) {
            numeroGerado = gerador.nextInt(0, 100);
            if (!lista2.contains(numeroGerado)) {
                lista2.add(numeroGerado);
            }else{
                i = i - 1;
            }
        }

        
        Collections.sort(lista2);

        lista1.retainAll(lista2);
        
        for (int i = 0; i < lista1.size(); i++) {           
            lista3.add(lista1.get(i));  
        }

        Collections.sort(lista3);

        
        System.out.println(lista2);
        System.out.println(lista3);

        teclado.close();

    }
}
