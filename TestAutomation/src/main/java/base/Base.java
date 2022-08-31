package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Base {
    private long startTime;

    @Before
    public void InitializeTest(){
        System.out.println("Sistem başlatılıyor...");
        startTime = System.currentTimeMillis();
    }

    @After
    public void TearBrowserTest(Scenario scenario){
        long endTime = System.currentTimeMillis();
        long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        double seconds = (double)estimatedTime/1000; // saniyeye çevirmek için 1000'e bölüyoruz.
        System.out.println("Test "+seconds+" saniyede sonuçlandı.");
    }
}
