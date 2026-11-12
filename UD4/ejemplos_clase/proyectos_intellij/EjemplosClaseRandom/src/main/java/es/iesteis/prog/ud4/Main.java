package es.iesteis.prog.ud4;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //Creamos una instancia para
        Random generador = new Random();

        //Generar un entero de 0 a 10 (exclusive)
        System.out.println("[0 - 10): " + generador.nextInt(10));

        //Un entero entre dos valores (el segundo exclusive)
        int a = 5;
        int b = 12;
        System.out.println("[" + a + ", " + b + "): " + generador.nextInt(a, b));


        //Podemos generar valores aleatorios de otros tipos
        System.out.println("Un boolean aleatorio: " + generador.nextBoolean());

        //Un double entre 0.0  y 10.0 (exc)
        System.out.println("[0.0, 10): " + generador.nextDouble(10));


        //Para pruebas, podemos conseguir resultados predecibles (para comparar) si
        //inicializamos el generador con una "semilla" determinada
        //Si probamos lo siguiente varias veces distintas, debería dar siempre lo mismo
        int semilla = 42;
        //Creo otra instancia, pasándole la semilla
        generador = new Random(semilla);
        for (int i = 0; i < 10; i++) {
            IO.print(generador.nextInt(100));
            IO.print(", ");
        }

    }
}
