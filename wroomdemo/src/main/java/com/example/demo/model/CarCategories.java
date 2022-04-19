package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarCategories {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryid;
	private String  categoryname;
	private String  imagepath;
	private double  dailyrates;
	private double  weeklyrates;
	private double  monthlyrates;
	public CarCategories() {}
	public CarCategories(int categoryid, String categoryname, String imagepath, double dailyrates, double weeklyrates,
			double monthlyrates) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.imagepath = imagepath;
		this.dailyrates = dailyrates;
		this.weeklyrates = weeklyrates;
		this.monthlyrates = monthlyrates;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public double getDailyrates() {
		return dailyrates;
	}
	public void setDailyrates(double dailyrates) {
		this.dailyrates = dailyrates;
	}
	public double getWeeklyrates() {
		return weeklyrates;
	}
	public void setWeeklyrates(double weeklyrates) {
		this.weeklyrates = weeklyrates;
	}
	public double getMonthlyrates() {
		return monthlyrates;
	}
	public void setMonthlyrates(double monthlyrates) {
		this.monthlyrates = monthlyrates;
	}
	
}
