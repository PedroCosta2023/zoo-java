package Zoologico;

public class Cachorro extends Animal{

    public Cachorro() {
    }

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        String som = "Auau";
        return som;
    }

    @Override
    public String executarAcao() {
        String correr = "Cachorro corre";
        return correr;
    }
}
