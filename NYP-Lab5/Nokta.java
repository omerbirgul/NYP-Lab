public class Nokta {
    private double x;
    private double y;
    public static int counter=0;
    //public static String isim="";

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if(x<0.0)
            System.out.println("X degeri negatif olamaz");
        else
            this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if(y<0.0)
            System.out.println("Y degeri negatif olamaz");
        else
            this.y = y;
    }
    public Nokta(){
        setX(1.0);
        setY(1.0);
        counter++;
    }
    public Nokta(double x,double y){
        setX(x);
        setY(y);
        counter++;
    }
    public Nokta(Nokta n){
        setX(n.getX());
        setY(n.getY());
        counter++;
    }
    public void uzaklik(double digerX, double digerY){
        double xFarkKaresi = Math.pow(digerX - this.x, 2);
        //double xFarkKaresi = (digerX - x)*(digerX-getX());
        double yFarkKaresi = Math.pow(digerY - this.y, 2);
        double mesafe = Math.sqrt(xFarkKaresi + yFarkKaresi);
        System.out.println("Uzaklık: " + mesafe);
    }
    public void uzaklik(Nokta n)//metod overloading
    {
        this.uzaklik(n.getX(),n.getY());
    }
    public static void uzaklik(Nokta n1, Nokta n2){
        n1.uzaklik(n2);
        /*double xFarkKaresi = Math.pow(n1.getX() - n2.getX(), 2);
        double yFarkKaresi = Math.pow(n1.getY() - n2.getY(), 2);
        double mesafe = Math.sqrt(xFarkKaresi + yFarkKaresi);
        System.out.println("Uzaklık: " + mesafe);*/

    }

}
