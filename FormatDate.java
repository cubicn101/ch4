public class FormatDate{

	
public static void printAmerican(String day, String month, 
int date, int year){	
	System.out.println(day+", "+ month + date+ ", "+ year);
}

public static void printEuropean(String Month, int date, int year){
	System.out.println(date+" "+ Month + ", " + year);
	// i dont know where the day should go for European time format :(
}   


public static void main(String[] args) {
  printAmerican("Wednesday", "September", 23, 2026 );
  printEuropean("September", 23, 2026);
}
}
