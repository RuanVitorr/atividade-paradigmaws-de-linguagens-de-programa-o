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
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Scooby");
        Gato gato1 = new Gato("Mu");
        cachorro1.som();
        gato1.som();
    }
}