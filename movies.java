package Week3Day4;

public class movies {

	private String movieTitle;
	private String movieGenre;

	public movies(String movieTitle, String movieGenre) {
		super();
		this.movieTitle = movieTitle;
		this.movieGenre = movieGenre;
	}

	public String getMovieTitle(String i) {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	//is this needed?
	public void printMovie() {
		System.out.println(movieGenre + ", " + movieTitle);
	}

}