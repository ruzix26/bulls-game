package bulls;

public class Messages {
	public void Start(){
		System.out.println("Введіть число:");
	}
	public void ShowResult(int bulls,int cows){
		System.out.println("Бики:"+bulls);
		System.out.println("Корови:"+cows);
	}
	public void End(){
		System.out.println("Вітаємо, ви виграли!");
	}
}
