package chapter04;
import java.util.Calendar;
public class Test1 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); //now객체
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		
		System.out.print(hourOfDay+"시 ");
		System.out.println(minute+"분");
		
		if (hourOfDay>=4 && hourOfDay<12) {
			System.out.println("Good Morning");
		}else if(hourOfDay<18){
			System.out.println("Good Afternoon");	
		}else if(hourOfDay<22){
			System.out.println("Good Evening");	
		}else {
			System.out.println("Good Night");	
			
		}
	
		}
	}


