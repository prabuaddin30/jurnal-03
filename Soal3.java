import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args){
        double nilaiPraktikum, nilaiAsesmenSatu, nilaiAsesmenDua;
        double nilaiAkhir;
        Scanner input = new Scanner(System.in);
        nilaiPraktikum = 70;
        nilaiAsesmenSatu = 55;
        nilaiAsesmenDua = 33;
        nilaiAkhir = (nilaiPraktikum * 25/100) + (nilaiAsesmenSatu * 35/100) + (nilaiAsesmenDua * 40/100);
        System.out.println("");
        System.out.println("Nilai Praktikum (P) = "+nilaiPraktikum);
        System.out.println("Nilai Asesmen 1 (A) = "+nilaiAsesmenSatu);
        System.out.println("Nilai Asesmen 2 (B) = "+nilaiAsesmenDua);
        System.out.println("Nilai Akhir (NA) = 25%*P + 35%*A + 40%*B = "+nilaiAkhir);
    }
}