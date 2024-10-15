class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def __add__(self, other):
        if isinstance(other, Produto):
            return Produto(f"{self.nome} e {other.nome}", self.preco + other.preco)
        return NotImplemented

produto1 = Produto("Produto A", 50)
produto2 = Produto("Produto B", 30)
produto3 = produto1 + produto2
print(f"Nome: {produto3.nome}, Preço: {produto3.preco}")
