package com.sanjoyghosh.company.db.model;

import java.time.LocalDate;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Cacheable(false)
public class PortfolioItem {

	@Id()
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(insertable=false, updatable=false)
	private int portfolioId;
	@Column(insertable=false, updatable=false)
	private int companyId;
	@Column
	private LocalDate createDate;
	@Column 
	private double quantity;	// This field has a SQL Default of 0.00.

	
	@OneToOne
	@JoinColumn(name="companyId", referencedColumnName="id")
	private Company company;

	@ManyToOne
	@JoinColumn(name="portfolioId", referencedColumnName="id")
	private Portfolio portfolio;
	
	
	public PortfolioItem() {}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}


	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}


	public Portfolio getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}


	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "PortfolioItem [id=" + id + ", company=" + company + ", createDate=" + createDate + ", quantity=" + quantity + "]";
	}


	public int getPortfolioId() {
		return portfolioId;
	}
	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}


	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
}
