class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto somar(Produto outro) {
        return new Produto(this.nome + " e " + outro.nome, this.preco + outro.preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

Produto produto1 = new Produto("Produto A", 50);
Produto produto2 = new Produto("Produto B", 30);
Produto produto3 = produto1.somar(produto2);
System.out.println("Nome: " + produto3.getNome() + ", Preço: " + produto3.getPreco());
