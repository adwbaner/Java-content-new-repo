package com.cg.servlets.day2.bean;

public class Bank
{
	private String bankName;
	private int bankCode;
	private String bankState;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBankCode() {
		return bankCode;
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankState() {
		return bankState;
	}
	public void setBankState(String bankState) {
		this.bankState = bankState;
	}
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankCode=" + bankCode + ", bankState=" + bankState + "]";
	}
	
	
}
