class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }

    void som() {}
}

class Cachorro extends Animal {
    Cachorro(String nome) {
        super(nome);
    }

    void som() {
        System.out.println(nome + " faz: Au Au");
    }
}

class Gato extends Animal {
    Gato(String nome) {
        super(nome);
    }

    void som() {
        System.out.println(nome + " faz: Miau Miau");
    }
}

class Main {
    static void fazerBarulho(Animal[] animais) {
        for (Animal animal : animais) {
            animal.som();
        }
    }

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Scooby");
        Gato gato1 = new Gato("Mu");
        Animal[] listaAnimais = {cachorro1, gato1};
        fazerBarulho(listaAnimais);
    }
}
