
/**
 * Write a description of class MusicLibrary here.
 * 
 * @author Paulo Lopes
 * @version 20160805
 */

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.lang.*;

public class MusicLibrary
{
    private ArrayList<String> tracks;
    private String diretorio;
    private SoundEngine player;
    
    public MusicLibrary(String diretorio){
        tracks = new ArrayList<String>();
        setDiretorio(diretorio);
        carregarDiretorio(this.diretorio);
        System.out.println(tracks.size() + " faixas adicionadas!");
        player = new SoundEngine();
    }
    
    
    public void setDiretorio(String diretorio){
        this.diretorio = diretorio;
    }
     
    public void carregarDiretorio(String diretorio){
        File file = new File(diretorio);
        File afile[] = file.listFiles();
        int i = 0;
        for (int j = afile.length; i < j; i++) {
            tracks.add(diretorio+"/"+afile[i].getName());
        }

    }
    
    public void addFile(String file){
        tracks.add(file);
    }
    
    public void getNumberOfFiles(){
       System.out.println(tracks.size());
    }
    
    public void listFiles(){
        //tracks.listIterator(); 
        
        for (int i = 0; i < tracks.size(); i++){
            System.out.println(i +": "+tracks.get(i));
        }
    }
    
    public void removeFile(int i){
        try{
            tracks.remove(tracks.get(i));
        }catch(IndexOutOfBoundsException e){
            System.out.println("Indice inválido");
        }
    }
    
    public void removeFile(String faixa){
        for (String musica: tracks){
            if(musica.toLowerCase().contains(faixa.toLowerCase())){
                tracks.remove(musica);
                System.out.println("Removendo... "+musica);
            }
        }
    }
    
    public void removeAll(){
        System.out.println("Diretorio limpo.");
        tracks.clear();
    }
    
    public void playFile(String file){
        player.playCompletely(file);
    }
    
    public void playAll(){
        for (String musica : tracks){
            System.out.println("Tocando... " +musica);
            player.playCompletely(musica);
        }
    }
}
