package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("토지1 ", "최근욱"));
		library.add(new Book("토지2 ", "최근욱"));
		library.add(new Book("토지3 ", "최근욱"));
		library.add(new Book("토지4 ", "최근욱"));
		library.add(new Book("토지5 ", "최근욱"));
		
		for(int i = 0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}
