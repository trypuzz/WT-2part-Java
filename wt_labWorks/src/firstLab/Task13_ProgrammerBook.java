package firstLab;

public class Task13_ProgrammerBook {
	private int level;
	private String language;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Task13_ProgrammerBook)
			return super.equals(obj) && language == ((Task13_ProgrammerBook) obj).language && level == ((Task13_ProgrammerBook) obj).level;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + language.hashCode();
	}

	@Override
	public String toString() {
		return String.format("%s, Language: %s, Level: %d", super.toString(), language, level);
	}
}
