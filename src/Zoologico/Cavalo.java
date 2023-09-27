package Zoologico;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public Cavalo() {
    }

    @Override
    public String emitirSom() {
        String som = "ihiownn";
        return som;
    }

    @Override
    public String executarAcao() {
        String corre = "Cavalo correndo";
        return corre;
    }
}
