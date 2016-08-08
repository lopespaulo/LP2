
/**
 * Write a description of class Roda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roda
{
    private int tamanhoAro = 14;
    private int pressao = 0;
    
    public Roda(){};
    public Roda(int aro){
        setTamanhoAro(aro);
    }
    
    public void setPressao(int pressao){
        if( pressao >= 0 && pressao <= 50 ){
            this.pressao = pressao;
        }
    }
    
    public void setTamanhoAro(int aro){
        // deixei qualquer tamanho porque sou vida louca.
        tamanhoAro = aro;
    }
    
}
