import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class lista {
    public static void main(String[] args) {
        //Codigo que popula uma lista com n numeros aleatorios inteiros
        //Pesquisar a diferença entre vector. arraylist e linkedList
        //Construir exemplos
        ArrayList<Integer> lista = new ArrayList<>();

        Random gerador = new Random();
        Integer numero;

        //Insere na lista
        int tamanho = gerador.nextInt(10, 20);
        for (int i = 0; i < tamanho; i++) {
            numero = gerador.nextInt(1000);
            //Verifica se o numero nao esta na lista, controle de duplicados
            if (!lista.contains(numero)) {
                lista.add(numero);
            }         
        }

        //Exibicao
        //System.out.println("Exibindo por indices");
        //for (int i = 0; i < lista.size(); i++) {
            //System.out.println(lista.get(i));
        //}

        lista.sort(null);
        System.out.println("Total de objetos " + lista.size());
        System.out.println("Exibindo por objetos");
        for (Integer i : lista) {
            System.out.println(i);
        }

        numero = 15;
        if(lista.remove(numero)){
            System.out.println("Numero removido com sucesso");
        }else{
            System.out.println("Numero nao encontrado");
        }
        

        //System.out.println("Iterador");
        //Iterator<Integer> iterator = lista.iterator();
        //while (iterator.hasNext()) {
            //numero = iterator.next();
            //System.out.println(numero);
        //}

        for (int i = 0; i < lista.size(); i++) {
            if (i % 2 == 0) {
                lista.set(i, -1);
            }
        }

        //while (iterator.hasNext()) {
            //Integer i = iterator.next();
            //if (i % 2 != 0) {
                //lista.set(index, -1);
            //}
            //index++;
        //}

        Scanner teclado = new Scanner(System.in);

        //Em java como colocar maiusculo um nome antes de armazena-lo na lista
        for (Integer i : lista) {
            System.out.println(i);
        }

        teclado.close();
    }
}