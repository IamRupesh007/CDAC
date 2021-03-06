package Problem1;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static final Scanner sc=new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Book> book_Array_list = new ArrayList<>();
		int choice=0;
		book_Array_list.add(new Book("2 States",500,"Chetan Bhagat"));
		book_Array_list.add(new Book("Head First Java",1200,"Kathy Sierra"));
		book_Array_list.add(new Book("Kite",750,"Ashish"));
		book_Array_list.add(new Book("Blue",500,"Akshay"));

		do 
		{
			System.out.println("\n Please Enter A Choice ");
			System.out.println("\n1. Add Book to list"
					+ "\n2. Remove Book list"
					+ "\n3. Show all Books"
					+ "\n4. Show all Books in sorted order (sort on the basis of bookCost)"
					+ "\n5. Find a book with bookName"
					+ "\n6. Save all Books details into file"
					+ "\n7. Quit");
			System.out.println("Enter ur choice menu no here:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("\n **** Adding book to database **** ");
				sc.nextLine();
				System.out.println("\nEnter the book name Author name and Cost :");
				String name=sc.nextLine();
				String authourname=sc.nextLine();
				double cost=sc.nextDouble();
				book_Array_list.add(new Book(name,cost,authourname)); //add element at the last index in arrayList
				editthebookfile(book_Array_list); 
				break;
			}
			case 2:
			{
				System.out.println("\n ********* Remove the book database ********");
				if(book_Array_list.isEmpty()== true)
				{
					System.out.println("\n there is nothing to remove in book database");
				}
				book_Array_list.clear();//clears all list 
				if(book_Array_list.isEmpty()== true)
				{
					System.out.println("\n we are deleting the whole book data sucsessfully");
				}
				break;
			}
			case 3:
			{
				System.out.println("\n ****** View books database ****");
				view_book_info(book_Array_list);
				break;
			}
			case 4:
			{
				System.out.println("\n **** Show all Books in sorted order **** ");
				Collections.sort(book_Array_list,new  cost_sort()); //cost sorted using custom sort
				view_book_info(book_Array_list);
				break;
			}
			case 5:
			{
				System.out.println("\n **** Find a book in a list **** ");
				System.out.println("Enter the name of book:");
				String name1=sc.nextLine();
				if( book_Array_list.contains(name1) == false )
				{
					System.out.println("\n book is present in the list with this name: " + name1);

				}
				else
				{
					System.out.println("\nbook is not present in the list with this name: " +name1);
				}
				break;
			}
			case 6:
			{
				editthebookfile(book_Array_list);
				break;
			}

			default:
			{
				if(choice==7)
				{
					System.out.println("**Invalid choice**");

				}
				break;
			}	

			}//end of switch case



		}while(choice !=7);

	}//end of main method 


	public static void view_book_info(ArrayList<Book> list_book)
	{
		int i=0;
		for(Book b : list_book)
		{
			i+=1;
			System.out.println("\n" +i +" "+ b.toString());
		}

	}



	public static void editthebookfile(ArrayList<Book> book_list) throws FileNotFoundException
	{	boolean append = true;
		FileOutputStream fout=new FileOutputStream("D:\\Book_info.txt",append);

		//we are opening a file in append mode
		//boolean append=true;
		//FileOutputStream fout=new FileOutputStream("E:\\FileIO\\studentinfo.txt",append);

		PrintWriter pw =new PrintWriter(fout);

		/*for(Book b:book_list)
		{
			pw.println(b.toString());
		}*/
		Iterator<Book> it = book_list.iterator();
		while(it.hasNext())
		{
			pw.println(it.next());
		}

		System.out.println("\n Data Added Successfully to the file");

		pw.flush();
		pw.close();
	}
}//end of class Menudriven_Book 
class cost_sort implements Comparator<Book>
{

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getBookCost() > o2.getBookCost())
		{
			return 1;

		}
		if(o1.getBookCost()<o2.getBookCost())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}//end of compare function

}//end of class 

