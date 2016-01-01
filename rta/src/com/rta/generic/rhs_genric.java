package com.rta.generic;

public class rhs_genric {
	int fi;
	String nm ,ip;
	public int getFi() {
		return fi;
	}
	public void setFi(int fi) {
		this.fi = fi;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

	public rhs_genric() {
		
	}
	
	public rhs_genric(int fi, String nm){
	
		this.fi=fi;
		this.nm=nm;
	}
	
public rhs_genric(int fi, String nm, String ip) {
	this.fi= fi;
	this.nm=nm;
	this.ip=ip;
		
	}
}
