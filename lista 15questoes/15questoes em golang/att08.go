type Empregado struct {
    Nome   string
    Cargo  string
    Salario float64
}

type Empresa struct {
    Nome      string
    Empregados []Empregado
}

empresa1 := Empresa{Nome: "Empresa X"}
empregado1 := Empregado{Nome: "Ruan", Cargo: "Analista", Salario: 5000}
empresa1.Empregados = append(empresa1.Empregados, empregado1)
