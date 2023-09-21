import java.util.Scanner;
public class Gaji22 {
public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    int jmlMasuk, JmlTdkMasuk, TotGaji;
    int gaji, potGaji;
    System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
    jmlMasuk=input.nextInt();
    System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
    JmlTdkMasuk=input.nextInt();
    System.out.println("Masukkan Jumlah besaran gaji ");
    gaji=input.nextInt();
    System.out.println("Masukkan Jumlah potongan gaji ");
    potGaji=input.nextInt();

    TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
    System.out.println("Gaji yang anda terima adalah " + TotGaji); 
}
 }
