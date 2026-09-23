public class FormatDate{

	
public static void printAmerican(String day, String month, 
int date, int year){	
	System.out.println(day+", "+ month + date+ ", "+ year);
}

public static void printeEuropean(int Month, int date, int year){
	System.out.println(date+"/"+ Month + "/" + year);
}


public static void main(String[] args) {
  printAmerican("Wednesday", "September", 23, 2026 );
  printEuropean(09, 23, 2026);
}
}
