package sub2;



public class Book {
	
	// 속성(멤버변수) - 클래스 속성은 캡슐화를 위해 무조건 private 선언
		private String title;
		private String author;
		private String isbn;
		private int availableCopies;
		
		public Book(String title, String author, String isbn, int availableCopies) {
			this.title = title;
			this.author = author;
			this.isbn = isbn;
			this.availableCopies = availableCopies;
			
		}
		
		public boolean borrowBook() {
			
			if(availableCopies > 0) {
				availableCopies --;
				return true;
				
			} else {
				return false;
			}
			
		}
		
		public void returnBook() {
			availableCopies ++;
			
		}
		
		public void show() {
			System.out.println("도서명 : " + title);
			System.out.println("작가명 : " + author);
			System.out.println("도서번호 : " + isbn);
			System.out.println("도서 복사본 수 : " + availableCopies);
			
		}
		
		//Getter, Setter
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		
		public int getAvailableCopies() {
			return availableCopies;
		}
		public void setAvailableCopies(int availableCopies) {
			this.availableCopies = availableCopies;
		}
		
	
}
