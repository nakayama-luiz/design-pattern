package org.example.Curso;

import org.example.Aluno.Aluno;

import java.util.List;

public class Curso {
    private String name;

    private Long periodos;

    private List<Aluno> alunos;

    private Double valor;

    public Curso(CursoBuilder builder) {
        this.name= builder.name;
        this.periodos=builder.periodos;
        this.alunos= builder.alunos;
        this.valor= builder.valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPeriodos() {
        return periodos;
    }

    public void setPeriodos(Long periodos) {
        this.periodos = periodos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public static class CursoBuilder {
        private String name;

        private Long periodos;

        private Double valor;

        private List<Aluno> alunos;


        public CursoBuilder(String name, Long periodos, Double valor) {
            this.name = name;
            this.periodos = periodos;
            this.valor= valor;
        }

        public CursoBuilder setAlunoList(List<Aluno> alunos){
            this.alunos = alunos;
            return this;
        }

        public Curso build(){
            return new Curso(this);
        }


    }

}
