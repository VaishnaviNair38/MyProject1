import java.util.LinkedList;
import java.util.List;

public class TestCollection {
	public static void main(String[] args) {
		List<Integer> lst= new LinkedList<Integer>();//generic
		lst.add(new Integer(10));//boxing
		lst.add(new Integer(20));
		lst.add(10);//autoboxing
		lst.add(100);
		lst.add(1);
		System.out.println(lst.contains(20));
		System.out.println(lst.get(2));
		System.out.println(lst.indexOf(10));//will print the first index of 10
		System.out.println(lst.remove(4));
		System.out.println(lst.lastIndexOf(10));
		System.out.println(lst);		
	}
}
