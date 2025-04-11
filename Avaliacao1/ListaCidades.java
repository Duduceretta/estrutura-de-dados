package Avaliacao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cidade {
    String nomeCidade;
    String siglaEstado;
    
    public Cidade(String nomeCidade, String siglaEstado) {
        this.nomeCidade = nomeCidade;
        this.siglaEstado = siglaEstado;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    @Override
    public String toString() {
        return "Cidade [nomeCidade=" + nomeCidade + ", siglaEstado=" + siglaEstado + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeCidade == null) ? 0 : nomeCidade.hashCode());
        result = prime * result + ((siglaEstado == null) ? 0 : siglaEstado.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cidade other = (Cidade) obj;
        if (nomeCidade == null) {
            if (other.nomeCidade != null)
                return false;
        } else if (!nomeCidade.equals(other.nomeCidade))
            return false;
        if (siglaEstado == null) {
            if (other.siglaEstado != null)
                return false;
        } else if (!siglaEstado.equals(other.siglaEstado))
            return false;
        return true;
    }

}

public class ListaCidades {
    static void cadastrar(List<Cidade> cidades){
        String nome, estado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome cidade: ");
        nome = teclado.nextLine().toUpperCase();
        System.out.println("Estado Cidade: ");
        estado = teclado.nextLine().toUpperCase();

        Cidade tmp = new Cidade(nome, estado);
        if (!cidades.contains(tmp)) {
            cidades.add(tmp);
        }
        teclado.close();
    }

    static void listar(List<Cidade> cidades){
        for (Cidade cidade : cidades) {
            System.out.println(cidade);
        }
    }

    static void pesquisar(List<Cidade> cidades){
        //String nome, estado;
        //Scanner teclado =  new Scanner(System.in);

        //System.out.println("Nome cidade: ");
        //nome = teclado.nextLine();
        //List<cidades> respostas =  new ArrayList<>();
        
        //for (Cidades cidade : cidades) {
            //if(nome.equals(cidade.nome)){
               // respostas.add(cidade)
            //}
        //}

       // if (!respostas.isEmpty()) {
            
       // }
    }

    public static void main(String[] args) {
        List<Cidade> cidades = new ArrayList<>();
        int opcao;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("1 - cadastrar");
            System.out.println("2 - listar");
            System.out.println("3 - pesquisar por cidade");
            System.out.println("4 - remover por cidade");
            System.out.println("5 - finalizar");
            System.out.println("opcao: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    ListaCidades.cadastrar(cidades);
                    break;
                case 2:
                    ListaCidades.listar(cidades);
                    break;
                case 3:
                    //ListaCidades.pesquisar(cidades);
                    break;
                case 4:
                    //ListaCidades.remover(cidades);
                    break;
                default:
                    System.out.println("Opcao nao encontrada");
                    break;
            }
        } while (opcao != 5);

        teclado.close();
    }    
}
