package CollectionFrameWorks;

import java.util.ArrayList;

public class RemoveArrayList {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(10);
		a.add(150);
		ArrayList a1= new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(200);
		a1.add(5500);
		
		a.removeAll(a1);
		System.out.println(a1);
		
	}

}