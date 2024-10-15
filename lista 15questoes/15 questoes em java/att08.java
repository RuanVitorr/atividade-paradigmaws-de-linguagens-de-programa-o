import java.util.ArrayList;
import java.util.List;

class Empregado {
    private String nome;
    private String cargo;
    private double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
}

class Empresa {
    private String nome;
    private List<Empregado> empregados;

    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }
}

Empresa empresa1 = new Empresa("Empresa X");
Empregado empregado1 = new Empregado("Ruan", "Analista", 5000);
empresa1.empregados.add(empregado1);
