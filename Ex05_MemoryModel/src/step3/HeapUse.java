package step3;
	class Book{
		String title;
	}
	
public class HeapUse {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "�ڹ� Ŭ���� ����";
		
		Book book2 = book1;
		
		System.out.println("book1.title: " + book1.title);
		System.out.println("book2.title: " + book2.title);
		System.out.println("----------------------------");
		
		book2.title = "�ڹ� ������ ����";
		
		System.out.println("book1.title: " + book1.title);
		System.out.println("book2.title: " + book2.title);
	}

}