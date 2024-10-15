class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.empregados = []

empresa1 = Empresa("Empresa X")
empregado1 = Empregado("Ruan", "Analista", 5000)
empresa1.empregados.append(empregado1)
