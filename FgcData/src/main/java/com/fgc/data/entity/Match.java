package com.fgc.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="match_details")
public class Match {
	
	@Id
	private String matchId;
	
	@Column(nullable = false)
	private String winnerId;
	
	@Column(nullable = false)
	private String loserId;
	
	@Column(nullable = false)
	private String finalScore;
	
	@Column(nullable = false)
	private String game;
	
	@Column(nullable = false)
	private String timestamp;

	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	public String getWinnerId() {
		return winnerId;
	}

	public void setWinnerId(String winnerId) {
		this.winnerId = winnerId;
	}

	public String getLoserId() {
		return loserId;
	}

	public void setLoserId(String loserId) {
		this.loserId = loserId;
	}

	public String getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(String finalScore) {
		this.finalScore = finalScore;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
}
