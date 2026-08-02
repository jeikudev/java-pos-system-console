import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        ArrayList<String> ShoppingCart = new ArrayList<>();

        Menu[] products = {
                new Menu("Pandesal", 5, 2),
                new Menu("Ensaymada", 5, 6),
                new Menu("Choc Chip Cookie", 8, 1),
                new Menu("Croissant", 15, 7),
                new Menu("Cheesecake Slice", 4, 3)
        };

        int productMinLength = 20;
        int priceAndQuantityMinLength = 10;
        int productNumber = 1;

        System.out.println(
                "_________________________________________________\n" +
                        "| " + Utils.spaceFiller("Name", productMinLength + 4) +  Utils.spaceFiller("Price", priceAndQuantityMinLength) + Utils.spaceFiller("Quantity", priceAndQuantityMinLength) + "  |");
        for (Menu product : products) {
            System.out.println("| " + productNumber++ + " - " + Utils.spaceFiller(product.name, productMinLength)
                    + " "
                    + Utils.spaceFiller(Double.toString(product.price), priceAndQuantityMinLength)
                    + " "
                    + Utils.spaceFiller(Integer.toString(product.quantity), priceAndQuantityMinLength) + "|");
        }
        System.out.println("| 0 - " + Utils.spaceFiller("Checkout", productMinLength + 22) + "|");
        System.out.print("-------------------------------------------------\n" +
                "Select Order: ");


        int userChoice = -1;

        while (userChoice != 0) {
            String input = userInputScanner.nextLine();
            userChoice = Integer.parseInt(input);

            if (userChoice < 0 || userChoice > products.length) {
                System.out.print("Invalid choice, try again: ");
                continue;
            }

            if (userChoice == 0) {
                System.out.println("Proceeding to checkout...");
                System.out.println(ShoppingCart);
            } else {
                Menu chosenProduct = products[userChoice - 1];
                System.out.println("You selected: " + chosenProduct.name);
                ShoppingCart.add(chosenProduct.name);
                System.out.print("Select Order: ");
            }
        }
    }
}