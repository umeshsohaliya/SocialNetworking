package com.rta.generic;

public class pgsearchgenric {
	int pgid;
	String pgname, pictur , type ;
	public int getPgid() {
		return pgid;
	}
	public void setPgid(int pgid) {
		this.pgid = pgid;
	}
	public String getPgname() {
		return pgname;
	}
	public void setPgname(String pgname) {
		this.pgname = pgname;
	}
	public String getPictur() {
		return pictur;
	}
	public void setPictur(String pictur) {
		this.pictur = pictur;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public  pgsearchgenric(){
		
	}
	
public  pgsearchgenric(int pgid ,String pgname ,String pictur , String type){
	
	this.pgid =pgid ;
	this.pgname =pgname;
	this.pictur =pictur;
	this.type=type;
	
	}

}
