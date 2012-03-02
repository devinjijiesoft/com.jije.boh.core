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
@Table(name = "frmcdashboardcfgdetail")
public class FrmcDashboardCfgDetail implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(generator = "system-uuid")
	String id;
	
	@Column(name = "flddashboardcfgid")
      String flddashboardcfgid;
	@Column(name = "fldrow")
	  int fldrow;
	@Column(name = "fldcolumn")
	  int fldcolumn;
	@Column(name = "fldtitle")
	  String fldtitle;
	@Column(name = "fldpageno")
	  int fldpageno;

	public String getFlddashboardcfgid() {
		return flddashboardcfgid;
	}

	public void setFlddashboardcfgid(String flddashboardcfgid) {
		this.flddashboardcfgid = flddashboardcfgid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getFldrow() {
		return fldrow;
	}

	public void setFldrow(int fldrow) {
		this.fldrow = fldrow;
	}

	public int getFldcolumn() {
		return fldcolumn;
	}

	public void setFldcolumn(int fldcolumn) {
		this.fldcolumn = fldcolumn;
	}

	public String getFldtitle() {
		return fldtitle;
	}

	public void setFldtitle(String fldtitle) {
		this.fldtitle = fldtitle;
	}

	public int getFldpageno() {
		return fldpageno;
	}

	public void setFldpageno(int fldpageno) {
		this.fldpageno = fldpageno;
	}

 

}
