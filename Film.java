
public class Film {
	private String filmTitle;
	private int lengthOfFilm;

	
	public Film(String filmTitle, int lengthOfFilm ) {
		this.filmTitle=filmTitle;
		this.lengthOfFilm=lengthOfFilm;
	}
	
	public void setFilmTitle(String filmTitle) {
		this.filmTitle=filmTitle;
	}
	public void setLengthOfFilm(int lengthOfFilm) {
		this.lengthOfFilm=lengthOfFilm;
	}
	public String getFilmTitle() {
		return filmTitle;
	}
	public int getLengthOfFilm() {
		return lengthOfFilm;
	}
	
	public String toString() {
		return "Film: "+filmTitle+" Length: "+lengthOfFilm;
		}
	public boolean equal(Film f) {
		if( (f.equals(this.filmTitle))||(f.equals(this.lengthOfFilm))) {
			return true;
			
		}else 
			return false;
	}

	
}

	
