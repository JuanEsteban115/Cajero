package model;

public class Cajero {
    private double saldo;
    private double retiro;
    private int id;
    private double consignar;

    public Cajero(int id, double saldo, double retiro, double consignar) {
        this.id = id;
        this.saldo = saldo;
        this.retiro = retiro;
        this.consignar = consignar;
    }


    //este es un comentario de prueba para git

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getConsignar() {
        return consignar;
    }

    public void setConsignar(double consignar) {
        this.consignar = consignar;
    }

    @Override
    public String toString() {
        return "CUENTA-> ID: "+id+" SALDO: "+saldo;
    }
}
