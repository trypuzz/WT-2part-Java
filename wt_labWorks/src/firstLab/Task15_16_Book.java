package firstLab;

import java.util.Comparator;

public class Task15_16_Book implements Comparable<Task15_16_Book> {
	private String author;
	private String title;
	private static int edition;
	private int price;
	private int isbn;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Task15_16_Book)
			return title == ((Task15_16_Book) obj).title && author == ((Task15_16_Book) obj).author && price == ((Task15_16_Book) obj).price;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return title.hashCode() + author.hashCode();
	}

	@Override
	public String toString() {
		return String.format("Title: %s, Author: %s, Price: %d, Edition: %d", title, author, price, edition);
	}

	@Override
	public Task15_16_Book clone() {
		Task15_16_Book book = new Task15_16_Book();
		book.author = this.author;
		book.price = this.price;
		book.title = this.title;
		return book;
	}

	public int compareTo(Task15_16_Book book) {
		if (this.isbn > book.isbn)
			return 1;
		else if (this.isbn < book.isbn)
			return -1;
		else
			return 0;
	}

	public static Comparator<Task15_16_Book> byPrice = Comparator.comparingInt(book -> book.price);

	public static Comparator<Task15_16_Book> byAuthor = (book1, book2) -> {
		return book1.author.compareToIgnoreCase(book2.author);
	};

	public static Comparator<Task15_16_Book> byTitle = (book1, book2) -> {
		return book1.title.compareToIgnoreCase(book2.title);
	};

	public static Comparator<Task15_16_Book> byTitleThanAuthor = byTitle.thenComparing(byAuthor);
	public static Comparator<Task15_16_Book> byAuthorThanTitle = byAuthor.thenComparing(byTitle);
	public static Comparator<Task15_16_Book> byAuthorThanTitleThanPrice = byAuthor.thenComparing(byTitle).thenComparing(byPrice);
}