#2. Métodos Adicione um método acelerar e frear à classe Carro que altere um atributo velocidade. Crie um método para exibir a velocidade atual. 

class carro:
    def __init__(self,marca, modelo, ano ):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0

    def mostrar_informação(self):
        print(f"Marca: {self.marca}, Modelo:{self.modelo}, Ano: {self.ano} ")

    def acelerar(self, incremento):
        self.velocidade += incremento
       
    def parar_carro(self):
        self.velocidade = 0
        

    def mostra_velocidade(self):
        if self.velocidade > 0:
            print(f"velocidade atual do carro é: {self.velocidade}")
        else:
            print(f"velocidade: {self.velocidade}Km/h - está parado")

carro1 = carro("Mitsubishi","Lancer","2014")
carro1.acelerar(50)

carro2= carro("Honda","Civic","2017")
carro2.parar_carro()


carro1.mostrar_informação()
carro1.mostra_velocidade()
carro2.mostrar_informação() 
carro2.mostra_velocidade()