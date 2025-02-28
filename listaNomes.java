import java.util.ArrayList;
import java.util.Scanner;

public class listaNomes {
    public static void main(String[] args) {
        //Construir um programa em java que receba via teclado do usuario n nomes de pessoas; 
        //Assim como o primeiro codigo nao podera haver nomes duplicados; 
        //Ao final do cadastro a lista precisara ser ordenada; 
        //O codigo deve permitir que o usuario digite um nome de pessoa para pesquisa e o programa exclua esse nome da lista; 
        //Exiba novamente a lista

        ArrayList<String> listaNomes = new ArrayList<>();
        int numeroPessoas;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos nomes voce quer cadastrar? ");
        numeroPessoas = teclado.nextInt();

        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Digite o nome: ");
            String nome = teclado.nextLine();
            teclado.nextLine();
            nome.toLowerCase();
            if (!listaNomes.contains(nome) || !nome.isEmpty()) {
                listaNomes.add(nome);
            }
        }

        listaNomes.sort(null);
        System.out.println(listaNomes);
        
        teclado.close();
    }
}
