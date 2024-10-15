class Motor {
    private int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }
}

class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
}

Motor motor1 = new Motor(400);
Carro carro1 = new Carro("Mitsubishi", "Lancer", motor1);
