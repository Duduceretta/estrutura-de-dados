package Avaliacoes;
import java.util.ArrayList;
import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        String nomeCompleto;
        Scanner teclado = new Scanner(System.in);
        String vetorNome[];
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno tmp;
        String resposta;
        int contador = 1;
        String email2, email;

        while (true) {
            //Valida se o nome foi digitado completo
            do {
                System.out.println("Nome completo: ");
                nomeCompleto = teclado.nextLine();
                nomeCompleto = nomeCompleto.toUpperCase();
                vetorNome = nomeCompleto.split(" ");
            } while (vetorNome.length < 2);

            //Monta o email
            email = vetorNome[0] + "." + vetorNome[vetorNome.length - 1] + "@ufn.edu.br"; 
            email = email.toLowerCase();
            tmp = new Aluno(email, nomeCompleto);

            boolean existe = false;

            for (Aluno aluno : alunos) {
                if (aluno.getEmail().equalsIgnoreCase(email)) {
                    existe = true;
                    break;
                }
            }

            if (existe) {
                email2 = vetorNome[0] + "." + vetorNome[vetorNome.length - 1] + contador + "@ufn.edu.br"; 
                email2 = email2.toLowerCase();
                tmp = new Aluno(email2, nomeCompleto);
                contador++;
            } else {
                tmp = new Aluno(email, nomeCompleto);
            }      

            alunos.add(tmp);
              
            //Condicao para o usuario continuar digitando os nomes
            System.out.println("Deseja continuar? (S/N): ");
            resposta = teclado.nextLine().toUpperCase().strip();
            while (!resposta.equals("S") && !resposta.equals("N")) {
                System.out.println("Comando invalido. Deseja continuar? (S/N): ");
                resposta = teclado.nextLine().toUpperCase().strip();
            }

            //Caso a resposta for "N" para o codigo
            if (resposta.equals("N")) {
                break;
            }

        }
        
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        teclado.close();
    }

}
