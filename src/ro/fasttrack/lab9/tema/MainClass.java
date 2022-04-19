package ro.fasttrack.lab9.tema;

public class MainClass {
    public static void main(String[] args) {
        Product produs = new Product(100, "sampon", "pentru par fin", 20);
        Cosmetics balsam = new Cosmetics(110, "balsam wella", "pentru par vopsit", 1, "alb", 200);
        Electronics telefon = new Electronics(1500, "samsung", "note 10", 5, "smartphone", 10, 2, 15, 200);
        Fridge frigider = new Fridge(2000, "electrolux", "side by side", 3, "incorporabil", 80, 60, 180, 50, 5);

        printProdus(produs);
        printCosmetics(balsam);
        printElectronics(telefon);
        printFridge(frigider);
    }

    public static void printFridge(Fridge f) {
        System.out.println("Producator: " + f.getName());
        System.out.println("Pret: " + f.getPrice());
        System.out.println("Tip: " + f.getDescription());
        System.out.println("Produse disponibile in stoc: " + f.getQuantity());
        System.out.println("Categorie: " + f.getType());
        System.out.println("Latime: " + f.getLength());
        System.out.println("Adancime: " + f.getWidth());
        System.out.println("Inaltime: " + f.getHeight());
        System.out.println("Greutate: " + f.getWeight());
    }

    public static void printProdus(Product p) {
        System.out.println("Produsul este: " + p.getName());
        System.out.println("Pretul este: " + p.getPrice());
        System.out.println("Special " + p.getDescription());
        System.out.println("Produse disponibile in stoc: " + p.getQuantity());
    }

    public static void printCosmetics(Cosmetics c) {
        System.out.println("Produs: " + c.getName());
        System.out.println("Pret: " + c.getPrice());
        System.out.println("Special " + c.getDescription());
        System.out.println("Produse disponibile in stoc: " + c.getQuantity());
        System.out.println("Culoarea ambalajului: " + c.getColor());
        System.out.println("Greutate neta: " + c.getWeight());
    }

    public static void printElectronics(Electronics e) {
        System.out.println("Producator: " + e.getName());
        System.out.println("Pret: " + e.getPrice());
        System.out.println("Tip: " + e.getDescription());
        System.out.println("Produse disponibile in stoc: " + e.getQuantity());
        System.out.println("Categorie: " + e.getType());
        System.out.println("Latime: " + e.getLength());
        System.out.println("Grosime: " + e.getWidth());
        System.out.println("Lungime: " + e.getHeight());
        System.out.println("Greutate: " + e.getWeight());
    }

}
