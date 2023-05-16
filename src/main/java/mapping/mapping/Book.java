package mapping.mapping;

import javax.persistence.*;
import mapping.mapping.Author;
@Entity
public class Book {
	@Id
	private int book_id;
	private String book_name;
	@OneToOne
	private Author a2;
	public Author getA2() {
		return a2;
	}
	public void setA2(Author a2) {
		this.a2 = a2;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
}
