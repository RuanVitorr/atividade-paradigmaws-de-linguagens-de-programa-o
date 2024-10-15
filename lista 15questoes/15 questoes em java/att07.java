import java.util.ArrayList;
import java.util.List;

class Escola {
    private String nome;
    private List<Professor> professores;

    public Escola(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }
}

class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }
}

Escola escola1 = new Escola("Escola A");
Professor professor1 = new Professor("Professor X");
escola1.professores.add(professor1);
