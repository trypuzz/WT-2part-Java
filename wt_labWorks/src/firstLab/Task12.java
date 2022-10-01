package firstLab;

public class Task12 {
	private String author;
	private String title;
	private static int edition;
	private int price;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Task12)
			return title == ((Task12) obj).title && author == ((Task12) obj).author && price == ((Task12) obj).price;
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
