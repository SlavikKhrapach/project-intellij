public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Author: Slavik");
        printHello();
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

    private static void printHello() {
        printMessage("Hello");
    }

    private static void printHeader() {
        System.out.println("****************************************");
    }
}