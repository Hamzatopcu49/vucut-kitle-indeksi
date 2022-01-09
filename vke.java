import java.util.Scanner;

public class vke {

    public static void main(String[] args) {
 Scanner klavye=new Scanner(System.in);
System.out.print("LÜTFEN BOYUNUZU GİRİNİZ=");
 double boy =klavye.nextDouble();
System.out.print("LÜTFEN KİLONUZU GİRİNİZ="); 
 double kilo=klavye.nextDouble();
 double oran=boy/kilo;
 if(oran<2)
     System.out.println("ŞİŞMAN");
 else if(oran>2 && oran<=2)
      System.out.println("NORMAL");
 else 
      System.out.println("ZAYIF");
    }
    
}