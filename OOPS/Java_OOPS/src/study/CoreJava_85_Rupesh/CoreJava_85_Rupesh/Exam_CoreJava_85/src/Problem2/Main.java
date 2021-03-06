package Problem2;

		/*Write a program that creates a HashMap of rollnumber and name. 
     Accept 5 pairs of rollnumber and name from user and add to hashmap
     Show all rollnumbers in the hashmap[ use Iterator ]
     Show all names in the hashmap [ use for loop without index ]
*/

		import java.util.HashMap;
		import java.util.Map.Entry;
		import java.util.Iterator;
		import java.util.Scanner;
		import java.util.Set;

		public class Main {

			public static void main(String[] args) {
				HashMap<Integer, String> h1 = new HashMap<Integer, String>();
				Scanner sc = new Scanner( System.in);
				for(int i =0;i<5;i++) //accept only 5 Pairs
				{
					System.out.println("Enter roll number and name");
					int num = sc.nextInt();// 1
					String name = sc.next();// Rupesh
					h1.put(num, name);	
				}
//				h1.put(1, "Rupesh "); this will be hardcoded representation
				
				System.out.println("All Students: ");
				Set<Integer> list = h1.keySet();// 1 2 3 4 5 
				//******** Iterator ************
				Iterator<Integer> it = list.iterator();
				
				while(it.hasNext())
				{
					int key = it.next();
					//String name = h1.get(key);// 1 Rupesh 
				System.out.println("Roll number: "+ key); //" Name: "+ name
				}
				//***************** for loop without index ***********
				System.out.println("Using For Loop without Index");
				for(Entry<Integer, String> set : h1.entrySet())
				{
					System.out.println(set.getKey()+" "+set.getValue());
				}
					
				sc.close();
			}
		}

