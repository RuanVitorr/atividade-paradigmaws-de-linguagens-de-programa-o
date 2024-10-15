interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    public void imprimir() {
        System.out.println("Imprimindo Relatório");
    }
}

class Contrato implements Imprimivel {
    public void imprimir() {
        System.out.println("Imprimindo Contrato");
    }
}

Relatorio relatorio = new Relatorio();
Contrato contrato = new Contrato();
relatorio.imprimir();
contrato.imprimir();
