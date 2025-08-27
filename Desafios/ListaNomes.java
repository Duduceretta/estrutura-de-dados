package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        //Construir um programa em java que receba via teclado do usuario n nomes de pessoas; 
        //Assim como o primeiro codigo nao podera haver nomes duplicados; 
        //Ao final do cadastro a lista precisara ser ordenada; 
        //O codigo deve permitir que o usuario digite um nome de pessoa para pesquisa e o programa exclua esse nome da lista; 
        //Exiba novamente a lista

        ArrayList<String> listaNomes = new ArrayList<>();
        int numeroPessoas;
        String nomePesquisa;

        //Pergunta quantos nomes o usuario quer adicionar na lista
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos nomes voce quer cadastrar? ");
        numeroPessoas = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Digite o nome: ");
            String nome = teclado.nextLine().toLowerCase();

            //verifica se o nome nao esta na lista
            if (!listaNomes.contains(nome) && !nome.isEmpty()) {
                listaNomes.add(nome);
            }
        }

        //ordena a lista
        listaNomes.sort(null);
        
        //Lista os nomes
        System.out.println("Mostrando a lista");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
        
        //Pede o nome para pesquisar na lista
        System.out.println("Agora digite um nome para pesquisa na lista: ");
        nomePesquisa = teclado.nextLine().toLowerCase();

        //Verifica se o nome foi removido ou nao
        if (listaNomes.remove(nomePesquisa)) {
            System.out.println("Nome removido com sucesso");
        }else{
            System.out.println("Nome nao encontrado");
        }

        System.out.println("Mostrando a lista");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        teclado.close();
    }
}
