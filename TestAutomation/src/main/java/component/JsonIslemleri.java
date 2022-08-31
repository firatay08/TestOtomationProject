package component;

import org.json.simple.JSONObject;
import java.io.FileReader;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JsonIslemleri {

    public String getElement(String elementKey){
        String sonuc = (String) getDataFile("UrunKontrol.json").get(elementKey);
        return sonuc;
    }

    protected JSONObject getDataFile(String dataFileName) {
        String dataFilePath = "src/test/resources/Jsons/";
        JSONObject testObject = null;

        try {
            FileReader reader = new FileReader(dataFilePath + dataFileName);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            testObject = (JSONObject) jsonObject;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return testObject;
    }

}



