/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.TList.ThreatDetails;
/**
 *
 * @author Abhijeet
 */
public class TierHelpDesk extends WorkRequest {
    
    private String testResult;
 private ThreatDetails threatDetails;

    public ThreatDetails getThreatDetails() {
        
        return threatDetails;
    }

    public void setThreatDetails(ThreatDetails threatDetails) {
        this.threatDetails = threatDetails;
    }
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

   
    
    
}
