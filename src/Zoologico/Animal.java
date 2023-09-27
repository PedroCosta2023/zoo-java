package Zoologico;

public abstract class Animal {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract String emitirSom();

    public abstract String executarAcao();

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Animal() {
    }
}
