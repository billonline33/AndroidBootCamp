package com.example.bhuang.mvp.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by bhuang on 6/28/2017.
 */

public class ServiceHistory {
    private int id;
    private String equipmentNumber;
    private double hourMeter;
    private boolean isJobStarted;
    private String jobCategory;
    private String jobNumber;
    private String jobStatus;
    private String mechanicName;
    private String note;
    private String reasonDescription;
    private Date serviceDate;
    private List<ServiceHistoryDetails> serviceHistoryDetailses;

    public List<ServiceHistoryDetails> getServiceHistoryDetailses() {
        return serviceHistoryDetailses;
    }

    public void setServiceHistoryDetailses(List<ServiceHistoryDetails> serviceHistoryDetailses) {
        this.serviceHistoryDetailses = serviceHistoryDetailses;
    }

    public ServiceHistory() {
    }

    public ServiceHistory(int id, String jobNumber) {
        this.id = id;
        this.jobNumber = jobNumber;
    }
    public ServiceHistory(int id, String equipmentNumber, double hourMeter,
                          boolean isJobStarted, String jobCategory,
                          String jobNumber, String jobStatus,
                          String mechanicName, String note,
                          String reasonDescription, Date serviceDate)
    {
        this.id=id;
        this.equipmentNumber=equipmentNumber;
        this.hourMeter=hourMeter;
        this.isJobStarted=isJobStarted;
        this.jobCategory=jobCategory;
        this.jobNumber=jobNumber;
        this.jobStatus=jobStatus;
        this.mechanicName=mechanicName;
        this.note=note;
        this.reasonDescription=reasonDescription;
        this.serviceDate=serviceDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    public void setHourMeter(double hourMeter) {
        this.hourMeter = hourMeter;
    }

    public void setJobStarted(boolean jobStarted) {
        isJobStarted = jobStarted;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setReasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public int getId() {
        return id;
    }

    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    public double getHourMeter() {
        return hourMeter;
    }

    public boolean isJobStarted() {
        return isJobStarted;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public String getNote() {
        return note;
    }

    public String getReasonDescription() {
        return reasonDescription;
    }

    public Date getServiceDate() {
        return serviceDate;
    }
}
