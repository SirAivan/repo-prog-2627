package es.iesteis.prog.ud4;

import es.iesteis.prog.ud4.modelo.VisorReloj;

public class Main {
    public static void main(String[] args) {

        // Caso 1: reloj recien creado con el constructor por defecto
        VisorReloj reloj1 = new VisorReloj();
        IO.println("Caso 1 - esperado 00:00, obtenido " + reloj1.getHora());

        // Caso 2: reloj creado directamente con una hora y un minuto concretos
        VisorReloj reloj2 = new VisorReloj(10, 59);
        IO.println("Caso 2 - esperado 10:59, obtenido " + reloj2.getHora());

        // Caso 3: cambiar la hora de un reloj ya creado con ponerEnHora
        reloj2.ponerEnHora(23, 59);
        IO.println("Caso 3 - esperado 23:59, obtenido " + reloj2.getHora());

        // Caso 4: avance normal minuto a minuto
        // (cuando veamos los bucles, esto se podra escribir en muchas menos lineas)
        VisorReloj reloj3 = new VisorReloj(10, 57);
        reloj3.emitirTic();
        IO.println("Caso 4 - esperado 10:58, obtenido " + reloj3.getHora());
        reloj3.emitirTic();
        IO.println("Caso 4 - esperado 10:59, obtenido " + reloj3.getHora());
        reloj3.emitirTic();
        IO.println("Caso 4 - esperado 11:00, obtenido " + reloj3.getHora());

        // Pregunta: ¿por que imprimimos aqui, desde Main, y no dentro de emitirTic()?
        // ¿Que pasaria si quisieramos mostrar el reloj de otra forma (por ejemplo, una ventana)?

        // Caso 5: el minuto da la vuelta y se incrementa la hora
        VisorReloj reloj4 = new VisorReloj(10, 59);
        reloj4.emitirTic();
        IO.println("Caso 5 - esperado 11:00, obtenido " + reloj4.getHora());

        // Caso 6: a medianoche, la hora tambien da la vuelta
        VisorReloj reloj5 = new VisorReloj(23, 59);
        reloj5.emitirTic();
        IO.println("Caso 6 - esperado 00:00, obtenido " + reloj5.getHora());

        // Pregunta: si quisieramos cambiar como se calculan horas y minutos,
        // ¿que clase tocariamos? ¿Y si solo quisieramos cambiar el formato en que se muestran?
    }
}
