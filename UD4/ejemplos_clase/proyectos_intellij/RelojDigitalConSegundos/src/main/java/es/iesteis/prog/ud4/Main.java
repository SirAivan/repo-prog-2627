package es.iesteis.prog.ud4;

public class Main {
    public static void main(String[] args) {

        VisorReloj reloj1 = new VisorReloj();
        System.out.println(reloj1.getHora()); // 00:00:00

        reloj1.emitirTac();
        reloj1.emitirTac();
        System.out.println(reloj1.getHora()); // 00:00:02

        VisorReloj reloj2 = new VisorReloj(10, 59, 58);
        System.out.println(reloj2.getHora()); // 10:59:58

        reloj2.emitirTac();
        reloj2.emitirTac();
        System.out.println(reloj2.getHora()); // 11:00:00

        reloj2.ponerEnHora(23, 59, 59);
        System.out.println(reloj2.getHora()); // 23:59:59

        reloj2.emitirTac();
        System.out.println(reloj2.getHora()); // 00:00:00
    }
}
