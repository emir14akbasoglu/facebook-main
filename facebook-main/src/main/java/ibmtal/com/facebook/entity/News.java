package ibmtal.com.facebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="news")

public class News {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private int id;
@Column(name="name")
private String name;
@Column(name="about")  
private String about;
@Column(name="content")
private String content;
@Column(name="date")
private String date;
@Column(name="website")
private String website;
public News() {
	super();
}
public News(int id, String name, String about, String content, String date, String website) {
	super();
	this.id = id;
	this.name = name;
	this.about = about;
	this.content = content;
	this.date = date;
	this.website = website;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAbout() {
	return about;
}
public void setAbout(String about) {
	this.about = about;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
}
     
}
