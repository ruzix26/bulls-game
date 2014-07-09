package bulls;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] user_num;
		int check_num[] = { 4,1,8,7 }; 
		NumFunctions func = new NumFunctions();
		Messages mess = new Messages();
		boolean status = false;
		while(status==false){
			mess.Start();
			Scanner scan = new Scanner(System.in);
			String user_string = scan.nextLine();
			user_num = new int[] {
					Integer.valueOf( user_string.substring(0,1)),
					Integer.valueOf( user_string.substring(1,2)),
					Integer.valueOf( user_string.substring(2,3)),
					Integer.valueOf( user_string.substring(3))
					};
			if(func.CheckNum(check_num, user_num)){
				status = true;
			}
			else {status = false;}
		}
		mess.End();
	}

}
