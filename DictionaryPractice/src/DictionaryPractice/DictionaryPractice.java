package DictionaryPractice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String, String > englSpanDictionary = new HashMap<String, String>();
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");

        // Retrieve things from the Dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));

        // Print out all keys
        System.out.println(englSpanDictionary.keySet());
        // Print out all Values
        System.out.println(englSpanDictionary.values());
        // Print out the size of the dictionary
        System.out.println("The size of our dictionary is " + englSpanDictionary.size());

        System.out.println();
        System.out.println();

        Map<String, Boolean > shoppingList = new HashMap<String, Boolean>();
        // Put some stuff in the dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", true);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);
        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));
        // Key value pairs
        System.out.println(shoppingList.toString());
        // Is empty
        System.out.println(shoppingList.isEmpty());
        // Remove items
        shoppingList.remove("Eggs");
        System.out.println(shoppingList.toString());
        // Replace items
        shoppingList.replace("Bread", false);
        System.out.println(shoppingList.toString());
        //Clear our dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        // Is empty
        System.out.println(shoppingList.isEmpty());
    }
}
