package org.arezoo.springbootstarter.concert;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Concert {
	
	@Id
	private String id;
	private String artist;
	private String venue;
	private Date date;
	
	
	public Concert() {
		super();
	}
	public Concert(String id, String artist, String venue, Date date) {
		super();
		this.id = id;
		this.artist = artist;
		this.venue = venue;
		this.date = date;
	}
	public Concert(String id, String artist, String venue, int year,int month,int day,int hour,int min) {
		super();
		this.id = id;
		this.artist = artist;
		this.venue = venue;
		setDate(year,month,day,hour,min);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setDate(int year,int month,int day,int hour,int min){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, hour);
		cal.set(Calendar.MINUTE,min);
		date = cal.getTime();
	}

	
	

}
