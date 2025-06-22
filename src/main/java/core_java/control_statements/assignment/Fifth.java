package core_java.control_statements.assignment;

//Create a program to print the month of the year based on a
//number (1-12) input by the user.
//58. Create a program to create a simple
public class Fifth {
	public static void main(String[] args) {
		int num = 2;
		System.out.println(getMonthName(num));
		}
	

	public static String getMonthName(int num) {
		String month = "";
		switch (num) {
		case 1:
			month = "jan";
			break;
		case 2:
			month = "feb";
			break;
		case 3:
			month = "mar";
			break;
		case 4:
			month = "apr";
			break;
		case 5:
			month = "may";
			break;
		case 6:
			month = "jun";
			break;
		case 7:
			month = "jul";
			break;
		case 8:
			month = "aug";
			break;
		case 9:
			month = "sep";
			break;
		case 10:
			month = "oct";
			break;
		case 11:
			month = "nov";
			break;
		case 12:
			month = "dec";
			break;
		default:
			month = "NA";
			break;
		}
		return month;
	}

}
