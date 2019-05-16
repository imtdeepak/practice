package datastructure;import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Stack
        Vector<String> vectorOfCards = new Vector<>();

        // Pushing new items to the Vector

        vectorOfCards.add("Jack");
        vectorOfCards.add("Queen");
        vectorOfCards.add("King");
        vectorOfCards.add("Ace");

        System.out.println("Stack => " + vectorOfCards);
        System.out.println();

        // Popping items from the Stack
        String cardAtTop = vectorOfCards.firstElement();  // Throws EmptyStackException if the stack is empty
        System.out.println("Stack.pop() => " + cardAtTop);
        System.out.println("Current Vector => " + vectorOfCards);
        System.out.println();

        cardAtTop = vectorOfCards.firstElement();
        System.out.println("Stack.peek() => " + cardAtTop);
        System.out.println("Current Stack => " + vectorOfCards);

        while (!vectorOfCards.isEmpty()) {
            System.out.println("Removing " + vectorOfCards.remove(0));
            System.out.println("Current Vector => " + vectorOfCards);

        }
        if (vectorOfCards.isEmpty()) {
            System.out.println("Vector is Empty");
        }

        // Get the item at the top of the stack without removing it


    }
}