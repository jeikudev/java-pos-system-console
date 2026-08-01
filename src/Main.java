import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        Menu[] products = {
                new Menu("Pandesal", 5, 2),
                new Menu("Ensaymada", 5, 6),
                new Menu("Choc Chip Cookie", 8, 1),
                new Menu("Croissant", 15, 7),
                new Menu("Cheesecake Slice", 4, 3)
        };

        int productMinLength = 20;
        int priceAndQuantityMinLength = 10;

        System.out.println(
                "____________________________________________\n" +
                        "| " + Utils.spaceFiller("Name", productMinLength) +  Utils.spaceFiller("Price", priceAndQuantityMinLength) + Utils.spaceFiller("Quantity", priceAndQuantityMinLength) + "  |");
        for (Menu product : products) {
            System.out.println("| " + Utils.spaceFiller(product.name, productMinLength)
                    + " "
                    + Utils.spaceFiller(Double.toString(product.price), priceAndQuantityMinLength)
                    + " "
                    + Utils.spaceFiller(Integer.toString(product.quantity), priceAndQuantityMinLength) + "|");
        }
        System.out.println("---------------------------------------------");


    }
}