package Aula0404.Java;
import java.util.ArrayList;

public class ListaDentroDeLista {
    public static void main(String[] args) {
        ArrayList<String> inteligenciaArtifical = new ArrayList<String>(); 
        ArrayList<String> redes = new ArrayList<String>(); 
        //ArrayList<Integer> lista3 = new ArrayList<>();
        ArrayList<ArrayList<String>> listaCienciaComputacao = new ArrayList<>();
        
        //Criar n listas representando as disciplinas do curso CC
        //Para cada lista colocar nomes de alunos
        //Criar a lista cienciaComputacao e add todas as listas de disciplinas
        //Mostrar o nome do aluno e qtas disciplinas ele cursa

        inteligenciaArtifical.add("Dudu");
        inteligenciaArtifical.add("Jose");
        inteligenciaArtifical.add("Bruno");
        inteligenciaArtifical.sort(null);
        listaCienciaComputacao.add(inteligenciaArtifical);

        redes.add("Jose");
        redes.add("Yuri");
        redes.add("Pedro");
        redes.sort(null);
        listaCienciaComputacao.add(redes);

        for (ArrayList<String> lista : listaCienciaComputacao) {
            System.out.println(lista);
        }

        ArrayList<String> nomesAvaliados = new ArrayList<>();
        String nomeTmp;
        int contador;

        for (ArrayList<String> lista : listaCienciaComputacao) {
            for (Object s : lista) {
                nomeTmp = s.toString();
                if (!nomesAvaliados.contains(nomeTmp)) {
                    contador = 0;
                    nomesAvaliados.add(nomeTmp);
                    for (ArrayList<String> d : listaCienciaComputacao) {
                        for (Object a : d) {
                            if (nomeTmp.equals(a.toString())) {
                                contador++;
                            }
                        }
                    }
                    System.out.println(nomeTmp + " apareceu em " + contador +" disciplinas");
                }
            }
        }

    }
}
