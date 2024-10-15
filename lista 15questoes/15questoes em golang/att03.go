package main

import "fmt"

type ContaBancaria struct {
    titular string
    saldo   float64
}

func (c *ContaBancaria) depositar(valor float64) {
    c.saldo += valor
}

func (c *ContaBancaria) sacar(valor float64) {
    c.saldo -= valor
}

func (c ContaBancaria) mostrarSaldo() {
    fmt.Printf("Titular: %s, Saldo: R$%.2f\n", c.titular, c.saldo)
}

func main() {
    conta1 := ContaBancaria{"Ruan", 100}
    conta1.mostrarSaldo()
    conta1.depositar(150)
    conta1.mostrarSaldo()
    conta1.sacar(50)
    conta1.mostrarSaldo()
}

