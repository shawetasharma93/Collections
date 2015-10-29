package collectiondemo.classes;

import java.util.*;

public class Arraylistexample {
public static void main(String[] args) {
	ArrayList<String> arraylist = new ArrayList<String>();
	System.out.println("size of arraylist+"+arraylist.size());
	arraylist.add("a");
	arraylist.add("b");
	arraylist.add("c");
	arraylist.add("d");
	  System.out.println("Element at index 1: "+arraylist.get(1));
	  System.out.println("Does list contains JAVA? "+arraylist.contains("a"));
	System.out.println("size of arraylist after addition"+arraylist.size());
	System.out.println("contents of arraylist"+arraylist);
	arraylist.add(2, "e");
	System.out.println("changed contents of arraylist are"+arraylist);
    ArrayList<String> copy = (ArrayList<String>) arraylist.clone();
    System.out.println("Cloned ArrayList:"+copy);
}
}
