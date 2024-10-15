package main

import "fmt"

type Carro struct {
    marca  string
    modelo string
    ano    int
}

func (c Carro) mostrarInformacao() {
    fmt.Printf("Marca: %s, Modelo: %s, Ano: %d\n", c.marca, c.modelo, c.ano)
}

func main() {
    carro1 := Carro{"Mitsubishi", "Lancer", 2014}
    carro2 := Carro{"Honda", "Civic", 2017}
    carro1.mostrarInformacao()
    carro2.mostrarInformacao()
}