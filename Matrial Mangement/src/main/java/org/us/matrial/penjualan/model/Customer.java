package org.us.matrial.penjualan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;
import org.hibernate.envers.Audited;
import org.joda.time.DateTime;
import org.springframework.data.domain.Auditable;

@Entity
@Table(name="customer",catalog="matrial")
@Audited
public class Customer  implements Auditable<String, Long>,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID",nullable=false)
	private Long id;
	@Column(name="NAMA",length=50,nullable=false)
	private String nama;
	@Column(name="ALAMAT",length=255,nullable=false)
	private String alamat;
	@Column(name="NO_HP",length=20)
	private String noHp;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	@Column(name="CREATED_DATE")
	@Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
	private DateTime createdDate;
	@Column(name="LAST_MODIFIED_BY")
	private String lastModifiedBy;
	@Column(name="LAST_MODIFIED_DATE")
	@Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
	private DateTime lastModifiedDate;
	
	@Transient
	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return (this.getId()==null)?true:false;
	}

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getNoHp() {
		return noHp;
	}
	public void setNoHp(String noHp) {
		this.noHp = noHp;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public DateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	public DateTime getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	
	
	
}
