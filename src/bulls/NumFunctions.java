package bulls;

import java.util.ArrayList;
import java.util.List;

public class NumFunctions {
	public boolean CheckNum(int[] check_num, int[] user_num){
		int bulls = 0;
		int cows = 0;
		Messages mess = new Messages();
		List<Integer> intList = new ArrayList<Integer>();
	    for (int index = 0; index < check_num.length; index++)
	    {
	        intList.add(check_num[index]);
	    }
	    
		for(int i = 0; i<4; i++){
			if(check_num[i]==user_num[i]){bulls++;}
			else if(intList.contains(user_num[i])){
				cows++;
			}
		}
		mess.ShowResult(bulls, cows);
		if(bulls >= 4){
			return true;
		}
		else{
			return false;
		}
	}
}
