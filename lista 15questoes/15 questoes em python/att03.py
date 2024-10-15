#3. Encapsulamento Implemente uma classe ContaBancaria com atributos saldo, titular e métodos depositar e sacar. Use encapsulamento para proteger o atributo saldo

class ContaBancaria:
        
    def __init__(self,titular, saldo):
        self.titular = titular
        self._saldo = saldo
        
    def depositar(self, valor):
        if valor > 0:
            self._saldo += valor
            print(f"Depósito no valor de R${valor} foi realizado com sucesso! Saldo atual: R${self._saldo}")
        else:
            print("O valor não pode ser 0 ou menor que 0!")
    
    def sacar(self, valor):
        if self._saldo > valor:
            self._saldo -= valor        
            print(f"saque de R${valor} realizado com sucesso! saldo atual de R${self._saldo}")
        
        else:
            print(f"não tem saldo suficiente")
            
    def mostrar_saldo(self):
        print(f"conta: {self.titular}, saldo atual é de R${self._saldo}")


conta1 = ContaBancaria("Ruan", 100)
conta1.mostrar_saldo()
conta1.depositar(150)
conta1.mostrar_saldo()
conta1.sacar(50)
conta1.mostrar_saldo()
conta1.titular()