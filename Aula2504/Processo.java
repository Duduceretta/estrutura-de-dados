/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2504;

/**
 *
 * @author laboratorio
 */
public class Processo {
    /**
     * id - numero aleatorio
     */
    int id;
    
    /**
     * descricao - descricao do processo
     */
    String descricao;

    /**
     * construcao de processo
     * @param id - inteiro com numero aleatorio entre 1 e 1000
     * @param descricao - explicacao do processo
     */
    public Processo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    /**
     * metodo para explicar javaDoc para estudantes
     * @param id - um numero aleatorio
     * @param texto - texto com 10 palavras
     */
    public void umExemplo(int id, String texto){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Processo{" + "id=" + id + ", descricao=" + descricao + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Processo other = (Processo) obj;
        return this.id == other.id;
    }
    
}
