import java.util.Scanner;
public class ArrayNilaiMahasiswa26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlah = sc.nextInt();

        int[] nilaiMhs = new int[jumlah];
        int total = 0;
        int nilaiTertinggi, nilaiTerendah;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        
        nilaiTertinggi = nilaiMhs[0];
        nilaiTerendah = nilaiMhs[0];

        for (int i = 1; i < jumlah; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        
        double rataRata = (double) total / jumlah;

        System.out.println("\n--- HASIL NILAI MAHASISWA ---");
        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }

        System.out.println("\nNilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);
        }
    }

