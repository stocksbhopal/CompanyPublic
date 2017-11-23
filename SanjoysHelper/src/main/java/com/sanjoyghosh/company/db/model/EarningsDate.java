package com.sanjoyghosh.company.db.model;

import java.time.LocalDate;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Cacheable(false)
public class EarningsDate {

	@Id()
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String symbol;
	@Column
	private Integer companyId;
	@Column
	private LocalDate earningsDate;
	@Column
	private String beforeMarketOrAfterMarket;
	
	
	public EarningsDate() {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSymbol() {
		return symbol;
	}


	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	public Integer getCompanyId() {
		return companyId;
	}


	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}


	@JsonFormat(pattern="yyyy-MM-dd")
	public LocalDate getEarningsDate() {
		return earningsDate;
	}


	public void setEarningsDate(LocalDate earningsDate) {
		this.earningsDate = earningsDate;
	}


	public String getBeforeMarketOrAfterMarket() {
		return beforeMarketOrAfterMarket;
	}


	public void setBeforeMarketOrAfterMarket(String beforeMarketOrAfterMarket) {
		this.beforeMarketOrAfterMarket = beforeMarketOrAfterMarket;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((earningsDate == null) ? 0 : earningsDate.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EarningsDate other = (EarningsDate) obj;
		if (earningsDate == null) {
			if (other.earningsDate != null)
				return false;
		} else if (!earningsDate.equals(other.earningsDate))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "EarningsDate [id=" + id + ", symbol=" + symbol + ", companyId=" + companyId + ", earningsDate="
				+ earningsDate + ", beforeMarketOrAfterMarket=" + beforeMarketOrAfterMarket + "]";
	}
}
