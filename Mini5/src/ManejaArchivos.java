import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class ManejaArchivos{

    public void leerArchivos(){
        try {
            RandomAccessFile file = new RandomAccessFile("files\\archivo.txt","r");
            String linea = "";
            while((linea = file.readLine())!=null){
                System.out.println(linea);
            }
        
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void estarArchivos(){
        try {
            RandomAccessFile file = new RandomAccessFile("files\\archivo.txt","rw");
            file.seek(file.length());
            file.writeBytes("\nSImon");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}