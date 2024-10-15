#1. Classes e Objetos Básicos Crie uma classe Carro com atributos como marca, modelo, e ano. Instancie três objetos dessa classe e exiba os detalhes de cada um. 
class carro:
    def __init__(self,marca, modelo, ano ):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano

    def mostrar_informação(self):
        print(f"Marca: {self.marca}, Modelo:{self.modelo}, Ano: {self.ano} ")


carro1 = carro("Mitsubishi","Lancer","2014")
carro2= carro("Honda","Civic","2017")

carro1.mostrar_informação()
carro2.mostrar_informação() 