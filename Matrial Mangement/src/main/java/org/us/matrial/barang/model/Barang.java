package org.us.matrial.barang.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;
import org.hibernate.envers.Audited;
import org.joda.time.DateTime;
import org.springframework.data.domain.Auditable;

@Entity
@Table(name="barang",catalog="matrial")
@Audited
public class Barang implements Auditable<String, String>,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID",nullable=false)
	private String id;
	@Column(name="NAMA",length=50,nullable=false)
	private String nama;
	@Column(name="QTY",length=50,nullable=false)
	private int qty;
	@Column(name="HARGA_POKOK",nullable=false)
	private Long hargaPokok;
	// Audit fields
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
	private Long hargaTotal;



	@Transient
	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return (this.getId()==null)?true:false;
		
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}






	public String getNama() {
		return nama;
	}


	public void setNama(String nama) {
		this.nama = nama;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public Long getHargaPokok() {
		return hargaPokok;
	}


	public void setHargaPokok(Long hargaPokok) {
		this.hargaPokok = hargaPokok;
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


	public Long getHargaTotal() {
		return hargaTotal;
	}


	public void setHargaTotal(Long hargaTotal) {
		this.hargaTotal = hargaTotal;
	}


	
}
