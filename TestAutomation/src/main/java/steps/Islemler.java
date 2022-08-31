package steps;

import component.AnaIslemler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.io.IOException;


public class Islemler extends AnaIslemler {

    @Given("taryıcıyı açarsam")
    public void taryiciyi_acarsam() {
        openBrowser();
    }

    @When("{string} adresine gidersem")
    public void adresineGidersem(String link) {
        goToLink(link);
    }

    @And("{string} sayfasının açıldığını görürüm")
    public void sayfasininAcildiginiGorurum(String page) {
        checkThePage(page);
    }

    @And("{string} öğesine tıklarsam")
    public void ogesineTiklarsam(String oge) {
        clickElement(oge);
    }

    @And("{string} metnine tıklarsam")
    public void metnineTiklarsam(String text) {
    }

    @And("kullanıcı bilgilerini doldurursam")
    public void kullaniciBilgileriniDoldurursam() {
    }

    @And("{int} saniye beklersem")
    public void saniyeBeklersem(int deger) {
        pause(deger);
    }

    @And("enter basarsam")
    public void enterBasarsam() {
        pressEnter();
    }

    @And("{string} metnini görürüm")
    public void metniniGorurum(String metin) {
        seeText(metin);
    }

    @And("{string} öğesini temizlersem")
    public void ogesiniTemizlersem(String element) {
        clearElement(element);
    }

    @And("{string} öğesine {string} yazarsam")
    public void ogesineYazarsam(String oge, String yazi) {
        textElement(oge,yazi);
    }

    @And("rasgele ürün seç")
    public void rasgeleUruSec() {
        selectRaondumProduct();
    }

    @And("sepete ekle ve kontrol et")
    public void sepeteEkleVeKontrolEt() {
    }

    @And("tarayıcıyı kapatırım")
    public void tarayiciyiKapatirim() {
        closeBrowser();
    }

    @And("{string} selectbox öğesine  {string} değeri atarsam")
    public void selectboxOgesineDegeriAtarsam(String oge, String deger) {
        setSelecbox(oge, deger);
    }

    @And("{string} öğesine rasgele mail oluşturup yazarsam")
    public void ogesineRasgeleMailOlusturupYazarsam(String oge) {
        textRandomMAil(oge);
    }

    @And("{string} tuşuna basarsam")
    public void tusunaBasarsam(String tus) {
    }

    @And("ekranı kontrol edersem")
    public void ekraniKontrolEdersem() {

    }

    @And("{string} bigisini çekip txt dosyasına yazarsam")
    public void writeValueToTxt (String element) throws IOException {
        WriteValueTotxt(element);
    }


    @And("excel dosyasından {int},{int} konumundan bilgi al {string} alanına yaz")
    public void excelDosyasindanBilgiAlAlaninaYaz(int deger1, int deger2, String element) throws IOException {
        getFromExcel(deger1,deger2,element);
    }
}
