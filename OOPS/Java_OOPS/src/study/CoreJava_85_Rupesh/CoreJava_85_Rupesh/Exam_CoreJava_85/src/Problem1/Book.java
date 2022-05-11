package Problem1;
/*
	 Q1. Write a Book class with following properties:                                 (25 Marks)
	- Member variables
		o String bookName
		o double bookCost
		o String authorName
	- Overloaded constructors
		o No arguments constructor
		o Constructor that accepts bookName and bookCost(authorName is hardcoded)
		o Constructor that accepts bookName, authorName and bookCost
	- Override toString
	- Other methods of own choice

	Write a menu driven program to demonstrate following operations using ArrayList of "Book":
	1. Add Book to list
	2. Remove Book list
	3. Show all Books
	4. Show all Books in sorted order (sort on the basis of bookCost)
	5. Find a book with bookName
	6. Save all Books details into file
	7. Quit
 */

public class Book {
	String bookName;
	double bookCost;
	String authorName;
	public Book() {

	}
	public Book(String name_of_book,double cost_Of_book)
	{
		this.bookName=name_of_book;
		this.bookCost= cost_Of_book;
		this.authorName="Sandip Mriddha";
	}
	public Book(String bookName, double bookCost, String authorName)
	{
		super();
		this.bookName = bookName;
		this.bookCost = bookCost;
		this.authorName = authorName;
	}
	//-Getters and setters-
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookCost() {
		return bookCost;
	}
	public void setBookCost(double bookCost) {
		this.bookCost = bookCost;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	//toString()  of Book class
	@Override
	public String toString() {
		return "\n Book [bookName=" + bookName + ", bookCost=" + bookCost + ", authorName=" + authorName + "]";
	}

}//end of class Book

