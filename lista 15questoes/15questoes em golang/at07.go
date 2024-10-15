type Escola struct {
    Nome      string
    Professores []Professor
}

type Professor struct {
    Nome string
}

escola1 := Escola{Nome: "Escola A"}
professor1 := Professor{Nome: "Professor X"}
escola1.Professores = append(escola1.Professores, professor1)
