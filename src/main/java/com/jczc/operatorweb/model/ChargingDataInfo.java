package com.jczc.operatorweb.model;

import java.util.Date;

public class ChargingDataInfo {
	private Long id;
	private String pileNo;
	private Date receiveTime;
	private Double current;//电流
	private Double electricity;//电量
	private Double power;//功率
	private Double voltage;//电压
	public ChargingDataInfo(Long id,String pileNo,Date receiveTime,
			double current,double electricity,double power,double voltage){
		this.id=id;
		this.pileNo=pileNo;
		this.receiveTime=receiveTime;
		this.current=current;
		this.electricity=electricity;
		this.power=power;
		this.voltage=voltage;
	}
	public ChargingDataInfo(){}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPileNo() {
		return pileNo;
	}
	public void setPileNo(String pileNo) {
		this.pileNo = pileNo;
	}
	public Date getReceiveTime() {
		return receiveTime;
	}
	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}
	public Double getCurrent() {
		return current;
	}
	public void setCurrent(Double current) {
		this.current = current;
	}
	public Double getElectricity() {
		return electricity;
	}
	public void setElectricity(Double electricity) {
		this.electricity = electricity;
	}
	public Double getPower() {
		return power;
	}
	public void setPower(Double power) {
		this.power = power;
	}
	public Double getVoltage() {
		return voltage;
	}
	public void setVoltage(Double voltage) {
		this.voltage = voltage;
	}
}
