package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("����1 ", "�ֱٿ�"));
		library.add(new Book("����2 ", "�ֱٿ�"));
		library.add(new Book("����3 ", "�ֱٿ�"));
		library.add(new Book("����4 ", "�ֱٿ�"));
		library.add(new Book("����5 ", "�ֱٿ�"));
		
		for(int i = 0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}
