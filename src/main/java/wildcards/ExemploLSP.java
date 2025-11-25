package wildcards;


import java.util.List;

// SuperClasse animal
class Animal{
    public String toString(){
        return "sou um animal";
    }
}

// SubClasse Gato
class Gato extends Animal{

    public String toString(){
        return "Sou um gato";
    }
}

// SubClasse Cachorro
class Cachorro extends Animal{

    public String toString(){
        return "Sou um cachorro";
    }
}

public class ExemploLSP {

    public static void imprimirListaAnimais(List<? extends Animal> animais){

        for(Animal animal : animais){
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();


        // Lista de Animal
        List<Animal> listaAnimais = List.of(gato, cachorro);
        System.out.println(listaAnimais);

        // Lista de Gatos
        List<Gato> listaGatos = List.of(new Gato(), new Gato());
        System.out.println("\nLista de gatos");
        imprimirListaAnimais(listaGatos);

        // Lista de Cachorro
        List<Cachorro> listaCachorro = List.of(new Cachorro(), new Cachorro());
        System.out.println("\nLista de Cachorros");
        imprimirListaAnimais(listaCachorro);

    }
}
