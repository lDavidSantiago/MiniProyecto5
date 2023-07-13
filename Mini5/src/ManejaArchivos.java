import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

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

    public void estarArchivos(){
        try {
            RandomAccessFile file = new RandomAccessFile("Mini5\\files\\archivo.txt","rw");
            file.seek(file.length());
            file.writeBytes("\nSImon");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}