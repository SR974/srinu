package Overloading;

public class Sample {

	public static void main(String[] args) {
		//mrg obj=new mrg();
         //    obj.games();
             afternoon obj1=new afternoon();
             obj1.games();

	}
}
    	class mrg{
    		public void games() {
    			System.out.println("you have to paly cricket");
    		}
    	
    			
    		}
    	class  afternoon extends mrg{
    		public void games() {
    			System.out.println("you have to play vollyball");
    		}
    	}

