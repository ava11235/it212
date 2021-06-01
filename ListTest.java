// Class to test methods of LinkedIntList class

public class ListTest {
	
	    public static void main(String[] args) {
	     

	        LinkedIntList list = new LinkedIntList();
	        processList(list);
	    }

	    public static void processList(LinkedIntList list) {
	        list.add(20);
	        list.add(11);
	        list.add(73);
	        list.add(111);
	        System.out.println(list);
	        list.remove(1);
	        System.out.println(list);
	        
	        
	    }
	}

