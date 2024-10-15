class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

class Professor:
    def __init__(self, nome):
        self.nome = nome

escola1 = Escola("Escola A")
professor1 = Professor("Professor X")
escola1.professores.append(professor1)
