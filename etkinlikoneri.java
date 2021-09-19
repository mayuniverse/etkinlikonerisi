import java.util.Scanner;

public class etkinlikoneri {
    public static void main(String[] args) {
    
        // değişkenleri tanımlayalım
        int sicaklik;

        // import sınıfını tanımla
        Scanner input = new Scanner(System.in);

        // kullanıcıdan input al
        System.out.println("Sıcaklığı C cinsinden yazınız");
        sicaklik = input.nextInt();
        System.out.println("Hava sıcaklığı " + sicaklik);

        // işlemleri yapalım
        if(sicaklik < 5){
            System.out.println("Kayak yapmak iyi bir seçim olabilir");
        }else if(sicaklik >= 5 && sicaklik <= 15){
            System.out.println("Hava tam sinemaya gitmelik. Vizyondaki filmlere bir göz atmalısın");
        }else if(sicaklik > 15 && sicaklik <=25 ){
            System.out.println("Hava harika, tam piknik yapmalık. Hadi hazırlan");
        }else{
            System.out.println("Tam yüzme havası var. Kesinlikle yüzmelisin");
        }

    }
    
}
