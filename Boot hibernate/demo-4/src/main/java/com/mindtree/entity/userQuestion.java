package com.mindtree.entity;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class userQuestion 
{
	@Id
	int Qid;
	Blob question;
	String category;
	Date date;
	int userId;
	public int getQid() {
		return Qid;
	}
	public void setQid(int qid) {
		Qid = qid;
	}
	public Blob getQuestion() {
		return question;
	}
	public void setQuestion(Blob question) {
		this.question = question;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
   