package com.ustglobal.lms.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="issued_book_details")
public class IssueBook {
	@Id
	@Column
	@GeneratedValue
	private int issueId;
	@Column
	private int bid;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}



	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date issueDate;
	
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public int getIssueId() {
		return issueId;
	}
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	
	
	
//	@ManyToOne
//    @JoinColumn(name = "bid", nullable = false)
//	private Book book;

}
