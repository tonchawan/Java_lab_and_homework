package tda;

public class Macbook extends iMac {
    public void useWithoutPlug() {
        System.out.println("Macbook "+"It can use with out plug");
    }
    public static void main(String[] args) {
        Macbook myMacbook = new Macbook();
        myMacbook.createDocument();
        myMacbook.printDocument();
        myMacbook.internetSurfing();
        myMacbook.magicMouse();
        myMacbook.appStore();;
        myMacbook.useWithoutPlug();
    }

    
}
