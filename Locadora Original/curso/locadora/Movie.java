package curso.locadora;

public abstract class Movie {
	
	public static final int CHILDRENS = 2;

	public static final int REGULAR = 0;

	public static final int NEW_RELEASE = 1;

	private String _title;
	
	abstract double getAmount(int daysRented);
	
	public static Movie createMovie(String title, int priceCode) {
		if (priceCode == REGULAR)
			return new Regular(title);
		if (priceCode == NEW_RELEASE)
			return new NewRelease(title);
		if (priceCode == CHILDRENS)
			return new Childrens(title);
		throw new RuntimeException("Movie type is not defined");
	}

	public Movie(String title, int priceCode) {
		_title = title;
	}

	public String getTitle() {
		return _title;
	}

	int getFrequentRenterPoints(int daysRented) {
		return 1;
	};
}