package com.jije.boh.core.domain.ui;

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
@Table(name = "frmcdashboardcfg")
public class FrmcDashboardCfg implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "system-uuid")
	String id;
	
	@Column(name = "fldtotalpage")
	String fldtotalpage;
	
 	@Column(name = "flduserid")
	private String flduserid;
	
	@Column(name = "fldtypeid")
	private String fldtypeid;

	public String getFldtypeid() {
		return fldtypeid;
	}

	public void setFldtypeid(String fldtypeid) {
		this.fldtypeid = fldtypeid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getFldtotalpage() {
		return fldtotalpage;
	}

	public void setFldtotalpage(String fldtotalpage) {
		this.fldtotalpage = fldtotalpage;
	}

	public String getFlduserid() {
		return flduserid;
	}

	public void setFlduserid(String flduserid) {
		this.flduserid = flduserid;
	}

}
