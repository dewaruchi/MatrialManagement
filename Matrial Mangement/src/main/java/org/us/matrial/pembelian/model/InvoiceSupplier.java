package org.us.matrial.pembelian.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;
import org.hibernate.envers.Audited;
import org.joda.time.DateTime;
import org.springframework.data.domain.Auditable;
import org.us.matrial.util.EnumResource.Lunas;

@Entity
@Table(name="invoice_supplier",catalog="matrial")
@Audited
public class InvoiceSupplier implements Auditable<String, Long>,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID",nullable=false)
	private Long id;
	@Column(name="NO",nullable=false)
	private String no;
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	private Supplier supplier;
	@Column(name="TOTAL",nullable=false)
	private Long total;
	@Column(name="BAYAR",nullable=false)
	private Long bayar;
	@Column(name="SISA",nullable=false)
	private Long sisa;
	@Column(name="LUNAS",nullable=false)
	private Lunas lunas;
	@Column(name="TEMPO")
	@Temporal(TemporalType.DATE)
	private Date tempo;

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

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getBayar() {
		return bayar;
	}

	public void setBayar(Long bayar) {
		this.bayar = bayar;
	}

	public Long getSisa() {
		return sisa;
	}

	public void setSisa(Long sisa) {
		this.sisa = sisa;
	}

	public Lunas getLunas() {
		return lunas;
	}

	public void setLunas(Lunas lunas) {
		this.lunas = lunas;
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

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Date getTempo() {
		return tempo;
	}

	public void setTempo(Date tempo) {
		this.tempo = tempo;
	}
	
}
