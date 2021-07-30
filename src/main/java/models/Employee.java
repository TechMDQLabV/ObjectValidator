package models;

import java.util.Arrays;

public class Employee {

    private String[] datos;
    private String name;
    private String lastName;
    private String documentNumber;
    private Integer algo;
    private Account account;

    public Employee() {
        this.name = "Pepe";
        this.lastName = "Argento";
        this.documentNumber = "12345678";
        this.algo = 1500;
        this.account = new Account();
        this.datos = new String[5];
        this.datos[0]="dato1";
        this.datos[1]="dato2";
    }

    public Employee(String name, String lastName, String documentNumber, Integer algo, Account account) {
        this.name = name;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.algo = algo;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Integer getAlgo() {
        return algo;
    }

    public void setAlgo(Integer algo) {
        this.algo = algo;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "datos=" + Arrays.toString(datos) +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", algo=" + algo +
                ", account=" + account +
                '}';
    }
}
