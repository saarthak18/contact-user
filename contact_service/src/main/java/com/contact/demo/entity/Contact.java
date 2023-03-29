package com.contact.demo.entity;

public class Contact {
	
	private long cid;
	private String email;
	private String contactName;
	private Long userId;
	
public Contact(Long cid,String email,String contactName,Long userId) {
	// TODO Auto-generated constructor stub
	this.cid=cid;
	this.email=email;
	this.userId=userId;
	this.contactName=contactName;
}
public Contact()
{
	
}
public long getCid() {
	return cid;
}
public void setCid(long cid) {
	this.cid = cid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContactName() {
	return contactName;
}
public void setContactName(String contactName) {
	this.contactName = contactName;
}
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}

}
