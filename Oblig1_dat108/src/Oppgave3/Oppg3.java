package Oppgave3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Oppgave2.Ansatt;
import Oppgave2.Kjonn;

public class Oppg3 {
	
	public static void main(String[]args) {
List<Ansatt> ansatte = new ArrayList<>();
		
		Ansatt a1 = new Ansatt();
		a1.setFornavn("Sondre");
		a1.setEtternavn("Nordmann");
		a1.setKjonn(Kjonn.MANN);
		a1.setStilling("Utvikler");
		a1.setAarslonn(500000);
		
		Ansatt a2 = new Ansatt();
		a2.setFornavn("Silje");
		a2.setEtternavn("Sild");
		a2.setKjonn(Kjonn.KVINNE);
		a2.setStilling("Leder HR");
		a2.setAarslonn(700000);
		
		Ansatt a3 = new Ansatt();
		a3.setFornavn("Mari");
		a3.setEtternavn("Gullvik");
		a3.setKjonn(Kjonn.KVINNE);
		a3.setStilling("Utvikler");
		a3.setAarslonn(500000);
		
		Ansatt a4 = new Ansatt();
		a4.setFornavn("Marianne");
		a4.setEtternavn("Mo");
		a4.setKjonn(Kjonn.KVINNE);
		a4.setStilling("HR");
		a4.setAarslonn(400000);
		
		Ansatt a5 = new Ansatt();
		a5.setFornavn("Morten");
		a5.setEtternavn("Ellingsrud");
		a5.setKjonn(Kjonn.MANN);
		a5.setStilling("Utvikler");
		a5.setAarslonn(350000);
		
		ansatte.add(a1);
		ansatte.add(a2);
		ansatte.add(a3);
		ansatte.add(a4);
		ansatte.add(a5);
		
		// a
		List<String> etterNavnListe = ansatte.stream()
		.map(Ansatt::getEtternavn)
		.collect(Collectors.toList());
		etterNavnListe.forEach(System.out::println);
		
	
		//b
		int antallKvinner = (int) ansatte.stream()
				.filter(a -> a.getKjonn() == Kjonn.KVINNE)
				.count();
		System.out.println("Antall kvinnelige ansatte er: " + antallKvinner);

		//c
		double gjennomsnittLonn = ansatte.stream()
				.filter(a -> a.getKjonn() == Kjonn.KVINNE)
				.mapToInt(Ansatt::getAarslonn)
				.average()
				.orElse(0);
		
		System.out.println(gjennomsnittLonn);
		
		//d
		String ledere = ansatte.stream()
			.filter(a -> a.getStilling().contains("Leder"))
			.map(Ansatt::getFornavn)
			.findAny().orElse("Ingen ledere");
		System.out.println("Ledere er: " + ledere);
		
		
		//e
		List<Integer> lonnOver800k = ansatte.stream()
			.filter(a-> a.getAarslonn() >= 800000)
			.map(Ansatt::getAarslonn)
			.toList();
			//.orElse("Ingen med lønn over 800.000kr");
		System.out.println("De med lønn over 800.000kr = " + lonnOver800k);
		
		//f
		ansatte.stream()
			.map(Ansatt::toString)
			.forEach(System.out::println);
		
		//g
		int lavestAarslonn = ansatte.stream()
				.mapToInt(Ansatt::getAarslonn)
				.min()
				.orElse(0);
		System.out.println("Laveste årslønn er: " + lavestAarslonn);
		
		//h
		int sum = java.util.stream.IntStream.range(1, 1000)
				.filter(i -> i % 3 == 0 || i % 5 ==0)
				.sum();
		System.out.println("Summen av tall mellom 1-1000 som er delelig på 3 og 5 blir : " + sum);
		
		
}}
