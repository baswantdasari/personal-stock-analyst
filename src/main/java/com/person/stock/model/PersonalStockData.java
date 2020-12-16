package com.person.stock.model;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalStockData {

	private BigInteger open;
	
	private BigInteger high;
	
	private BigInteger low;
	
	private BigInteger close;
	
	private BigInteger volume;
	
	private BigInteger adj_high;
	
	private BigInteger adj_low;
	
	private BigInteger adj_close;
	
	private BigInteger adj_open;
	
	private BigInteger adj_volume;
	
	private String symbol;
	
	private String exchange;
	
	private String date;

	/**
	 * @return the open
	 */
	public BigInteger getOpen() {
		return open;
	}

	/**
	 * @param open the open to set
	 */
	public void setOpen(BigInteger open) {
		this.open = open;
	}

	/**
	 * @return the high
	 */
	public BigInteger getHigh() {
		return high;
	}

	/**
	 * @param high the high to set
	 */
	public void setHigh(BigInteger high) {
		this.high = high;
	}

	/**
	 * @return the low
	 */
	public BigInteger getLow() {
		return low;
	}

	/**
	 * @param low the low to set
	 */
	public void setLow(BigInteger low) {
		this.low = low;
	}

	/**
	 * @return the close
	 */
	public BigInteger getClose() {
		return close;
	}

	/**
	 * @param close the close to set
	 */
	public void setClose(BigInteger close) {
		this.close = close;
	}

	/**
	 * @return the volume
	 */
	public BigInteger getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(BigInteger volume) {
		this.volume = volume;
	}

	/**
	 * @return the adj_high
	 */
	public BigInteger getAdj_high() {
		return adj_high;
	}

	/**
	 * @param adj_high the adj_high to set
	 */
	public void setAdj_high(BigInteger adj_high) {
		this.adj_high = adj_high;
	}

	/**
	 * @return the adj_low
	 */
	public BigInteger getAdj_low() {
		return adj_low;
	}

	/**
	 * @param adj_low the adj_low to set
	 */
	public void setAdj_low(BigInteger adj_low) {
		this.adj_low = adj_low;
	}

	/**
	 * @return the adj_close
	 */
	public BigInteger getAdj_close() {
		return adj_close;
	}

	/**
	 * @param adj_close the adj_close to set
	 */
	public void setAdj_close(BigInteger adj_close) {
		this.adj_close = adj_close;
	}

	/**
	 * @return the adj_open
	 */
	public BigInteger getAdj_open() {
		return adj_open;
	}

	/**
	 * @param adj_open the adj_open to set
	 */
	public void setAdj_open(BigInteger adj_open) {
		this.adj_open = adj_open;
	}

	/**
	 * @return the adj_volume
	 */
	public BigInteger getAdj_volume() {
		return adj_volume;
	}

	/**
	 * @param adj_volume the adj_volume to set
	 */
	public void setAdj_volume(BigInteger adj_volume) {
		this.adj_volume = adj_volume;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the exchange
	 */
	public String getExchange() {
		return exchange;
	}

	/**
	 * @param exchange the exchange to set
	 */
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
