

public class Main {
	
	public static void main(String[] args) {

		
		Course course1 = new Course(1, "Yazılım Geliştirici Yazılım Kampı(C# + Angular)", "Engin DEMİROĞ");
		
		Course course2 = new Course(2, "Yazılım Geliştirici Yazılım Kampı(Java + React)", "Engin DEMİROĞ");
		
		Course course3 = new Course(3, "Programlmaya Giriş İçin Temel Kurs", "Engin DEMİROĞ");
		
		System.out.println("-----------------------KURSLAR------------------------------");
		
		
		
		
		courseManager courseManager = new courseManager();
		
		courseManager.addToCart(course1);
		courseManager.addToCart(course2);
		courseManager.addToCart(course3);
		
		System.out.println("-------------------KATEGORİLER------------------------------");
		
		Category category1 = new Category(); {
		    category1.setCategoryId(10);
		    category1.setCategoryName("Algoritma"); 
			}

		    Category category2 = new Category(); {
		    category2.setCategoryId(20);
		    category2.setCategoryName("Programlama");
		    
		    }
		    System.out.println("Algoritma");
		    System.out.println("Programlama");
		    
		    System.out.println("-------------------Ekleme-Güncelleme-Silme-------------------");
		    
		    categoryManager categoryManager = new categoryManager(); {
		    
		    categoryManager.addToCart1(category1);
		    categoryManager.addToCart2(category2);
		    }
		    
		    
		    
		    
		
		
		 
		
		
		

		
	     	
		
		
		
		
		

	}

}
