import java.util.Scanner;

public class Ucgenin_kenari {
    public static void main(String[] args) {
        int a,b,c,alan,u;

        Scanner girdi=new Scanner(System.in);
        System.out.println("Birinci Kenarı Girin :");
        a=girdi.nextInt();
        System.out.println("İkinci Kenarı Girin :");
        b=girdi.nextInt();
        System.out.println("Üçüncü Kenarı Girin :");
        c=girdi.nextInt();
        u=(a+b+c)/2;
        alan=(int)Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı :"+alan);

    }
}
