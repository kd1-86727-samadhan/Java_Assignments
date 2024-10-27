package com.sam.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Project implements Serializable {

	private static final long serialVersionUID = 1L;
	int pId;
	String title;
	int teamSize;
	public double projectCost;
	String technology;

	public Project() {

	}

	public Project(int pId) {
		this.pId = pId;
	}

	public Project(int pId, String title, int teamSize, double projectCost, String technology) {
		this.pId = pId;
		this.title = title;
		this.teamSize = teamSize;
		this.projectCost = projectCost;
		this.technology = technology;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public double getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter the project id: ");
		pId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the title: ");
		title = sc.nextLine();

		System.out.println("Enter the team size: ");
		teamSize = sc.nextInt();

		System.out.println("Enter the project cost:");
		projectCost = sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter the technology: ");
		technology = sc.next();
	}

	@Override
	public int hashCode() {
		return Objects.hash(pId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return pId == other.pId;
	}

	@Override
	public String toString() {
		return "Project [id=" + pId + ", title=" + title + ", teamSize=" + teamSize + ", projectCost=" + projectCost
				+ ", technology=" + technology + "]";
	}

}
