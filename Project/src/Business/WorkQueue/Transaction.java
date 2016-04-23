/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.TransactionList.TransList;

/**
 *
 * @author Abhijeet
 */
public class Transaction extends WorkRequest{
    private String testResult;
 private TransList transList =new TransList();
 
 

    public TransList getTransList() {
        
        return transList;
    }

    public void setTransList(TransList transList) {
        this.transList = transList;
    }
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
   
}
