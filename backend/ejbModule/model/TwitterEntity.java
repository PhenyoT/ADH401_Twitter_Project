package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tweets_tbl")
public class TwitterEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(long tweetid) {
		this.id = tweetid;
	}
	public String getTweetts() {
		return tweetts;
	}
	public void setTweetts(String tweetts) {
		this.tweetts = tweetts;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private String tweetts;
	private Date date;
	

}
