Feature: UrunKontrol

  @Test
  Scenario: Urun Ekleme Ve silme
    Given taryıcıyı açarsam
    When "https://www.beymen.com" adresine gidersem
    Then "Beymen.com – Türkiye’nin Tek Dijital Lüks Platformu" sayfasının açıldığını görürüm
    And excel dosyasından 0,0 konumundan bilgi al "arama kutusu" alanına yaz
    And "arama kutusu" öğesini temizlersem
    And excel dosyasından 0,1 konumundan bilgi al "arama kutusu" alanına yaz
    And enter basarsam
    And 3 saniye beklersem
    And rasgele ürün seç
    And "urun bilgisi" bigisini çekip txt dosyasına yazarsam
    And "fiyat" bigisini çekip txt dosyasına yazarsam
    And "beden" öğesine tıklarsam
    And 1 saniye beklersem
    And "sepete ekle" öğesine tıklarsam
    And "sepete ekle" öğesine tıklarsam
    And 5 saniye beklersem
    And "sepetim" öğesine tıklarsam
    And 3 saniye beklersem
    And "sil" öğesine tıklarsam
    And 2 saniye beklersem
    Then "Sepetinizde Ürün Bulunmamaktadır" metnini görürüm
