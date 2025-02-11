/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examples;

/**
 *
 * @author GeorchitoChan
 */
public class Examples {

    public static void main(String[] args) {
        /*
        * La empresa Limit SAS desea saber el valor Neto a pagar de los empleados teniendio en cuenta
        * los siguientes cargos:
        * - Gerente: $3,500,000
        * - Prof. Operativo: $2,500,000
        * - Contador: $1,700,000
        * - Recepcionista/Secretaria: $1,500,000
        * - Ingeniero Civil: $2,400,000
        * - Mensajero: $1,400,000
        * OBSERVACIONES:
        * 1. A cada empleado se le debe descontar Imp. timbre 1.1%, Imp. ICA 1.5%, Retefuente 1.8%
        * 2. Para los cargos menores o iguales a $1,500,000 se le paga un auxilio de transporte y dotación de $150,000 respectivamente.
        * 3. Los cargos director, prof. Operativo realizaron un prestamo de $250,000 a descontar.
        * Calcule el total de la nómina a pagar.
         */

        double nominaNeto = 0;
        double valorNeto = 0;
        double salario = 0;
        final double IMP_TIMBRE = 1.1 / 100;
        final double IMP_ICA = 1.5 / 100;
        final double RETEFUENTE = 1.8 / 100;
        final int AUXTRANSPORTE = 150000;
        final int DOTACION = 150000;
        final int PRESTAMO = 250000;

        System.out.println("CALCULADORA DE NÓMINA NETO: ");

        salario = 3500000;
        valorNeto = salario - (salario * IMP_TIMBRE) - (salario * IMP_ICA) - (salario * RETEFUENTE);
        if (salario <= 1500000) {
            valorNeto = valorNeto + AUXTRANSPORTE + DOTACION;
        }
        valorNeto = valorNeto - PRESTAMO;
        nominaNeto = valorNeto;
        System.out.println("Salario del Gerente: $" + valorNeto);

        salario = 2500000;
        valorNeto = salario - (salario * IMP_TIMBRE) - (salario * IMP_ICA) - (salario * RETEFUENTE);
        if (salario <= 1500000) {
            valorNeto = valorNeto + AUXTRANSPORTE + DOTACION;
        }
        valorNeto = valorNeto - PRESTAMO;
        nominaNeto = nominaNeto + valorNeto;
        System.out.println("Salario del Prof. Operativo: $" + valorNeto);

        salario = 1700000;
        valorNeto = salario - (salario * IMP_TIMBRE) - (salario * IMP_ICA) - (salario * RETEFUENTE);
        if (salario <= 1500000) {
            valorNeto = valorNeto + AUXTRANSPORTE + DOTACION;
        }
        nominaNeto = nominaNeto + valorNeto;
        System.out.println("Salario del Contador: $" + valorNeto);
        
        salario = 1500000;
        valorNeto = salario - (salario * IMP_TIMBRE) - (salario * IMP_ICA) - (salario * RETEFUENTE);
        if (salario <= 1500000) {
            valorNeto = valorNeto + AUXTRANSPORTE + DOTACION;
        }
        nominaNeto = nominaNeto + valorNeto;
        System.out.println("Salario del Recepcionista/Secretaria: $" + valorNeto);

        salario = 2400000;
        valorNeto = salario - (salario * IMP_TIMBRE) - (salario * IMP_ICA) - (salario * RETEFUENTE);
        if (salario <= 1500000) {
            valorNeto = valorNeto + AUXTRANSPORTE + DOTACION;
        }
        nominaNeto = nominaNeto + valorNeto;
        System.out.println("Salario del Ingeniero Civil: $" + valorNeto);
        
        salario = 1400000;
        valorNeto = salario - (salario * IMP_TIMBRE) - (salario * IMP_ICA) - (salario * RETEFUENTE);
        if (salario <= 1500000) {
            valorNeto = valorNeto + AUXTRANSPORTE + DOTACION;
        }
        nominaNeto = nominaNeto + valorNeto;
        System.out.println("Salario del Mensajero: $" + valorNeto);
        
        System.out.println("La nómina neto es: $" + nominaNeto);
    }
}
