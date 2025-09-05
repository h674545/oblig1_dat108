package Oppgave2;

public class Ansatt {
	
	String fornavn;
	String etternavn;
	Kjonn kjonn;
	String stilling;
	int aarslonn;
	
	
	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	
	public String getEtternavn() {
		return etternavn;
	}
	
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public Kjonn getKjonn() {
		return kjonn;
	}

	public void setKjonn(Kjonn kjonn) {
		this.kjonn = kjonn;
	}

	public String getStilling() {
		return stilling;
	}

	public void setStilling(String stilling) {
		this.stilling = stilling;
	}

	public int getAarslonn() {
		return aarslonn;
	}

	public void setAarslonn(int aarslonn) {
		this.aarslonn = aarslonn;
	}

	public String toString() {
	    return fornavn + " " + etternavn + " (" + stilling + ", " + aarslonn + " kr, " + kjonn + ")";
	}
}
