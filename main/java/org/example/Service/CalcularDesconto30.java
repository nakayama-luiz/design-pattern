package org.example.Service;

import org.example.Aluno.Aluno;

public class CalcularDesconto30 implements CalcularDesconto{

    @Override
    public Double calcularDesconto(Aluno aluno) {
        return (aluno.getCurso().getValor() * 0.3)-(aluno.getCurso().getValor() *4.8);
    }
}
