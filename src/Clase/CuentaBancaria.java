/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author javie
 */
public class CuentaBancaria { //Inciso 1.1 (b (e

    final int mesesDelAño = 12; // inciso (c
    int numeroCuenta; // inciso (c
    double saldoCuenta; // inciso (c
    double tasaInteresAnual; // inciso (c
    String fechaCreacion; // inciso (c 

    public CuentaBancaria() { // Inciso 1.2

        this.numeroCuenta = 0;
        this.saldoCuenta = 0;
        this.tasaInteresAnual = 0;
        this.fechaCreacion = "";

    }

    public CuentaBancaria(int numeroCuenta, double saldoCuenta) { // Inciso 1.3

        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
        this.tasaInteresAnual = 0;
        this.fechaCreacion = "";

    }

    public CuentaBancaria(int numeroCuenta, double saldoCuenta, double tasaInteresAnual) {

        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
        this.tasaInteresAnual = tasaInteresAnual;

    }

    public CuentaBancaria(int numeroCuenta, double saldoCuenta, double tasaInteresAnual, String fechaCreacion) {

        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
        this.tasaInteresAnual = tasaInteresAnual;
        this.fechaCreacion = fechaCreacion;

    }

    public int getNumeroCuenta() { // Inciso 1.4 (i

        return numeroCuenta;

    }

    public void setNumeroCuenta(int numeroCuenta) { // Inciso 1.4

        this.numeroCuenta = numeroCuenta;

    }

    public double getSaldoCuenta() { // Inciso 1.4 (i

        return saldoCuenta;

    }

    public void setSaldoCuenta(double saldoCuenta) { // Inciso 1.4

        this.saldoCuenta = saldoCuenta;

    }

    public double gettasaInteresAnual() { // Inciso 1.4 (i

        return tasaInteresAnual;

    }

    public void settasaInteresAnual(double tasaInteresAnual) { // Inciso 1.4

        this.tasaInteresAnual = tasaInteresAnual;

    }

    public String getFechaCreacion() { // Inciso 1.5

        return fechaCreacion;

    }

    public void setFechaCreacion(String fechaCreacion) {

        this.fechaCreacion = fechaCreacion;

    }

    public double getTasaMensual() { // Inciso 1.6  (i
        double tasaMensual;

        tasaMensual = (this.tasaInteresAnual / mesesDelAño);

        return tasaMensual;

    }

    public void retirarSaldo(double retiro) { // Inciso 1.7

        this.saldoCuenta -= retiro;

    }

    public void depositarSaldo(double deposito) { // Inciso 1.8

        this.saldoCuenta += deposito;

    }

}
