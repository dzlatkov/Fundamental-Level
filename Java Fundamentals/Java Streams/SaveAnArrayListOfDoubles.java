import java.io.*;
import java.util.Arrays;
import java.util.List;

public class SaveAnArrayListOfDoubles {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Double> doublesList = Arrays.asList(
                6.0,
                3.52,
                5.53,
                15.5,
                66.9
        );
        try (
                ObjectOutputStream writer =
                        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("res/doubles.list")))
        ) {
            writer.writeObject(doublesList);
        }
        try (
                ObjectInputStream reader =
                        new ObjectInputStream(new BufferedInputStream(new FileInputStream("res/doubles.list")))
        ) {
            String fileRead = reader.readObject().toString();
            System.out.println(fileRead);
        }
    }
}

