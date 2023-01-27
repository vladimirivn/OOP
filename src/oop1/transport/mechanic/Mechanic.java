package oop1.transport.mechanic;

import java.util.Objects;

public class Mechanic {
    private String name;
    private String company;

    public Mechanic(String name, String company) {
        setName(name);
        setCompany(company);
    }

    public void maintenance() {
        System.out.println("Механик " + getName() + " из компании " + getCompany() + " проводит техобслуживание");
    }

    public void repair() {
        System.out.println("Механик " + getName() + " из компании " + getCompany() + " производит ремонт");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "Default Name";
        } else {
            this.name = name;
        }
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company == null || company.isBlank() || company.isEmpty()) {
            this.company = "Default Company";
        } else {
            this.company = company;
        }
    }

    @Override
    public String toString() {
        return "Механик: " + name + ", компания: " + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }
}
