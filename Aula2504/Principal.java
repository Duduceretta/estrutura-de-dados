/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2504;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


/**
 *
 * @author laboratorio
 */
public class Principal {
    /***
     * metodo estatico de classe responsavel por gerar processos aleatorios entre 1 a 1000
     * distribuindo em duas filas
     * @param filaNormal - fila normal (numeros acima de 500)
     * @param filaPrioritaria -  fila prioritaria (numeros abaixo de 500)
     */
    public  static void gerarProcessosEmFilas(Queue<Processo> filaNormal, Queue<Processo> filaPrioritaria){
        Random gerador = new Random();
        int quantidadeProcessos = 1000;
        int numeroProcessoGerado;
        //Rotina para gerar 10000 processos entre 1 e 1000
        for (int i = 0; i < quantidadeProcessos; i++) {
            numeroProcessoGerado = gerador.nextInt(0, 1001);
            switch (numeroProcessoGerado) {
                case 0:
                    //rotina para tirar da fila prioritaria
                    System.out.println("ATENDENDO: " + filaPrioritaria.poll());
                    break;
                case 500:
                    //rotina para tirar da fila normal
                    System.out.println("ATENDENDO: " + filaNormal.poll());
                    break;
                default:
                    // rotina para inserir proceso na fila prioritaria
                    if (numeroProcessoGerado < 500) {
                        Processo processoTmp = new Processo(numeroProcessoGerado, "Processo de alta prioridade");
                        if (!filaPrioritaria.contains(processoTmp)) {
                            filaPrioritaria.offer(processoTmp);
                            System.out.println(processoTmp);
                        }
                    }else{ // rotina para inserir proceso na fila normal
                        Processo processoTmp = new Processo(numeroProcessoGerado, "Processo de baixa prioridade");
                        if (!filaNormal.contains(processoTmp)) {
                            filaNormal.offer(processoTmp);
                            System.out.println(processoTmp);
                        }
                    }
                    break;
                }

            }
    }
    
    /**
     * metodo estatico que exibe processos existentes na fila
     * @param fila - contem uma fila normal ou prioritaria
     * @param frase - texto a ser exibido no cabecalho
     */
    public static void exibirProcessosNaoAtndidos(Queue<Processo> fila, String frase){
        System.out.println(frase);
        System.out.println("Total de processos nao atendidos: "+ fila.size());
        
        for (Processo processo : fila) {
            System.out.println(processo);
        }
    }
    
    public static void main(String[] args) {
        //Processo novo = new Processo(100, "teste");
        //novo.umExemplo(1000, "texto");
        
        Queue<Processo> filaPrioritaria = new LinkedList<>();
        Queue<Processo> filaNormal = new LinkedList<>();
        
        gerarProcessosEmFilas(filaNormal, filaPrioritaria);
        exibirProcessosNaoAtndidos(filaNormal, "fila normal");
        exibirProcessosNaoAtndidos(filaPrioritaria, "fila prioritaria");
    }
}
