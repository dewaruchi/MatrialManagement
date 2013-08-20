package org.us.matrial.pengeluaran.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;
import org.hibernate.envers.Audited;
import org.joda.time.DateTime;
import org.springframework.data.domain.Auditable;
import org.us.matrial.pembelian.model.InvoiceSupplier;
@Entity
@Table(name="pengeluaran_sales",catalog="matrial")
@Audited
public class PengeluaranSales implements Auditable<String, Long>,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID",nullable=false)
	private Long id;
	@Column(name="TOTAL",nullable=false)
	private long total;
	@Column(name="KETERANGAN")
	private String keterangan;
	
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	private InvoiceSupplier invoiceSupplier;
	
	
	

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
	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return (id==null)?true:false;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
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

	public InvoiceSupplier getInvoiceSupplier() {
		return invoiceSupplier;
	}

	public void setInvoiceSupplier(InvoiceSupplier invoiceSupplier) {
		this.invoiceSupplier = invoiceSupplier;
	}

	public void setTotal(long total) {
		this.total = total;
	}
	
	
	
}
