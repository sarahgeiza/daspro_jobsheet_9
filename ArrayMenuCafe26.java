import java.util.Scanner;
public class ArrayMenuCafe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("-- MENU KAFE --");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ketemu = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ketemu = true;
                break;
            }
        }

        System.out.println();
        if (ketemu) {
            System.out.println("Makanan \"" + cari + "\" tersedia di menu.");
        } else {
            System.out.println("Maaf, makanan \"" + cari + "\" tidak ada di menu.");
        }
    }
}
    

