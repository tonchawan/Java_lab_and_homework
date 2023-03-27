package tda;

public class iMac extends Computer {
    public void magicMouse() {
        System.out.println("IMac "+"Have a magic mouse...");
    }

    public void appStore() {
        System.out.println("IMac "+"Opening the Apple Store...");
    }

    public static void main(String[] args) {
        iMac myIMac = new iMac();
        myIMac.createDocument();
        myIMac.printDocument();
        myIMac.internetSurfing();
        myIMac.magicMouse();
        myIMac.appStore();
    }
}
