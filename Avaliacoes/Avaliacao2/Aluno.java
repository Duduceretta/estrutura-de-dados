package Avaliacoes.Avaliacao2;
public class Aluno {
    String email;
    String nome;

    public Aluno(String email, String nome){
        this.email = email;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno [email = " + email + ", nome = " + nome + "]";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
