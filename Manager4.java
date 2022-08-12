//author : preetha
//write the java program printing the book using aggregation
class Author
{	int Author_LN;
	String Author_name;
	String Author_add;	
	Author(int Author_LN,String Author_name,String  Author_add){
		this.Author_LN = Author_LN;
		this.Author_name =Author_name;
		this.Author_add =Author_add;
	}
	
}
class Books{	
	Author Ath;//Aggregation or Has A relatiship	
	String Book_name;
	String Publications;
	int Price;	
	Books(String Book_name,String Publications,int Price,Author ath)
	{
		this.Book_name = Book_name;
		this.Publications = Publications;
		this.Price =Price;
		this.Ath=ath;		
	}
}
class Books1{	
}
public class Manager4 {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author(4050, "Jhon", "USA");
		Author author1 = new Author(22, "kandy", "india");
		Books book = new Books("Java","Orelly",1200,author);		
		Books book1 = new Books("C++","IITI",600,author);
		System.out.println(book.Book_name +" ,"+book.Publications);		
		System.out.println(book.Ath.Author_add);
		System.out.println(book.Ath.Author_name);
		
		System.out.println("=============================");
		System.out.println(book1.Book_name +" ,"+book.Publications);		
		System.out.println(book1.Ath.Author_add);
		System.out.println(book1.Ath.Author_name);
		System.out.println("==========DONE=================");
				
		
	}

}