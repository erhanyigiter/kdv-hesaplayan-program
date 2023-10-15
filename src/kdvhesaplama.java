import java.util.Scanner;

public class kdvhesaplama {
    public static void main(String[] args) {

        double tutar, kdvsizfiyat, kdvlifiyat, kdv;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");

        tutar = inp.nextDouble();

        kdvsizfiyat = tutar;
        System.out.println("KDV'siz Tutarınız :" + kdvsizfiyat );

        double kdvorani = (tutar <=1000 && tutar >=1000 ) ? 0.20 : 0.08;
        System.out.println("KDV Oranınız: " + kdvorani);

        kdv = kdvorani * tutar;
        System.out.println("KDV Tutarınız: :" + kdv);

        kdvlifiyat = tutar + kdv ;
        System.out.println("KDV'li Tutarınız: :" + kdvlifiyat);


    }
}