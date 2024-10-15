from abc import ABC, abstractmethod

class Funcionario(ABC):
    @abstractmethod
    def calcular_salario(self):
        pass

class FuncionarioHorista(Funcionario):
    def __init__(self, horas_trabalhadas, valor_hora):
        self.horas_trabalhadas = horas_trabalhadas
        self.valor_hora = valor_hora

    def calcular_salario(self):
        return self.horas_trabalhadas * self.valor_hora

class FuncionarioAssalariado(Funcionario):
    def __init__(self, salario):
        self.salario = salario

    def calcular_salario(self):
        return self.salario

funcionario1 = FuncionarioHorista(40, 50)
funcionario2 = FuncionarioAssalariado(3000)
print(funcionario1.calcular_salario())
print(funcionario2.calcular_salario())
