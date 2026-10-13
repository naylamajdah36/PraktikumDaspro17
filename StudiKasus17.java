import java.util.Scanner;
public class StudiKasus17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurangBayar;

        // input jumlah cup dan uang yang dibayar
        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang yang dibayar: ");
        uangBayar = sc.nextInt();

        //menghitung total harga dan diskon
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        // menghitung diskon jika total harga >= 100000
        if (totalHarga >= 100000) {
            diskon = (int) (totalHarga * 10 / 100); // Diskon 10%
        } else {
            diskon = 0; // Tidak ada diskon
        }
        totalBayar = totalHarga - diskon;

        // menampilkan hasil perhitungan
        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);

        // menghitung kembalian atau kekurangan bayar
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurangBayar = totalBayar - uangBayar;
            System.out.println("Uang yang dibayar kurang: " + kurangBayar);
        }

    }
}
