
/**
 * Write a description of class Carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class Carro
{
    private Motor motor;
    private Roda roda1, roda2, roda3, roda4;
    private Porta porta1, porta2;
    private Tanque tanque;
    private int numMarcha = 1;
    private String cor;
    private int velocidade = 0;
    
    
    public Carro(){
        motor = new Motor();
        roda1 = new Roda();
        roda2 = new Roda();
        roda3 = new Roda();
        roda4 = new Roda();
        porta1 = new Porta();
        porta2 = new Porta();
        tanque = new Tanque();
        cor = "Branco";
    }
    
    public Carro(double cilindrada, String tipoCombustivel, int aro, String cor){
        motor = new Motor(cilindrada, tipoCombustivel);
        roda1 = new Roda(aro);
        roda2 = new Roda(aro);
        roda3 = new Roda(aro);
        roda4 = new Roda(aro);
        porta1 = new Porta();
        porta2 = new Porta();
        tanque = new Tanque();
        this.cor = cor;
    }
    
    public String getFarol(){
        // Aqui vou tentar fazer o 'algo a mais' 
       SimpleDateFormat hora = new SimpleDateFormat("HH");
       String farol = (Integer.parseInt(hora.format(new Date())) > 17 || Integer.parseInt(hora.format(new Date())) < 5 )? "Ligados" : "Desligados";
       return farol;
    }
    
    
    public void buzinar(){
        System.out.println("Bip-Bip!");
    }
    
    public void ligarCarro(){
        if(!motor.getIsOn()){
            motor.setIsOn();
        }else{
            System.out.println("Motor já esta ligado!");
        }
    }
    
    public void desligarCarro(){
        if(motor.getIsOn() && velocidade == 0){
            motor.setIsOn();
        }else{
            System.out.println("Motor já esta desligado ou Carro esta em movimento");
        }
    }
    
    public void acelerar(int valor){
        if(tanque.getQtCombustivel() > 0 && motor.getIsOn()){
            velocidade += valor;
            if(velocidade >= motor.getMaxSpeed()){
                System.out.println("Velocidade máxima atingida!");
                velocidade = (int)motor.getMaxSpeed();
            }
            trocaMarcha(velocidade);
        }else{
            System.out.println("Sem combustivel ou carro desligado");
        }
    }
    
    public void frear(int valor){
        if(velocidade > valor){
            velocidade -= valor;
        }else{
            velocidade = 0;
        }
        trocaMarcha(velocidade);
    }
    
    public void trocaMarcha(int velocidade){
        if(velocidade == 0){
            numMarcha = 0;
        }else if(velocidade <= 50){
            numMarcha = velocidade / 10;
        }else{
            numMarcha = 5;
        }
    }
    
    public void abastecer(double qtCombustivel){
        if(this.tanque.getQtCombustivel()+qtCombustivel > tanque.getCapacidade()){
            System.out.println("Não posso abaster essa quantidade! Sobrou: " +((this.tanque.getQtCombustivel()+qtCombustivel)- this.tanque.getCapacidade() ) +"L.");
            this.tanque.setQtCombustivel(this.tanque.getCapacidade());
        }else{
            tanque.setQtCombustivel(this.tanque.getQtCombustivel()+qtCombustivel);

        }
    }
    
    public void verCarro(){
        System.out.printf("### Resumo do carro: \n Cor: %s \tVelocidade Máxima: %dkm/h Velocidade Atual: %dkm/h\nCilindradas: %.1f cc \tCombustivel: %s\nAutonomia: %.2f litros\n Faróis: %s\n",
        cor, (int)motor.getMaxSpeed(),velocidade, motor.getCilindradas(), motor.getTipoCombustivel(), tanque.getCapacidade(), getFarol());
                        } 
                        

        
   
}
