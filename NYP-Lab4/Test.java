import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
       // hesapSinifiTest();
        Nabiz obj=new Nabiz("ali","yılmaz",1997);
        obj.NabizHesapla();
    }
    public static void hesapSinifiTest()
    {
        Hesap obj = new Hesap("234234234", 0);
        obj.paraYatir(500);
        goruntule(obj);
        obj.paraCek(15);
        goruntule(obj);
    }
    public static void goruntule(Hesap h)
    {
        System.out.println("Hesap No:"+h.getHesapNo()+" Bakiye:"+h.getBakiye());
    }
}
