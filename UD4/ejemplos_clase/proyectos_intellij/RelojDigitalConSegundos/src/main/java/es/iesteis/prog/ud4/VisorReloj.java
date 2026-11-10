package es.iesteis.prog.ud4;

/**
 * La clase VisorReloj implementa un panel de un reloj digital para un reloj
 * estilo 24 horas europeo. El reloj muestra horas y minutos. El rango del reloj es
 * 00:00 (medianoche) a 23:59 (un minuto antes de medianoche)
 * 
 * El reloj recibe "ticks" (via método emitirTicReloj) cada minuto y reacciona
 * incrementando el visor. Esto se hace de la manera habitual: la hora se incrementa 
 * cuando los minutos alcanzan de nuevo el valor cero.
 */

public class VisorReloj
{
    private VisorNumero horas;
    private VisorNumero minutos;
    private VisorNumero segundos;
    private String visorString; // simula el visor actual

    /**
     * Constructor de objetos VisorReloj. Este constructor crea un nuevo
     * reloj puesto en hora a las 00:00
     */

    public VisorReloj() 
    {
        /*
        En lugar de repetir la inicialización de cada atributo en distintos constructores,
        lo paso a un método aparte y lo llamo cuando lo necesite
         */
        inicializaHoras();
        actualizarReloj();
    }


    /**
     * Constructor de objetos VisorReloj. Este constructor crea un nuevo
     * reloj puesto en hora a lpartir de los par�metros pasaados 
     * al constructor
     */

    public VisorReloj(int hora, int minuto, int segundo)
    {
        inicializaHoras();
        ponerEnHora(hora, minuto, segundo);
         
    }

    private void inicializaHoras() {
        horas = new VisorNumero(24);
        minutos = new VisorNumero(60);
        segundos = new VisorNumero(60);
    }


    /**
     * Este método debería llamarse una vez cada minuto -
     * permite que el reloj avance un minuto
     */

    public void emitirTic()
    {
        minutos.incrementar();
        if (minutos.getValor() == 0) {  // se da la vuelta
        
            horas.incrementar();
        }
        actualizarReloj();
    }

    /**
     * Incrementa el reloj en un segundo
     */
    public void emitirTac(){
        segundos.incrementar();
        if(segundos.getValor() == 0){
            /*
            En lugar de repetir el código para incrementar los segundos,
            llamamos al método emitirTic(), que ya lo hace
             */
            emitirTic();
        }
    }

    /**
     * Pone la hora en el visor a un deternminado valor de hora y minuto
     *
     */

    public void ponerEnHora(int hora, int minuto, int segundo)
    {
        horas.setValor(hora);
        minutos.setValor(minuto);
        segundos.setValor(segundo);
        actualizarReloj();
    }

    /**
     * Devuelve la hora actual en el formato HH:MM.
     */
    public String getHora() 
    {
        return visorString;
    }

    /**
     * Actualiza la cadena interna que representa el visor
     */
    private void actualizarReloj()
    {
        visorString = horas.getValorVisor() + ":" + minutos.getValorVisor() +
       ":" + segundos.getValorVisor();
    }
    
   

}