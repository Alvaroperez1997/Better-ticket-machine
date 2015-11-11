
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (Alvaro) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private int hora;
    
    private int minuto;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        hora = 0;
        minuto = 0;
    }
    
    /**
     * Metodo para cambiar la hora y los minutos
     */
    public void setTime(int valorHora, int valorMinuto)
    {
        if (valorHora <= 23 && valorMinuto <= 59 && valorMinuto >= 00)
        {
            hora = valorHora;
            minuto = valorMinuto;
        }
        else
        {
            System.out.println("La hora " + valorHora + " : " + valorMinuto + "no existe");
        }
    }
    
    /**
     * Metodo que permite avanzar un minuto el tiempo
     */
    public void timeTick()
    {
        if (hora >= 23 && minuto >= 59)
        {
            hora = 0;
            minuto = 0;
        }
        else 
            if ( hora <= 23 && minuto <= 59)
            {
                hora = hora + 1;
                minuto = 0;
            }
            else
            {
                minuto = minuto + 1;
            }
    }
}

