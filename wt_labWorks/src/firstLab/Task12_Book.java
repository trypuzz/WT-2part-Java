package firstLab;

public class Task12_Book {
	private String author;
	private String title;
	private static int edition;
	private int price;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Task12_Book)
			return title == ((Task12_Book) obj).title && author == ((Task12_Book) obj).author && price == ((Task12_Book) obj).price;
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
}
