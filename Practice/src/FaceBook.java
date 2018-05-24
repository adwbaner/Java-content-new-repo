
public class FaceBook {
	int id;
	  int n=0;
	 static int likes=0;
	
	FaceBook(int id){
		
		this.id=id;
	}
	
	  void imgclick(){
		likes++;
		
    System.out.println("likes"+ likes +"\n");
		
		}
	 void show(){
		n++;
		 System.out.println("user ID " + id +"\t");
		 System.out.println(" n :"+ n);
	}

}
