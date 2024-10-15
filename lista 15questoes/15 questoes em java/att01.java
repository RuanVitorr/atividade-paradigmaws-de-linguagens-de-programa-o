class Carro {
    String marca;
    String modelo;
    int ano;

    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    void mostrarInformacao() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}

class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Mitsubishi", "Lancer", 2014);
        Carro carro2 = new Carro("Honda", "Civic", 2017);
        carro1.mostrarInformacao();
        carro2.mostrarInformacao();
    }
}