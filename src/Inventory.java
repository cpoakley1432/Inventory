import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by cameronoakley on 10/12/15.
 */
public class Inventory {
    public static void main(String[] args){
        ArrayList<InventoryItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            int num = 1;
            for (InventoryItem item : items ){
                System.out.println(num + ". " + item.name + " " + item.quantity);
                num ++;
            }

            System.out.println(" [1] Create new inventory item");
            System.out.println(" [2] Update inventory item quantity");
            System.out.println(" [3] Remove inventory item");

            String item = scanner.nextLine();
            int itemNum = Integer.valueOf(item);

            if (itemNum == 1 ){
                System.out.println("Enter inventory item name and hit enter");
                String name = scanner.nextLine();
                InventoryItem invItem = new InventoryItem(name , 0 );
                items.add(invItem);
            }
            else if (itemNum == 2 ){
                System.out.println("Enter the product number you want to update quantity");
                String product = scanner.nextLine();
                int productNum = Integer.valueOf(product);
                System.out.println("Enter the product quantity");
                String quantity = scanner.nextLine();
                int quantityNum = Integer.valueOf(quantity);
                InventoryItem invItem = items.get(productNum - 1);
                invItem.quantity = quantityNum;
            }
            else if (itemNum == 3){
                System.out.println("Enter the product number you want to remove");
                String remove = scanner.nextLine();
                int removeNum = Integer.valueOf(remove);
                items.remove(removeNum - 1);
            }
        }
    }
}
