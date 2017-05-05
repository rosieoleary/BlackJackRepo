package RosieOLeary;

public class Main {

	public static void main(String[] args){
		System.out.println(blackJack(11,5));
	}
	public static int blackJack(int int1, int int2){
		
		int diff1=21-int1;
		int diff2=21-int2;
		if (diff1<diff2&&diff1>=0||int2>21&&int1<=21){
			return int1;
		}
		else if (diff2<diff1&&diff2>=0||int1>21&&int2<=21){
			return int2;
		}
		else if (diff1==diff2&&int1<=21){
			return int1;
		}
		else{return 0;}
		
	}
}
