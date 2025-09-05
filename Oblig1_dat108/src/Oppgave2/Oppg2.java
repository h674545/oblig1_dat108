package Oppgave2;

import java.util.ArrayList;
import java.util.List;

public class Oppg2 {
	
	public static void main(String[]args) {
		
		List<Ansatt> ansatte = new ArrayList<>();
		
		Ansatt a1 = new Ansatt();
		a1.setFornavn("Sondre");
		a1.setKjonn(Kjonn.MANN);
		a1.setStilling("Utvikler");
		a1.setAarslonn(500000);
		
		Ansatt a2 = new Ansatt();
		a2.setFornavn("Silje");
		a2.setKjonn(Kjonn.KVINNE);
		a2.setStilling("Leder HR");
		a2.setAarslonn(700000);
		
		Ansatt a3 = new Ansatt();
		a3.setFornavn("Mari");
		a3.setKjonn(Kjonn.KVINNE);
		a3.setStilling("Utvikler");
		a3.setAarslonn(500000);
		
		ansatte.add(a1);
		ansatte.add(a2);
		ansatte.add(a3);
		
		System.out.println("Lønn før lønnsjustering: ");
		skrivUtAlle(ansatte);
		
		lonnsoppgjor(ansatte, liste -> {
		    for (Ansatt ansatt : liste) {
		        int oppdatertLonn = (int) (ansatt.getAarslonn() * 1.10);
		        ansatt.setAarslonn(oppdatertLonn);
		    }
		    return 0;
		});
		System.out.println("");
		
		System.out.println("Lønn etter justering på 10%: ");
		skrivUtAlle(ansatte);
		
		lonnsoppgjor(ansatte, liste2 -> {
			for(Ansatt ansatt : liste2) {
				int oppdaterLonn2 = (int) (ansatt.getAarslonn() +  15000);
				ansatt.setAarslonn(oppdaterLonn2);
			}
			return 0;
		});
		
		System.out.println("");
		
		System.out.println("Lønn etter enda et tillegg på 15000kr");
		skrivUtAlle(ansatte);
	}

	private static void lonnsoppgjor(List<Ansatt> ansatte, Format nylonn) {
		nylonn.beregn(ansatte);
		
	}

	
	private static void skrivUtAlle(List<Ansatt> ansatte) {
		for(Ansatt a : ansatte) {
			System.out.println(a.getFornavn() + "|" + a.getKjonn() + "|" + a.getStilling() + "|" + a.getAarslonn());		}
	}
	
	 public interface Format {
	        int beregn(List<Ansatt> ansatte);
	    }
	
}
