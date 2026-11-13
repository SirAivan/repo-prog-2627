package es.iesteis.prog.ud4;

public class RelojAlarma {
    private VisorReloj reloj;
    private Alarma alarma;

    public RelojAlarma(){
        reloj = new VisorReloj();
        alarma = new Alarma();
    }
    public RelojAlarma(int hora, int minuto){
       reloj = new VisorReloj(hora, minuto);
       alarma = new Alarma();
    }
    public void emitirTic(){
        reloj.emitirTic();
        if (esHoraAlarma()){
            System.out.println("RRRRIIIIINNNNNGGGGG");
        }
    }
    public void setAlarma(int hora, int minuto){
        alarma.setHoraAlarma(hora, minuto);
    }
    public String getHora(){
        return reloj.getHora();
    }
    public String getAlarma(){
        return alarma.getHoraAlarma();
    }
    private boolean esHoraAlarma(){
        return getHora().equals(getAlarma());
    }

    public void ponerEnHora(int hora, int minutos){
        reloj.ponerEnHora(hora, minutos);
    }
}
