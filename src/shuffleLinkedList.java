import java.util.*;
public class shuffleLinkedList {
	public static void main(String args[]) {
		LinkedList<Integer> list= new LinkedList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of items you want to add");
		int num = input.nextInt();
		while(num!=0) {
			list.add(input.nextInt());
			num--;
		}
		Collections.shuffle(list);
		System.out.println(list);
		
	}

}
