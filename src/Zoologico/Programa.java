package Zoologico;

public class Programa {
    public static void main(String[] args) {
        Cachorro cacho = new Cachorro();
        Cavalo cavalo = new Cavalo();
        Preguica preguica = new Preguica();
        Cachorro cachorro = new Cachorro();
        Cavalo caval = new Cavalo();
        Preguica preguic = new Preguica();
        Cachorro cachorr = new Cachorro();
        Cavalo cava = new Cavalo();
        Preguica pregui = new Preguica();
        Cachorro cachor = new Cachorro();


        Veterinario vete = new Veterinario();
        Veterinario.examinar(cachorro);

        Jaula[] jaula = new Jaula[10];

        for (int i = 0; i < jaula.length; i++) {
            jaula[i] = new Jaula();
        }

        jaula[0].setAnimal(cachorro);
        jaula[1].setAnimal(preguica);
        jaula[2].setAnimal(cavalo);
        jaula[3].setAnimal(cachorr);
        jaula[4].setAnimal(preguic);
        jaula[5].setAnimal(caval);
        jaula[6].setAnimal(cachor);
        jaula[7].setAnimal(pregui);
        jaula[8].setAnimal(cava);
        jaula[9].setAnimal(cacho);

        for (int i = 0; i < jaula.length; i++) {
            System.out.println(jaula[i].animal.emitirSom());
        }


    }
}