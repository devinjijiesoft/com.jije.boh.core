/**
 * 
 */
package com.jije.boh.core.domain.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 

/**
 * @author devin.liu
 * @since 2012 02 28
 * @version 1.0 description: Message Center Bean name rule:fld+filed
 **/
@Entity
@Table(name = "frmcdascmessage")
public class FrmcDascMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "system-uuid")
	String id;

	@Column(name = "serialNumber")
	int serialNumber;

	@Column(name = "title")
	String title;
	@Column(name = "content")
	String content;
	@Column(name = "sendemployeeid")
	String sendemployeeid;
//	@Temporal(TemporalType.DATE)
	@Column(name = "sendtime")
	Date sendtime;
	@Column(name = "tostoreid")
	String tostoreid;
	@Column(name = "bascdictionary_statusid")
	String bascdictionary_statusid;
	@Column(name = "bascdictionary_typeid")
	String bascdictionary_typeid;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSendemployeeid() {
		return sendemployeeid;
	}

	public void setSendemployeeid(String sendemployeeid) {
		this.sendemployeeid = sendemployeeid;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

    
 



	public Date getSendtime() {
		return sendtime;
	}

	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}

	public String getTostoreid() {
		return tostoreid;
	}

	public void setTostoreid(String tostoreid) {
		this.tostoreid = tostoreid;
	}

	public String getBascdictionary_statusid() {
		return bascdictionary_statusid;
	}

	public void setBascdictionary_statusid(String bascdictionary_statusid) {
		this.bascdictionary_statusid = bascdictionary_statusid;
	}

	public String getBascdictionary_typeid() {
		return bascdictionary_typeid;
	}

	public void setBascdictionary_typeid(String bascdictionary_typeid) {
		this.bascdictionary_typeid = bascdictionary_typeid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
