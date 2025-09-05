package Oppgave1;

import java.util.ArrayList;
import java.util.List;

public class Oppgave1a{
	
	public static void main(String[] args) {
		List<String> listen = new ArrayList<>();
		
				listen. add("10"); 
				listen. add("20"); 
				listen. add("110"); 
				listen. add("21"); 
				listen. add("12"); 
		
		 listen.sort((a, b) -> {
				    return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
				});
		
		for(String e : listen) {
			System.out.print(e + " ");
		}
	}
}