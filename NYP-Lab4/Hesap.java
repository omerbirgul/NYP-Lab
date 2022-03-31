public class Hesap {
    private double bakiye;
    private String hesapNo;// hesapno yerine isimde olabilir

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        if (bakiye < 0) {
            System.out.println("Bakiye 0'dan kucuk olamaz");
            this.bakiye = 0.0;
        } else
            this.bakiye = bakiye;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public Hesap(String hesapNo, double bakiye) {
        this.hesapNo = hesapNo;
       //this.bakiye=bakiye;
        setBakiye(bakiye);
        }
        public void paraYatir(double miktar)
        {
            if(miktar>0)
                this.bakiye+=miktar;
        }

    public void paraCek(double miktar) {
        if (miktar > this.bakiye)
            System.out.println("Bakiyeniz yetersiz. Daha küçük bir tutar giriniz");
        else
            setBakiye((this.bakiye-miktar));
    }
}
