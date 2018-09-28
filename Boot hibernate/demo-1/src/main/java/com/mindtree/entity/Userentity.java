package com.mindtree.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userentity")
public class Userentity 
{
	@Id
	@GeneratedValue
	int mid;
	String name;
	String track;
	String lead;
	

	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public String getLead() {
		return lead;
	}
	public void setLead(String lead) {
		this.lead = lead;
	}
	

	@Override
	public String toString() {
		return "userentity [mid=" + mid + ", name=" + name + ", track=" + track + ", lead=" + lead + "]";
	}
}
