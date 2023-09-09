package collectionex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie{
	String movieName;
	int movieYear;
	double rating;
	public Movie(String movieName, int movieYear, double rating) {
		this.movieName=movieName;
		this.movieYear=movieYear;
		this.rating=rating;
	}
	@Override
	public String toString() {
		return "Movie: [movieName=" + movieName + ", movieYear=" + movieYear + ", rating=" + rating + "]";
	}	
}
class SortByYear implements Comparator<Movie>{
	
	public int compare(Movie o1,Movie o2) {
		return o1.movieYear-o2.movieYear;
	}
}

class SortByMovie implements Comparator<Movie>{
	
	public int compare(Movie o1,Movie o2) {
		return o1.movieName.compareTo(o2.movieName);
	}
}

public class ComparatorEx {

	public static void main(String[] args) {
		ArrayList<Movie> list=new ArrayList<Movie>();
		list.add(new Movie("Dhoom",2009,4.5));
		list.add(new Movie("Sholay",1998,4.9));
		list.add(new Movie("Idiots",2011,4.8));
		list.add(new Movie("Dangal",2015,4.6));
//		Collections.sort(list,new SortByYear());
		Collections.sort(list,new SortByMovie());
		
		for(Movie m:list) {
			System.out.println(m);
		}
	}

}
