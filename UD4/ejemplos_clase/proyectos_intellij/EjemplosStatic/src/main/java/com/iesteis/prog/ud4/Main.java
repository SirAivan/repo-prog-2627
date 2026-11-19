package com.iesteis.prog.ud4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Circulo circulo1, circulo2, circulo3;
        circulo1 = new Circulo(10);
        circulo2 = new Circulo(5);
        circulo3 = new Circulo(12);

        System.out.println("Cantidad de circulos creados: " + Circulo.getContadorCirculos());
        System.out.println(circulo1);
        System.out.println(circulo2.toString());
        System.out.println(circulo3);
    }
}
