public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 3, 7, 9, 0};
        int aranacak = 7;
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            giveAMessage("Sayi var: " + aranacak);
        } else {
            giveAMessage("Sayi yok: " + aranacak);
        }
    }

    public static void giveAMessage(String message) {
        System.out.println(message);
    }
}