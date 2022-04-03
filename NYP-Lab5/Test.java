public class Test {
    public static void main(String[] args)
    {
        Nokta n1=new Nokta();
        System.out.println(n1.counter+". Nokta:("+n1.getX()+","+n1.getY()+")");
        Nokta n2=new Nokta(3.0,3.0);
        System.out.println(n2.counter+". Nokta:("+n2.getX()+","+n2.getY()+")");
//        n1.uzaklik(n2.getX(),n2.getY());
  //      n1.uzaklik(n2);
    //    Nokta.uzaklik(n1,n2);
        Nokta n3=new Nokta(n2);
        System.out.println(n1.counter+". Nokta:("+n3.getX()+","+n3.getY()+")");


    }
}
