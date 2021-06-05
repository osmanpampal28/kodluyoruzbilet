import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double ucret=0.10;
        double fiyat;
        System.out.println("Mesafeyi km türünden giriniz : ");
        Scanner scanner=new Scanner(System.in);
        int mesafe=scanner.nextInt();
        while(mesafe<0){
            System.out.println("hatalı! Tekrar mesafe giriniz : ");
            mesafe=scanner.nextInt();
        }
        System.out.println("Yaşınızı giriniz : ");
        int yas=scanner.nextInt();
        while(yas<0){
            System.out.println("hatalı! Tekrar yaş giriniz : ");
            yas=scanner.nextInt();
        }
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int secim=scanner.nextInt();

        fiyat=mesafe*ucret;
        if(yas<12) {
            double indirim = fiyat / 2;
            fiyat-=indirim;
        }
        else if(yas>=12 && yas <24) {
            double indirim = fiyat / 10;
            fiyat-=indirim;
        }
        else if(yas>65) {
            double indirim = (fiyat * 3) / 10;
            fiyat-=indirim;
        }
        if(secim==2) {
            double indirim2=(fiyat*3)/10;
            fiyat-=indirim2;
        }

        System.out.println("Toplam tutar = "+fiyat);
    }
}
