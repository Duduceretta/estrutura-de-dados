import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class lista {
    public static void main(String[] args) {
        //codigo que popula uma lista com n numeros aleatorios inteiros
        //Pesquisar a diferença entre vector. arraylist e linkedList
        ArrayList<Integer> lista = new ArrayList<>();

        Random gerador = new Random();
        int numero;

        //Insere na lista
        int tamanho = gerador.nextInt(10, 20);
        for (int i = 0; i < tamanho; i++) {
            numero = gerador.nextInt(1000);
            lista.add(numero);
        }

        //Exibicao
        System.out.println("Exibindo por indices");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("Exibindo por objetos");
        for (Integer i : lista) {
            System.out.println(i);
        }

        System.out.println("Iterador");
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            numero = iterator.next();
            System.out.println(numero);
        }
    }
}