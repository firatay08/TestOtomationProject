package component;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;



public class AnaIslemler {

    public static WebDriver webDriver;
    JsonIslemleri json=new JsonIslemleri();
    TxtIslemleri txt = new TxtIslemleri();
    ExcelIslemleri excel=new ExcelIslemleri();
    public WebElement webElement(By Locator){
        return webDriver.findElement(Locator);
    }


    public void openBrowser(){
        System.out.println("Tarayıcı açılıyor...");
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/IdeaProjects/TestAutomation/chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--start-maximized");

       // webDriver = new ChromeDriver( options );
        webDriver = new ChromeDriver();
    }


    public void closeBrowser(){
        System.out.println("Tarayıcı kapatılıyor...");
        webDriver.close();
    }


    public void goToLink(String link){
        webDriver.get(link);
    }


    public void pause(Integer seconds){
        try {
            int milliseconds=seconds*1000;
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void clickElement(String element){
        webDriver.findElement(By.xpath(json.getElement(element))).click();
}


    public void pressEnter()  {
        webDriver.findElement(By.xpath("//input[@placeholder='Ürün, Marka Arayın']")).sendKeys(Keys.ENTER);
    }

    public void pressKey(String key)  {
        String value="Keys."+key;
        webDriver.findElement(By.xpath("//body")).sendKeys(value);
    }


    public void clickText(String text){
        String newText="//*[text()='"+text+"']";
        webDriver.findElement(By.xpath(newText)).click();
    }


    public void logconsole(String message){
        System.out.println(message);
    }


    public void checkThePage(String page){
        if(webDriver.getTitle() != null && webDriver.getTitle().contains(page)){
            System.out.println("Sayfa Yüklendi.");
        }
        else{
            System.out.println("sayfa Yüklenemedi.");
            Assert.assertTrue(false);
        }
    }


    public void clearElement(String element){
        webDriver.findElement(By.xpath(json.getElement(element))).sendKeys(Keys.CONTROL + "a");
        webDriver.findElement(By.xpath(json.getElement(element))).sendKeys(Keys.DELETE);
    }


    public void textElement(String element, String text){
        webDriver.findElement(By.xpath(json.getElement(element))).sendKeys(text);
    }


    public void seeText(String text){
        String newText= "//*[text()='"+text+"']";
        By countInstructors=By.xpath(newText);
        int userNameCount = webDriver.findElements(countInstructors).size();
        if (userNameCount<1){
            Assert.assertTrue(false);
        }
    }


    public void setSelecbox(String element, String value){
        //sonIslemleri json=new JsonIslemleri();
        WebElement test =webDriver.findElement(By.id("#Ecom_Payment_Card_ExpDate_Month"));
        Select dropdown = new Select(test);
        dropdown.selectByIndex(4);
    }
    public void selectRaondumProduct(){
        int a= 2+(int)(Math.random()* 15);
        String element=json.getElement("urun");
        element= element.replace("?",String.valueOf(a));
        webDriver.findElement(By.xpath(element)).click();
    }

    public void textRandomMAil(String element){
        JsonIslemleri json=new JsonIslemleri();
        webDriver.findElement(By.xpath(json.getElement(element))).sendKeys(fastestRandomStringWithMixedCase(5)+"@test.com");
    }

    public String fastestRandomStringWithMixedCase(int length) {
        Random random = new Random();
        final int alphabetLength = 'Z' - 'A' + 1;
        StringBuilder result = new StringBuilder(length);
        while (result.length() < length) {
            final char charCaseBit = (char) (random.nextInt(2) << 5);
            result.append((char) (charCaseBit | ('A' + random.nextInt(alphabetLength))));
        }
        return result.toString();
    }
    public void WriteValueTotxt(String element) throws IOException {
        String value= webDriver.findElement(By.xpath(json.getElement(element))).getText();
        txt.writeTxt(value);
    }
    public void getFromExcel(int deger1,int deger2, String element) throws IOException {
        webDriver.findElement(By.xpath(json.getElement(element))).sendKeys(excel.reedExcel(deger1, deger2));
        //excel.reedExcel(deger1, deger2);
    }

}
