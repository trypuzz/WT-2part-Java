package firstLab;

public class Task14_Book {
	private String author;
	private String title;
	private static int edition;
	private int price;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Task14_Book)
			return title == ((Task14_Book) obj).title && author == ((Task14_Book) obj).author && price == ((Task14_Book) obj).price;
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
	public Task14_Book clone() {
		Task14_Book book = new Task14_Book();
		book.author = this.author;
		book.price = this.price;
		book.title = this.title;
		return book;
	}
}
