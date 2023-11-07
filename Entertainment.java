public class Entertainment
{
    private String Id;
	private String Rating;
	public String title;
	
	
	public Entertainment(String Id,String Rating,String title){
		this.Id = Id;
		this.Rating = Rating;
		this.title = title;
	}
	
	public Entertainment(){
		 this.Id = "Null";
		 this.Rating = "N/A";
		 this.title = "Null";
	}
	
    public void display_info(){
        System.out.println("Id: "+this.Id+", Rating: "+this.Rating+", Price: " +this.title);
    }
    
    public void display_info(int cast_Member_Number){
        System.out.println("Total Number of Cast Members: "+cast_Member_Number);
    }
    
    public void display_info(int MovieRating,String DateReleased){
        System.out.println("MovieRating: "+MovieRating + "DateReleased: "+DateReleased);
    }  
	
	public static void main(String[] args) {
        Entertainment ob = new Entertainment("#1230","PG-13","Jawaan");
        ob.display_info();
        ob.display_info(4);
        ob.display_info(3,"12/07/23");
	}
}
