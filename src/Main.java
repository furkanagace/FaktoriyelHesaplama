import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
/*
        Scanner fakt = new Scanner(System.in);
        System.out.print("Faktoriyel Sayısı: ");
        int n = fakt.nextInt();
        int total = 1;

        for (int i=1;i<=n; i++){
            total = total * i;
        }
        System.out.println( n + " .Faktoriyel Sayısı: " + total);

 */
        System.out.println("Kombinasyon bulma");

        int a,b,atotal=1,btotal=1,abtotal=1,result=1;
        Scanner input= new Scanner(System.in);

        System.out.println("Bu uygulama birinci sayının\n" +
                "ikinci sayıya kombinasyonunu yapar");

        System.out.print("birinci sayıyı giriniz: ");
        a=input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        b=input.nextInt();

        for (int i=1;i<=a;i++){
            atotal=atotal*i;
        }
        System.out.println("Kullnıcıdan gelen birinci sayı 'a':"+a+"!"+"\n"+"faktoriyel değer: "+atotal);

        for(int i=1;i<=b;i++){
            btotal=btotal*i;
        }

        System.out.println("Kullanıcıdan gelen ikinci sayı 'b': "+ b+"!" + "\n" +
                "Faktöriyel değeri: " + btotal);

        for(int i=1;i<=(a-b);i++){
            abtotal=abtotal*i;
        }
        System.out.println("n-r: "+ (a-b)+"!" + "\n" + "Faktöriyel değeri: " + abtotal);

        result=atotal/(btotal*abtotal);

        System.out.println("C(a,b)=a!/(b!*(a-b)!): " +"İşlemin Sonucu: " + result);








    }
}