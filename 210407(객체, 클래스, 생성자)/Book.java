
public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title = t; author = "�۰��̻�";
	}
	
	public Book(String t, String a) {
		title = t; author = a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book littlePrince = new Book("�����", "�������丮");
		Book loveStory = new Book("������");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
