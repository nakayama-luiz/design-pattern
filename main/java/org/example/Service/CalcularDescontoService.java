package org.example.Service;

import org.example.Aluno.Aluno;

public class CalcularDescontoService {
    private  CalcularDesconto CALCULAR_DESCONTO;

    public CalcularDescontoService(CalcularDesconto CALCULAR_DESCONTO) {
        this.CALCULAR_DESCONTO = CALCULAR_DESCONTO;
    }

    public Double CalcularDescontoSobreCurso(Aluno aluno){
        return CALCULAR_DESCONTO.calcularDesconto(aluno);
    }
}
