import java.util.Scanner;
public class HargaBayar22 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
    int harga, jumlah, jumlahHalamanbuku;
    String merkBuku;
    double disc, total, bayar, jmlDisc;
    System.out.println("Masukkan merk buku ");
    merkBuku=input.nextLine();
    System.out.println("Masukkan jumlah halaman buku ");
    jumlahHalamanbuku=input.nextInt();
    System.out.println("Masukkan harga barang yang beli ");
    harga=input.nextInt();
    System.out.println("Masukkan Jumlah Jumlah barang yang dibeli ");
    jumlah=input.nextInt();
    System.out.println("Masukkan besaran diskon ");
    disc=input.nextDouble();
    total=harga*jumlah;
    jmlDisc =total*disc;
    bayar=total-jmlDisc;
    System.out.println("Diskon yang anda dapatkan adalah " +jmlDisc);
    System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}
