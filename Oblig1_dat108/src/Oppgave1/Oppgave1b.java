package Oppgave1;

public class Oppgave1b {
	
	public static void main(String[]args) {	
		
		Format summerTall = (a,b) -> (a+b);
		System.out.println((summerTall.beregn(12,13)));
		
		Format storstTall = (a,b) -> maxBy(a,b);
		System.out.println(storstTall.beregn(-5, 3));
		
		Format differanse = (a,b) -> (a - b);
		System.out.println(differanse.beregn(54, 45));
		
	}
	
	private static int maxBy(int a, int b) {
		
		if( a > b) {
			return a;
		}
		return b;
	}

	public static int beregn(int a, int b, Format format) {
		
		return format.beregn(a,b);
		
		}	
	public interface Format {
		int beregn(int a, int b);
	}
	}