import java.util.Scanner;
public class ArrayCafe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Nama makanan/minuman : ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Harga                : ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine();
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\n--- DAFTAR PESANAN KAFE ---");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }

        System.out.println("\n Total biaya: Rp " + totalBiaya);
    }
}
