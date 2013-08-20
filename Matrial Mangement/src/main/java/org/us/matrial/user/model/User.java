package org.us.matrial.user.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;
import org.hibernate.envers.Audited;
import org.joda.time.DateTime;
import org.springframework.data.domain.Auditable;
@Entity
@Audited
@Table(name="user",catalog="matrial")
public class User implements Auditable<String, Long>,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	@Column(name="USERNAME")
	private String username;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="PASSWORD")
	private String password;
	
	
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

	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String getCreatedBy() {
		return createdBy;
	}
	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	

	@Override
	public DateTime getCreatedDate() {
		return createdDate;
	}
	@Override
	public DateTime getLastModifiedDate() {
		return lastModifiedDate;
	}
	@Override
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	@Override
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	@Override
	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
}
