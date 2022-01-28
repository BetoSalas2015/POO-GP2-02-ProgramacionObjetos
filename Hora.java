
/**
 * Write a description of class Hora here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */

public class Hora
{
    //   Área de Atributos de la clase
    private int horas;          //  Encapsulación
    private int minutos;
    private int segundos;
    
    //  Área de constructores
    public Hora() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }
    
    public Hora(int h) {
        setHoras(h);
        minutos = 0;
        segundos = 0;
    }
    
    public Hora(int h, int m) {
        setHoras(h);
        setMinutos(m);
        segundos = 0;
    }
    
    public Hora(int h, int m, int s) {
        setHoras(h);
        setMinutos(m);
        setSegundos(s);
    }
    
    
    //  Área de Métodos ( operaciones)
    // Modificadores  (setters)
    public void setHoras(int h) {
        //  condición ? verdadero : falso
        horas = ( h >= 0 && h <= 23) ? h :  0;
    }
    
    public void setMinutos(int m) {
        //  condición ? verdadero : falso
        minutos = ( m >= 0 && m <= 59) ? m :  0;
    }

    public void setSegundos(int s) {
        //  condición ? verdadero : falso
        segundos = ( s >= 0 && s <= 59) ? s :  0;
    }
    
    // Selectores   (getters)
    public int getHoras() {
        return horas;
    }
    
    public int getMinutos() {
        return minutos;
    }
    
    public int getSegundos() {
        return segundos;
    }
    
    
}





