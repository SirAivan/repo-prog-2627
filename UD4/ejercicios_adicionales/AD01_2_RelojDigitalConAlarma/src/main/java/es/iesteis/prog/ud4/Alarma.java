package es.iesteis.prog.ud4;

public class Alarma {
    private int horas;
    private int minutos;

    public Alarma(){
        int horas = 7;
        int minutos = 00;
    }
    public void setHoraAlarma(int horas, int minutos){
        this.horas = horas;
        this.minutos = minutos;
    }
    public String getHoraAlarma(){
        String h;
        if (horas < 10){
            h = "0" + horas;
        } else{
            h = "" + horas;
        }
        String m;
        if (minutos < 10){
            m = "0" + minutos;
        } else{
            m = "" + minutos;
        }
        return h + ":" + m;
    }
}
