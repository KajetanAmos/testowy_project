package Kolekcje;

import java.util.*;

public class ListTraining {
    public static void exList() {
        List<String> listOfNames = new ArrayList<String>();
        listOfNames.add("Kajetan");
        listOfNames.add("Kasia");
        listOfNames.add("Oliwia");
        System.out.println("Size before: " + listOfNames.size());
        listOfNames.add("Kajetan");
        System.out.println("Size after: " + listOfNames.size());
    }

    public static void exSet() {
        Set<String> setOfNames = new HashSet<>();
        setOfNames.add("Kajetan");
        setOfNames.add("Kasia");
        setOfNames.add("Oliwa");
        System.out.println("Size before: " + setOfNames.size());
        setOfNames.add("Kajetan");
        System.out.println("Size after: " + setOfNames.size());
    }

    public static void exMap() {
        Map<Integer, String> mapOfNames = new HashMap<>();
        mapOfNames.put(1, "Kajetan");
        mapOfNames.put(2, "Kasia");
        mapOfNames.put(3, "Oliwia");
        System.out.println("Size before: " + mapOfNames.size());
        mapOfNames.put(1, "Tomasz");
        System.out.println("Size after: " + mapOfNames.size());
        Collection<String> collectionNames = mapOfNames.values();
        System.out.println("Imiona:\n" + collectionNames);
    }

    public static void main(String[] args) {
        System.out.println("List: ");
        exList();
        System.out.println("Set: ");
        exSet();
        System.out.println("Map: ");
        exMap();

    }
}
