package Mini5.controlador;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import Mini5.modelo.ModeloTrajes;

public class ManejaArchivos{



    public void leerArchivos(){
        try {
            RandomAccessFile file = new RandomAccessFile("Mini5\\files\\archivo.txt","r");
            String linea = "";
            while((linea = file.readLine())!=null){
                System.out.println(linea);
            }
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivos(String text, int i){
        
        try {
            RandomAccessFile file = new RandomAccessFile("Mini5\\files\\archivo.txt","rw");
            file.seek(file.length()+i);
            file.writeBytes(text);
            //String updateLine = textUpdated;
            file.writeBytes("\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void updateArchivos(String text,int i){
                
        try {
            RandomAccessFile file = new RandomAccessFile("Mini5\\files\\archivo.txt","rw");
            file.seek(i);
            file.writeBytes(text);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void deleteArchivos(int i){
                
        try {
            String a = "                                       ";
            RandomAccessFile file = new RandomAccessFile("Mini5\\files\\archivo.txt","rw");
            file.seek(i);
            for(int index = 0; index < 4; index++){
                file.writeBytes(a);
                //file.writeBytes(a.replaceAll("\t"," "));
                
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}