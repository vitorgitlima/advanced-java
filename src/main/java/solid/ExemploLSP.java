package solid;


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

    public static void imprimirListaAnimais(List<Animal> animais){

        for(Animal animal : animais){
            System.out.println(animal);
        }
    }


    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();


        List<Animal> listaAnimais = List.of(gato, cachorro);

        System.out.println(listaAnimais);
//        System.out.println(gato);
//        System.out.println(cachorro);
    }
}
