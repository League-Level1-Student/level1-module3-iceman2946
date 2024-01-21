package _04_netflix;

public class NetflixRunner {
	public static void main(String[] args) {
	  Movie outsiders= new Movie("The Outsiders",4);
	  Movie giver= new Movie("The Giver",3);
	  Movie shrek= new Movie("Shrek",5);
	  Movie galaxy= new Movie("Guardians of the Galaxy",2);
	  Movie home= new Movie("Home Alone",4);
	  System.out.println(shrek.getTicketPrice());
	  NetflixQueue queue= new NetflixQueue();
	  queue.addMovie(home);
	  queue.addMovie(galaxy);
	  queue.addMovie(giver);
	  queue.addMovie(outsiders);
	  queue.addMovie(shrek);
	  queue.printMovies();
	  System.out.println("The best movie is "+queue.getBestMovie());
	  
  }
}
