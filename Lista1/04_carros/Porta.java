
/**
 * Write a description of class Porta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Porta
{
    private boolean isOpen = false;
    
    public void setIsOpen(){
        if(isOpen){
            isOpen = false;
        }else{
            isOpen = true;
        }
    }
}
