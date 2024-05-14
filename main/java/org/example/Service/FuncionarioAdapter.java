package org.example.Service;

import org.example.Coordenador.Coordernador;
import org.example.Fiscal.Fical;

public class FuncionarioAdapter extends Fical {
    private Coordernador coordernador;

    public FuncionarioAdapter(Coordernador coordernador){
        this.coordernador= coordernador;
    }

    public void receberSalario(){
        coordernador.receberSalario();
    }



}
