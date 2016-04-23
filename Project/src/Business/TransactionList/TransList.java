/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TransactionList;

/**
 *
 * @author Abhijeet
 */
public class TransList {
    private int TransID;
    private Float transAmount=0f;
    private String Comment;

    public int getTransID() {
        
        return TransID;
    }

    public void setTransID(int TransID) {
        this.TransID = TransID;
    }

    public Float getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(Float transAmount) {
        this.transAmount = transAmount;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }
    
}
