import java.util.Date;

public class Nabiz {
    private String ad;
    private String soyad;
    private int dogumYili;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    public Nabiz(String ad,String soyad, int dogumYili)
    {
        setSoyad(soyad);
        setDogumYili(dogumYili);
        setAd(ad);
    }
    public void NabizHesapla()
    {
        int yas=2021-getDogumYili();
        int n=220-yas;
        int maxn=(int)(n*0.85);
        int minn=(int)(n*0.5);
        System.out.println("Kişinin nabzının olması gereken aralığı:"+minn+"-"+maxn);
    }
}
