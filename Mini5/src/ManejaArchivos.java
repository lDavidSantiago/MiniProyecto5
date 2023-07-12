import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ManejaArchivos{

    public void leerArchivo() throws IOException{
        try {
            RandomAccessFile file = new RandomAccessFile("files\\archivo.txt","r");
            String linea = "";
            while((linea = file.readLine())!=null){
                System.out.println(linea);

            }
        } catch (FileNotFoundException e) {
            // TODO: handle exception
        }




    }
}