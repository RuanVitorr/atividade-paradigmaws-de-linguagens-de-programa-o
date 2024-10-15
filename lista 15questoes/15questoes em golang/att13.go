package main

import "fmt"

type Matematica struct{}

func (Matematica) Fatorial(n int) int {
    if n == 0 {
        return 1
    }
    return n * (Matematica{}).Fatorial(n - 1)
}

matematica := Matematica{}
fmt.Println(matematica.Fatorial(5))
