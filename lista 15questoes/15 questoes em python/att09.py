from abc import ABC, abstractmethod

class Imprimivel(ABC):
    @abstractmethod
    def imprimir(self):
        pass

class Relatorio(Imprimivel):
    def imprimir(self):
        print("Imprimindo Relatório")

class Contrato(Imprimivel):
    def imprimir(self):
        print("Imprimindo Contrato")

relatorio = Relatorio()
contrato = Contrato()
relatorio.imprimir()
contrato.imprimir()
