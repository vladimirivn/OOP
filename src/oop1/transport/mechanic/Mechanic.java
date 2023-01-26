package oop1.transport.mechanic;

import oop1.transport.Transport;

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
            this.name = company;
        }
    }


    @Override
    public String toString() {
        return "Механик: " + name + ", компания: " + company;
    }
}
