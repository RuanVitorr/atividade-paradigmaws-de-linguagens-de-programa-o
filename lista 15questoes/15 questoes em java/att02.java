class Carro {
    String marca;
    String modelo;
    int ano;
    int velocidade;

    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    void mostrarInformacao() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    void acelerar(int incremento) {
        velocidade += incremento;
    }

    void pararCarro() {
        velocidade = 0;
    }

    void mostraVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}

class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Mitsubishi", "Lancer", 2014);
        carro1.acelerar(50);
        carro1.mostrarInformacao();
        carro1.mostraVelocidade();
    }
}