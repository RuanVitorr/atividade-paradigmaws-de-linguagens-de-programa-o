type Funcionario interface {
    CalcularSalario() float64
}

type FuncionarioHorista struct {
    HorasTrabalhadas int
    ValorHora        float64
}

func (f FuncionarioHorista) CalcularSalario() float64 {
    return float64(f.HorasTrabalhadas) * f.ValorHora
}

type FuncionarioAssalariado struct {
    Salario float64
}

func (f FuncionarioAssalariado) Calcular
