package com.example.bhuang.mvp.models;

/**
 * Created by bhuang on 6/28/2017.
 */

public class ServiceHistoryDetails {


    private String lineCode;
    private String lineDescription;
    private int lineNumber;
    private double lineQty;
    private double lineType;

    public ServiceHistoryDetails(String lineCode, String lineDescription, int lineNumber, double lineQty, double lineType) {
        this.lineCode = lineCode;
        this.lineDescription = lineDescription;
        this.lineNumber = lineNumber;
        this.lineQty = lineQty;
        this.lineType = lineType;
    }
    public String getLineCode() {
        return lineCode;
    }

    public String getLineDescription() {
        return lineDescription;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public double getLineQty() {
        return lineQty;
    }

    public double getLineType() {
        return lineType;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
    }

    public void setLineDescription(String lineDescription) {
        this.lineDescription = lineDescription;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void setLineQty(double lineQty) {
        this.lineQty = lineQty;
    }

    public void setLineType(double lineType) {
        this.lineType = lineType;
    }
}
