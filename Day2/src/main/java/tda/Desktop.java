package tda;

public class Desktop extends Computer {
    public void startMenu() {
        System.out.println("Desktop "+"Opening the Start menu...");
    }

    public void microsoftStore() {
        System.out.println("Desktop "+"Opening the Microsoft Store...");
    }

    public static void main(String[] args) {
        Desktop myDesktop = new Desktop();
        myDesktop.createDocument();
        myDesktop.printDocument();
        myDesktop.internetSurfing();
        myDesktop.startMenu();
        myDesktop.microsoftStore();
    }
}
