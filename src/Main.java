public class Main {
    public static void main(String[] args) {
        printHeader();
        System.out.println("Hello world!");

        printHeader();
        System.out.println("Author: Slavik");
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

    private static void printHeader() {
        System.out.println("****************************************");
    }
}