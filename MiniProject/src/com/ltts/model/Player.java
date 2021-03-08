package com.ltts.model;

import java.util.Date;

public class Player {
	private int playerId;
	private Date dateOfBirth;
	private String name;
	private String skill; //batting,bowling,allrounder,wicket keeper
	private int teamId;
	private int noOfMatches;
	private int wickets;
	private String nationality;
	private int runs;
	public Player() {
		super();
	}
	public Player(int playerId, Date dateOfBirth, String name, String skill, int teamId, int noOfMatches, int wickets,
			String nationality, int runs) {
		super();
		this.playerId = playerId;
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.skill = skill;
		this.teamId = teamId;
		this.noOfMatches = noOfMatches;
		this.wickets = wickets;
		this.nationality = nationality;
		this.runs = runs;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", dateOfBirth=" + dateOfBirth + ", name=" + name + ", skill=" + skill
				+ ", teamId=" + teamId + ", noOfMatches=" + noOfMatches + ", wickets=" + wickets + ", nationality="
				+ nationality + ", runs=" + runs + "]";
	}
	
	
	
	
}
