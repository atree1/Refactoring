package store;

public class Rental {

	private Movie movie;
	private int daysRented;

	public Rental(Movie _movie, int _daysRented) {
		super();
		this.movie = _movie;
		this.daysRented = _daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}

	
	int getFrequentRenterPoints() {
		 if((getMovie().getPriceCode()==Movie.NEW_RELEASE&&getDaysRented()>1))
				 {
			 return 2;
				 }
		 else {
			 return 1;
		 }
	 }
}
