package Day2;

public class Notebook extends Desktop {
    public void useWithoutPlug() {
        System.out.println("Notebook "+"Can use with out charger for 2 hour");
    }

    public static void main(String[] args) {
        Notebook myNotebook = new Notebook();
        myNotebook.createDocument();
        myNotebook.printDocument();
        myNotebook.internetSurfing();
        myNotebook.startMenu();
        myNotebook.microsoftStore();
        myNotebook.useWithoutPlug();
    }
}
