package com.springapps_springcore.reftypes;

public class Scores {
	private double Maths;
	private double Science;
	private double Social;
	private double English;

	public double getMaths() {
		return Maths;
	}

	public void setMaths(double maths) {
		Maths = maths;
	}

	public double getScience() {
		return Science;
	}

	public void setScience(double science) {
		Science = science;
	}

	public double getSocial() {
		return Social;
	}

	public void setSocial(double social) {
		Social = social;
	}

	public double getEnglish() {
		return English;
	}

	public void setEnglish(double english) {
		English = english;
	}

	@Override
	public String toString() {
		return "Scores [Maths=" + Maths + ", Science=" + Science + ", Social=" + Social + ", English=" + English + "]";
	}

}
