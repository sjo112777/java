package sub2;

public class Movie {

	// 속성(멤버변수) - 클래스 속성은 캡슐화를 위해 무조건 private 선언
			private String title;
			private String director;
			private double rating;
			private int availableSeats;
			
			//생성자
			public Movie(String title, String director, double rating, int availableSeats) {
				this.title = title;
				this.director = director;
				this.rating = rating;
				this.availableSeats = availableSeats;
				
			}
			
			//메서드
			public boolean reserveSeat() {
				
				if(availableSeats > 0) {
					availableSeats --;
					return true;
					
				} else {
					return false;
				}
				
			}
			
			public void cancleReservation() {
				availableSeats ++;
				
			}
			
			public void show() {
				System.out.println("영화 제목 : " + title);
				System.out.println("감독 이름 : " + director);
				System.out.println("영화 평점 : " + rating);
				System.out.println("예약 가능한 좌석 수 : " + availableSeats);
				
			}
			
			//Getter, Setter
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			
			public String getDirector() {
				return director;
			}
			public void setDirector(String director) {
				this.director = director;
			}
			public double getRating() {
				return rating;
			}
			public void setRating(double rating) {
				this.rating = rating;
			}
			public int getAvailableSeats() {
				return availableSeats;
			}
			public void setAvailableSeats(int availableSeats) {
				this.availableSeats = availableSeats;
			}
	
}
