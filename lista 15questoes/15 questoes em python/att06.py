#6. Composição Implemente uma classe Motor e associe-a a uma classe Carro. A classe Carro deve ter um objeto do tipo Motor como um de seus atributos. 
class Motor:
    def __init__(self, potencia):
        self.potencia = potencia

class Carro:
    def __init__(self, marca, modelo, motor):
        self.marca = marca
        self.modelo = modelo
        self.motor = motor

motor1 = Motor(400)
carro1 = Carro("Mitsubishi", "Lancer", motor1)