package component;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TxtIslemleri {
    public void writeTxt(String value) throws IOException {
        File file = new File("UrunBilgisi.txt");
        if (!file.exists()) {
           file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(value+"  ");
        bWriter.close();

    }

}
