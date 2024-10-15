class ContaBancaria {
    private double saldo;
    String titular;

    ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        saldo -= valor;
    }

    void mostrarSaldo() {
        System.out.println("Titular: " + titular + ", Saldo: R$" + saldo);
    }
}

class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Ruan", 100);
        conta1.mostrarSaldo();
        conta1.depositar(150);
        conta1.mostrarSaldo();
        conta1.sacar(50);
        conta1.mostrarSaldo();
    }
}