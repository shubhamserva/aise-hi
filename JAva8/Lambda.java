package JAva8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {

	public static void main(String args[])
	{ 
		List<Person> people = Arrays.asList(new Person ("Cha","dick"),
				new Person ("qwe","asd"),new Person ("poiu","mnbv"),new Person ("asdfgh","lkjh"));
				
				
		Collections.sort(people,(p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
			
		Collections.sort(people,new Comparator<Person>() {
			@Override
			public int compare(Person a,Person b)
			{
				return 0;
			}
		});
		
		System.out.println("Printin all Persons");
		printAll(people);
		
		System.out.println("Printing persons with last name begining with C");
		printConditionally(people,new Condition() {
			
		})
		
		
		
		
	}

}
