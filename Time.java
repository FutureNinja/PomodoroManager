
public class Time{
	private int sec;

	public Time(int ora, int minuti, int secondi){
		sec=ora*3600+minuti*60+secondi;
	}
	
	public Time(int seconds){
		sec=seconds;
	}
	public int getsec(){
		return sec;
	}
	
	public void sommaSec(int secToAdd){
		sec+=secToAdd;
	}
	
	public void stampa(){
		int hours=sec/3600;
		System.out.print(hours);
		int minutes=(sec-hours*3600)/60;
		System.out.print(":");
		System.out.println(String.format("%02d",minutes));
		//int seconds=(sec-hours*3600-minutes*60);
		//System.out.print(seconds);
	}
}
