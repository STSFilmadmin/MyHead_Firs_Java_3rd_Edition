package chapter2;

class Movie{
	String title;
	String genre;
	int rating;
	void playIt(){
		System.out.println("відтворення фільму");
	}
	
}
public class MovieTestDrive {

	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Пропавші безвісти";
		one.rating = -2;
		one.genre = "Трагедія";
		
		Movie two = new Movie();
		two.title = "Загублений у офісі";
		two.rating = 127;
		two.genre = "Комедія";
		
		Movie three = new Movie();
		three.title = "Байт-клуб";
		three.rating = 127;
		three.genre = "незнаю який. ле подивитись мона";
		
		
		
	}

}
