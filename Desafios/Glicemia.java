package Desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Glicemia {
    public static void main(String[] args) {
        //gerar n valor de glicemia entre 50 e 240
        //Aplicar a media
        //aplicar a mediana, ordenar e pegar o numero do meio
        //aplicar a moda

        ArrayList<Integer> lista = new ArrayList<>();
        int numeros;
        float media = 0;
        float soma = 0;
        int mediana = 0;
         

        Random gerador = new Random();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos numeros voce quer adicionar?: ");
        numeros = teclado.nextInt();

        for (int i = 0; i < numeros; i++) {
            lista.add(gerador.nextInt(50, 240));
            soma = soma + lista.get(i);
        }

        int n = lista.size();
        media = soma / numeros;
        int meio = n / 2;
        System.out.println(meio);

        
        System.out.println(soma);
        System.out.println("Media da glicemia: " + media);

        Collections.sort(lista);
        System.out.println(lista);

        if (numeros % 2 != 0) {
            mediana = lista.get(meio);
        }else{
            mediana = (lista.get(meio) + lista.get(meio - 1)) / 2;
        }

        System.out.println("Mediana: " + mediana);

        for (int i = 0; i < lista.size(); i++) {
            
        }

        teclado.close();
    }
}
