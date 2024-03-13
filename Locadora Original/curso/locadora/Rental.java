package curso.locadora;

public class Rental {
	
	private Movie _movie;

	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	int getFrequentRenterPoints() {
		return _movie.getFrequentRenterPoints(this._daysRented);
	}

	double getAmount() {
		return _movie.getAmount(this._daysRented);
	}
}