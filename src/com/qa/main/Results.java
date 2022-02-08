package com.qa.main;

public class Results {
	
	private double physics;
	private double chemistry;
	private double biology;
	private double total;
	private double percentage;
	
	public Results(double physics, double chemistry, double biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.total = physics + chemistry + biology;
		this.percentage = (total*100)/450;
	}
	
	public void printResults() {
		System.out.println("Physics mark: "+ physics);
		System.out.println("Chemistry mark: "+ chemistry);
		System.out.println("Biology mark: "+ biology);
		System.out.println("Total mark: "+ total);
	}
	
	public void printPercentage() {
		System.out.println("Percent of mark: "+ percentage + "%");
	}
	
	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	public double getBiology() {
		return biology;
	}

	public void setBiology(double biology) {
		this.biology = biology;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
}
