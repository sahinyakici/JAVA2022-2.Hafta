public class Main {
    public static void main(String[] args) {
        add();
        update();
        delete();
        int sumTest = sum(5, 7);
        int sumTest2 = sum2(1, 2, 3, 56, 4, 6, 8, 9, 5, 4, 6, 5, 5);
        System.out.println(sumTest);
        System.out.println(sumTest2);
    }

    public static void add() {
        System.out.println("Adding is successful");
    }

    public static void delete() {
        System.out.println("Deleting is successful");
    }

    public static void update() {
        System.out.println("Updating is successful");
    }

    public static int sum(int v1, int v2) {
        return v1 + v2;
    }

    public static int sum2(int... sayi) {
        int toplam = 0;
        for (int toplanacak : sayi) {
            toplam += toplanacak;
        }
        return toplam;
    }
}