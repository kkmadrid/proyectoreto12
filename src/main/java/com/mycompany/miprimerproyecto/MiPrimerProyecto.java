/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.miprimerproyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author kaká
 */
public class MiPrimerProyecto {

    public static void main(String[] args) {
        System.out.println("Hello World jodido el tema!");
        int edad = 19;

        if (edad >= 18) {
            System.out.println("puede tomar");
        } else {
            System.out.println("no puede tomar");
        }

        String nombre_estudiante = "manuelas";

        char sexo = 'f';

        boolean luz_prendida = true;

        //casteo -- conversion
        int edad2 = 25;

        double edad_real = edad2;

        String edad3 = "18";

        int edad_real1 = Integer.parseInt(edad3);

        Double edad_real2 = Double.parseDouble(edad3);

        Byte edad_real3 = Byte.parseByte(edad3);

        if (sexo == 'f') {
            System.out.println("es una mujer");
        } else if (sexo == 'h') {
            System.out.println("es un hombre");
        } else if (sexo == 'n') {
            System.out.println("genero no definido");
        } else {
            System.out.println("caso no contemplado jodido el tema");
        }

        switch (sexo) {
            case 'f':
                System.out.println("es una mujer");
                break;

            case 'h':
                System.out.println("es un hombre");
                break;

            case 'n':
                System.out.println("genero no definido");

            default:
                System.out.println("caso no contemplado");
        }

        // ciclos for - while
        //imprimir numeros del uno al 10 
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println("con el ciclo while");
        int j = 0;

        while (j < 11) {
            System.out.println(j);
            j++;
        }

        System.out.println("con el ciclo do while");
        int l = 1;

        do {
            System.out.println(l);
            l++;
        } while (l < 11);

        String operacion = "";
        do {
            operacion = JOptionPane.showInputDialog("ingrese una operacion: (+,-,*) ");
        } while (operacion.equals("+") && operacion.equals("-") && operacion.equals("*"));

        //ejercicio pidiendo dos numeros y ejecutando determinada accion
        String numero1 = JOptionPane.showInputDialog("ingrese el primer numero");
        String numero2 = JOptionPane.showInputDialog("ingrese el segundo numero");

        int suma = Integer.parseInt(numero1) + Integer.parseInt(numero2);

        JOptionPane.showMessageDialog(null, "la suma es:" + suma);
        //se puede mostrar tambien por System.out.println("la suma es: "+suma);

        //crear un array
        String[] listaestudiantes = {"alan", "vanesa", "alex"};

        JOptionPane.showMessageDialog(null, "muestra listado 1:" + listaestudiantes[1]);
        JOptionPane.showMessageDialog(null, "longitud es:" + listaestudiantes.length);

        //recorrido a un array
        for (String estudiantes : listaestudiantes) {
            System.out.println(estudiantes);
        }
    }

}
