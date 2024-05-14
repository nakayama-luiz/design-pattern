package org.example.Coordenador;

public class Coordernador {
    private Long id;

    private String name;

    private Double salary;

    public void receberSalario(){
        System.out.println(this.salary);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
