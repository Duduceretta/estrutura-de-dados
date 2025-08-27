package Desafios;

import java.util.ArrayList;
import java.util.Random;

//criar um método recursivo que exibe somente os números pares
//criar um código java com lista recursiva
 
//esta lista deve armazenar objetos do tipo aluno com matricula e nome..... contudo, o número de matrícula deve ser sorteado
 
//uma vez que o aluno com matricula e nome for gerado, armazenar em uma //lista..... esta rotina deve estar em um método recursivo

public class ListaRecursiva {
    static Random gerador = new Random();
    static int numero;

    public static void popularR(ArrayList<Integer> lista, int tamanho) {
        if (tamanho > 0) {
            numero = gerador.nextInt(20);
            if (!lista.contains(numero)) {
                lista.add(numero);
            }
            popularR(lista, tamanho - 1);
        }
    }

    public static void exibir(ArrayList<Integer> lista) {
        for (Integer numero : lista) {
            System.out.print(numero + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        popularR(lista, 10);
        exibir(lista);
    }
}