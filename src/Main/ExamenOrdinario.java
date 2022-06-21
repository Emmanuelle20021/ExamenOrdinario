/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clase.CuentaBancaria; // Inciso (f

/**
 *
 * @author javie
 */
public class ExamenOrdinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inciso (g
        final int idCuenta = 1324; // inciso  (c
        final double saldoInicial = 21000; // inciso (c
        final double retiro = 2500; // inciso (c
        final double deposito = 3000; // inciso (c
        final String fechaActual = "21/06/2022"; // inciso (c
        final double tasaInteresAnual = 4.5; // inciso (c
        double interesMensual;

        /*
        * Inciso 1.9 (a
        * Se Instacia una variable @cuentaPrueba 
        * de tipo CuentaBancaria con su identificador saldo y tasa de interes.
        * y se le asigna la fecha actual.
         */
        CuentaBancaria cuentaPrueba = new CuentaBancaria(idCuenta, saldoInicial, tasaInteresAnual);
        cuentaPrueba.setFechaCreacion(fechaActual);

        //Se hace un retiro llamando al metodo
        cuentaPrueba.retirarSaldo(retiro);
        System.out.println("El saldo actua es : $ " + cuentaPrueba.getSaldoCuenta());

        //Se hace un deposito llamando al metodo
        cuentaPrueba.depositarSaldo(deposito);
        System.out.println("El saldo acutal es : $ " + cuentaPrueba.getSaldoCuenta());

        //Se imprimen todos los atributos
        interesMensual = (cuentaPrueba.getSaldoCuenta() * cuentaPrueba.getTasaMensual());
        System.out.println("El interes mensual es : $ " + interesMensual + "\n"
                + "La fecha de creacion fue el " + cuentaPrueba.getFechaCreacion());

    }

}
