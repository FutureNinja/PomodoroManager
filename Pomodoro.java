
public class Pomodoro {
	private int pomodori;
	private int secRestanti;
	private int shortpause;
	private int longpause;
	
	public Pomodoro(Time start, Time end){
		int spause=5*60;
		int lpause=15*60;
		int timerpomodoro=25*60;
		int counter=0;
		int secTotal=end.getsec()-start.getsec();
		boolean stop=false;
		while(stop!=true && secTotal>0){
			switch(counter){
				case 0: if(secTotal>=(timerpomodoro)){ 
							pomodori++;
							secTotal-=(timerpomodoro);
							counter++;
						}
						else {
							stop=true;
						}
						break;
				case 1: if(secTotal>=(spause)){ 
						shortpause++;
						secTotal-=(spause);
						counter++;
						}
						else {
							stop=true;
						}
						break;
				case 2: if(secTotal>=(timerpomodoro)){ 
							pomodori++;
							secTotal-=(timerpomodoro);
							counter++;
						}
						else {
							stop=true;
						}
						break;
				case 3: if(secTotal>=(spause)){ 
							shortpause++;
							secTotal-=(5*60);
							counter++;
						}
						else {
							stop=true;
						}
						break;
				case 4: if(secTotal>=(timerpomodoro)){ 
							pomodori++;
							secTotal-=(timerpomodoro);
							counter++;
						}
						else {
							stop=true;
						}
						break;
				case 5: if(secTotal>=(spause)){ 
							shortpause++;
							secTotal-=(spause);
							counter++;
						}
						else {
							stop=true;
						}
						break;
				case 6: if(secTotal>=(timerpomodoro)){ 
							pomodori++;
							secTotal-=(timerpomodoro);
							counter++;
						}
						else {
							stop=true;
						}
						break;
				case 7: if(secTotal>=(lpause)){ 
							longpause++;
							Time lpausetime=new Time(end.getsec()-secTotal);
							lpausetime.stampa();
							secTotal-=(lpause);
							counter=0;
						}
						else {
							stop=true;
						}
						break;
			} //fine switch
				secRestanti=secTotal;
		} //fine while
	} //fine costruttore
	
	public void stampa(){
		System.out.print("Pomodori:");
		System.out.println(pomodori);
		System.out.print("Pause corte:");
		System.out.println(shortpause);
		System.out.print("Pause lunghe:");
		System.out.println(longpause);
		int minuti= secRestanti/60;
		System.out.print("Minuti restanti:");
		System.out.println(minuti);
		int secondi=secRestanti-minuti*60;
		System.out.print("Secondi restanti:");
		System.out.println(secondi);
	}
} // fine classe
