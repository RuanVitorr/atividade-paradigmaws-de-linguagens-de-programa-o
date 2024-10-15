class Calculadora:
    def somar(self, a, b, c=None):
        if c:
            return a + b + c
        return a + b

calc = Calculadora()
print(calc.somar(2, 3))
print(calc.somar(2, 3, 4))
