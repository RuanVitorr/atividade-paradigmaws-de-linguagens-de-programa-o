#5. Polimorfismo Utilize polimorfismo para criar uma função que receba uma lista de objetos Animal e chame o método som de cada um, demonstrando comportamento diferente para cada subclasse. 

class Animal:
    def __init__(self,nome):
        self.nome = nome

    def som(self):
        pass

class Cachorro(Animal):
    def som(self):
        print(f"{self.nome} faz: Au Au")

class Gato(Animal):
    def som(self):
        print(f"{self.nome} faz: miau miau")


def fazer_barulho(animais):
    for animal in animais:
        animal.som()



cachorro1 = Cachorro("scooby")
gato1 = Gato("Mu")

lista_animais = [cachorro1,gato1]

fazer_barulho(lista_animais)