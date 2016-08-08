
/**
 * Classe que implementa o motor do carro
 * 
 * @author Paulo Lopes
 * @version 20160802
 */
public class Motor
{
   private String tipoCombustivel = "Gasolina";
   private double cilindradas = 1.0;
   private boolean isOn = false;
   private double maxSpeed = cilindradas * 100;
   
   public Motor(){
   }
   
   public Motor(double cilindradas, String tipoCombustivel){
       
      setCilindradas(cilindradas);
      setTipoCombustivel(tipoCombustivel);
    }
    
   public void setCilindradas(double cilindradas){
        if(cilindradas != 1.0 & cilindradas != 1.4 && cilindradas != 1.6){
           System.out.println("Cilindradas inválidas!");
        }else{
            this.cilindradas = cilindradas;
            maxSpeed = cilindradas * 100;
        }
   }
   
   public void setTipoCombustivel(String tipoCombustivel){
       this.tipoCombustivel = tipoCombustivel;
    }
   
    public String getTipoCombustivel(){
        return tipoCombustivel;
    }
    
   public double getCilindradas(){
       return cilindradas;
   }
   
   public double getMaxSpeed(){
       return maxSpeed;
   }
   
   public boolean getIsOn(){
       return isOn;
   }
   
   public void setIsOn(){
       isOn = (isOn)? false : true;
    }
   
   
}
