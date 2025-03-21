package Avaliacoes;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaObjeto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        //int matricula;
        //String nome;
        //Aluno tmp;

        for (int i = 0; i < 3; i++) {
            
            System.out.println("Matricula: ");
            //matricula = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Nome: ");
            //nome = teclado.nextLine();
            //tmp = new Aluno(matricula, nome);

            //alunos.add(tmp);
        }

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        teclado.close();
    }
}
