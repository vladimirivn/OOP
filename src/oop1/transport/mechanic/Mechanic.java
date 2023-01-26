package oop1.transport.mechanic;

import oop1.transport.Transport;

public class Mechanic {
    private String name;
    private String company;

//    private TransportType transportType;

    //    public Mechanic(String name, String company, TransportType transportType) {
    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
//        this.transportType = transportType;
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
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    @Override
    public String toString() {
        return "Механик: " + name + ", компания: " + company;
    }
}
