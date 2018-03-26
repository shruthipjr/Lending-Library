package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Collectionstest {

	public static void main(String[] args) {
		
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		myArrayList.add(1);
		myArrayList.add(2);
		myArrayList.add(3);
		myArrayList.add(4);
		/*System.out.println(myArrayList.size());
		
		myArrayList.remove(3);
		System.out.println(myArrayList.size());
		System.out.println(" ");
		for(int i=0; i<myArrayList.size(); i++){
			
			System.out.println(myArrayList.get(i));
		}
		*/
		
		HashSet<Integer> myHashSet = new HashSet<Integer>();
		myHashSet.add(1);
		myHashSet.add(2);
		myHashSet.add(3);
		myHashSet.add(4);
		
		System.out.println("");
		//System.out.println(myHashSet.size());

		
		 Iterator<Integer> myIterator = myHashSet.iterator();
		 while(myIterator.hasNext()){
			int i = myIterator.next();
			System.out.println(i);
		 }
		 
		 System.out.println(myHashSet.remove(2));
		 System.out.println(myHashSet.size());
		 
		 Iterator<Integer> it = myHashSet.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
		 
		 
		 HashSet<String> hset = new HashSet<String>();
		 hset.add("one");
		 hset.add("two");
		 hset.add("three");
		 hset.add("four");
		 
		 
		 Iterator<String> itl = hset.iterator();
		 while(itl.hasNext()){
			 String s = itl.next();
			 System.out.println(s);
		 }
		
		 System.out.println("");
		 
		 hset.remove("three");
		 
		 Iterator<String> ittl = hset.iterator();
		 while(ittl.hasNext()){
			 System.out.println(ittl.next());
		 }
		 
		 
		 HashMap<Integer, String> myHashMap = new HashMap<>();
		 myHashMap.put(1, "one");
		 myHashMap.put(2, "two");
		 myHashMap.put(3, "three");
		 myHashMap.put(4, "four");
		 myHashMap.put(5, "fivfffe");
		 
		 System.out.println(myHashMap.size());
		 System.out.println("");
		 
		 myHashMap.remove(3);
		 myHashMap.put(3, "three");
		 
		 Iterator<String> myIte = myHashMap.values().iterator();
		 while(myIte.hasNext()){
			 System.out.println(myIte.next());
		 }
		
	}

}
