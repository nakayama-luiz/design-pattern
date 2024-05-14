package org.example.Service;

import org.example.Aluno.Aluno;

public class CalcularDesconto40 implements CalcularDesconto{
    @Override
    public Double calcularDesconto(Aluno aluno) {
        return aluno.getCurso().getValor() * 0.4;
    }
}
