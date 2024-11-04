import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args){

        // Create a LinkedList to hold items in a shopping list
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("Apple");   // Adds "Apple" as the first item
        shoppingList.add("Banana");  // Adds "Banana" as the second item, linked to "Apple"
        shoppingList.add("Orange");  // Adds "Orange" as the third item, linked to "Banana"

        // Display the initial order of items in the list
        System.out.println("Original List: " + shoppingList);

        // Insert "Mango" at index 1, between "Apple" and "Banana"
        shoppingList.add(1, "Mango");
        System.out.println("Inserted Mango at Index 1: " + shoppingList);

        // Remove the first element ("Apple") from the list
        shoppingList.removeFirst();
        System.out.println("Removed First Element: " + shoppingList);

        // Note: Linked lists provide efficient adding/removing of elements,
        // especially at the beginning or end, compared to array lists.
        // However, array lists are faster for accessing elements by index.

        // Make the linked list thread-safe by wrapping it with Collections.synchronizedList
        List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList);
        System.out.println("Synchronized List (Thread-Safe): " + synchronizedShoppingList);

        // TODO: Explore threads and how synchronization works with linked lists.
        // Linked lists are not synchronized by default, meaning multiple threads can access
        // and modify them simultaneously, which may lead to unpredictable behavior.
    }
}
