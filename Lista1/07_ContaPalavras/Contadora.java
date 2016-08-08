
/**
 * Escreva a descrição da classe Contadora aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

import java.util.HashMap;
import java.util.Map;

public class Contadora
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String entrada;
    
    public void setEntrada(String entrada){
        this.entrada = entrada;
    }
    
    public Map<String, Integer> getEntrada(String entrada){
        String [] wordArray = entrada.split(" ");
                
        Map<String,Integer> wordsOccurs = new HashMap<String,Integer>();
        
        for(String word : wordArray){
            Integer valor = wordsOccurs.get(word);
            if(valor == null){
                wordsOccurs.put(word,1);
            }else{
                wordsOccurs.put(word, valor+1);
            }
        }
        
        return wordsOccurs;
    }
    
    
    public void imprimeMap(){
        Map<String,Integer> wordsOccurs = getEntrada(entrada);
        
        for (String key : wordsOccurs.keySet()){
            System.out.println(key + " : " + wordsOccurs.get(key));
        }
        
        
    }
    
    
        
    
}
