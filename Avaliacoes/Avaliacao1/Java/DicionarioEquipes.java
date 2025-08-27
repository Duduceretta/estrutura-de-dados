package Avaliacoes.Avaliacao1.Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DicionarioEquipes {
    public static void main(String[] args) {
        //nome, cidade
        Map<String, String> equipes =  new HashMap<String, String>();
        
        String nome, cidade, opcao;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Nome equipe: ");
            nome = teclado.nextLine().toUpperCase();
            System.out.println("Nome cidade: ");
            cidade = teclado.nextLine().toUpperCase();

            if (!equipes.containsKey(nome)) {
                equipes.put(nome, cidade);
            }else{
                System.out.println("Equipe ja cadastrada");
            }
            

            System.out.println("1 -  continua, Outra tecla encerra");
            opcao = teclado.nextLine();

            if (!opcao.equals("1")) {
                break;
            }

        } while (true);

        for (Map.Entry<String, String> equipe : equipes.entrySet()) {
            System.out.println(equipe.getKey() + ": " + equipe.getValue());
        }

        teclado.close();

    }
}
