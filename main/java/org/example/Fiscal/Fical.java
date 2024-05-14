package org.example.Fiscal;

import java.util.UUID;

public class Fical {
    private String name;

    private Double salary;

    private UUID uuid;

    public void receberSalario(){
        System.out.println(this.salary);
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

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
