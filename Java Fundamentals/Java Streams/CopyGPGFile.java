import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyGPGFile {
    public static void main(String[] args) {
        try(
                FileInputStream fis = new FileInputStream("res/picture.jpg") ;
                FileOutputStream fos = new FileOutputStream("res/my-copied-picture.jpg") ;
        ){
            // int i;
            // while((i = fis.read()) != -1){
            // fos.write(i);
            byte[] buffer = new byte[4096];
            int readBytes;
            while (!((readBytes= fis.read(buffer,0, buffer.length))<= 0)){
                fos.write(buffer,0,readBytes);
            }
        }
        catch (IOException ioe){
            System.out.printf(ioe.toString());
        }

    }
}
