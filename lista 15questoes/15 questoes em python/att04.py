#4. Herança Crie uma classe base Animal com métodos como som. Derive classes como Cachorro e Gato que implementam o método som de maneiras diferentes. 

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

cachorro1 = Cachorro("scooby")
gato1 = Gato("Mu")

cachorro1.som()
gato1.som()