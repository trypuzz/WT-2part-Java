package firstLab;

public class Task14 {
	private String author;
	private String title;
	private static int edition;
	private int price;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Task14)
			return title == ((Task14) obj).title && author == ((Task14) obj).author && price == ((Task14) obj).price;
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
	public Task14 clone() {
		Task14 book = new Task14();
		book.author = this.author;
		book.price = this.price;
		book.title = this.title;
		return book;
	}
}
