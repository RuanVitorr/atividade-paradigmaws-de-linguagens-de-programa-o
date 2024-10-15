class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
        saldo -= valor;
    }
}

ContaBancaria conta = new ContaBancaria(100);
try {
    conta.sacar(150);
} catch (SaldoInsuficienteException e) {
    System.out.println(e.getMessage());
}
