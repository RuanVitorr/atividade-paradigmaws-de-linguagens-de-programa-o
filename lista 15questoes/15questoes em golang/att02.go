package main

import "fmt"

type Carro struct {
    marca     string
    modelo    string
    ano       int
    velocidade int
}

func (c *Carro) mostrarInformacao() {
    fmt.Printf("Marca: %s, Modelo: %s, Ano: %d\n", c.marca, c.modelo, c.ano)
}

func (c *Carro) acelerar(incremento int) {
    c.velocidade += incremento
}

func (c *Carro) pararCarro() {
    c.velocidade = 0
}

func (c Carro) mostraVelocidade() {
    if c.velocidade > 0 {
        fmt.Printf("Velocidade atual: %d km/h\n", c.velocidade)
    } else {
        fmt.Println("Carro parado")
    }
}

func main() {
    carro1 := Carro{"Mitsubishi", "Lancer", 2014}
    carro1.acelerar(50)
    carro1.mostrarInformacao()
    carro1.mostraVelocidade()
}