abstract class Funcionario {
    abstract double calcularSalario();
}

class FuncionarioHorista extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(int horasTrabalhadas, double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}

class FuncionarioAssalariado extends Funcionario {
    private double salario;

    public FuncionarioAssalariado(double salario) {
        this.salario = salario;
    }

    double calcularSalario() {
        return salario;
    }
}

Funcionario funcionario1 = new FuncionarioHorista(40, 50);
Funcionario funcionario2 = new FuncionarioAssalariado(3000);
System.out.println(funcionario1.calcularSalario());
System.out.println(funcionario2.calcularSalario());
