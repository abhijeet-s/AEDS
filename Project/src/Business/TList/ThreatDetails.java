/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TList;

/**
 *
 * @author Abhijeet
 */
public class ThreatDetails {
    
    private String threatType;
    private String priority;
    private String Severity;
    private String Comment;
    private String Resoultion;
    private boolean tier1=false;
    private boolean tier2=false;
    private boolean analysis=false;

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public String getResoultion() {
        return Resoultion;
    }

    public void setResoultion(String Resoultion) {
        this.Resoultion = Resoultion;
    }

    public boolean isTier1() {
        return tier1;
    }

    public void setTier1(boolean tier1) {
        this.tier1 = tier1;
    }

    public boolean isTier2() {
        return tier2;
    }

    public void setTier2(boolean tier2) {
        this.tier2 = tier2;
    }

    public boolean isAnalysis() {
        return analysis;
    }

    public void setAnalysis(boolean analysis) {
        this.analysis = analysis;
    }

    public boolean isLegal() {
        return legal;
    }

    public void setLegal(boolean legal) {
        this.legal = legal;
    }
    private boolean legal=false;
    public String getThreatType() {
        return threatType;
    }

    public void setThreatType(String threatType) {
        this.threatType = threatType;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }
}
