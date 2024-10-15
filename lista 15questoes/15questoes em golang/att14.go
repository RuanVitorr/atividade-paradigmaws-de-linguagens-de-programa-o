package main

import "sync"

type Configuracao struct{}

var instancia *Configuracao
var once sync.Once

func GetConfiguracao() *Configuracao {
    once.Do(func() {
        instancia = &Configuracao{}
    })
    return instancia
}

config1 := GetConfiguracao()
config2 := GetConfiguracao()
fmt.Println(config1 == config2)  // true
