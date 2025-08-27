package Aula0328.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Aluno tmp;
        String nome;
        int matricula = 1;
        String opcao;
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Digite nome: ");
            nome = teclado.nextLine().toUpperCase();
            tmp = new Aluno(matricula, nome);
            if (alunos.contains(tmp)) {
                System.out.println("Email ja cadastrado");
            }else{
                alunos.add(tmp);
                System.out.println("Aluno cadastrado com a matricula "+ matricula +" e email "+tmp.email);
                matricula++;
            }

            System.out.println("Continuar? (1 - Sim, Outra tecla - Nao)");
            opcao = teclado.nextLine();

            if (!opcao.equals("1")) {
                break;
            }
        };

        alunos.sort((a1, a2) -> a1.nome.compareTo(a2.nome));

        System.out.println("Relacao Alunos");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        teclado.close();
    }
}
