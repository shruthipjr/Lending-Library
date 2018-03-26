package models.test;

import static org.junit.Assert.*;

import org.junit.Test;

import models.Book;

public class BookTest {

	@Test
	public void testToEqualBooks() {
		Book book1 = new Book("100","","","","",1);
		Book book2 = new Book("100","","","","",1);
	
	   assertTrue(book2.equals(book1));
	}
	
	@Test
	public void test2NonEqualBooks(){
		Book book1 = new Book("100","","","","",1);
		Book book2 = new Book("101","","","","",1);
	
	   assertFalse(book1.equals(book2));
	}

}
