package com.jije.boh.core.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author devin.liu
 * @since 2012 02 28
 * @version 1.0
 * description: FrmcMenuCfg Bean
 * name rule:fld+filed
 **/

@Entity
@Table(name = "frmcmenucfg")
public class FrmcMenuCfg implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(generator = "system-uuid")
	String  id;
	
 
	@Column(name = "fldid")
     String fldid;
	@Column(name = "fldname")
	 String fldname;
	@Column(name = "fldsequence")
	 int fldsequence;
	@Column(name = "fldicon")
	 String fldicon;
	@Column(name = "fldparantid")
	 String fldparantid;
 
	 String getFldid() {
		return fldid;
	}
	 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setFldid(String fldid) {
		this.fldid = fldid;
	}
	public String getFldname() {
		return fldname;
	}
	public void setFldname(String fldname) {
		this.fldname = fldname;
	}
   
	public int getFldsequence() {
		return fldsequence;
	}

	public void setFldsequence(int fldsequence) {
		this.fldsequence = fldsequence;
	}

	public String getFldicon() {
		return fldicon;
	}
	public void setFldicon(String fldicon) {
		this.fldicon = fldicon;
	}
	public String getFldparantid() {
		return fldparantid;
	}
	public void setFldparantid(String fldparantid) {
		this.fldparantid = fldparantid;
	}

}
