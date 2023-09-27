package Zoologico;

public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public Preguica() {
    }

    @Override
    public String emitirSom() {
        String som = "iiiiiiii";
        return som;
    }

    @Override
    public String executarAcao() {
        String acao = "mimimi";
        return acao;
    }
}
