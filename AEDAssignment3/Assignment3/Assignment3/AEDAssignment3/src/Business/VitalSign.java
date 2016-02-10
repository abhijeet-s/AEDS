/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDateTime;

/**
 *
 * @author priyank
 */
public class VitalSign {
private int bloodPressure;
private int respiratoryRate;
private int heartRate;
private double weight;
private LocalDateTime date;
private String status;

    public String getStatus() {
        
        return status;
        
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    @Override
public String toString(){
    return String.valueOf(this.getDate());
}
public String statusD(  String str,int BP, int HR,int RR, double W,int age){
    
                if (age < 4)
                {
                    if ( (BP > 110) ||(BP < 80) || (HR > 130) || (HR < 80) || ( RR > 30) || ( RR < 20) || (W > 31) || ( W < 22) )
                    str="Abnormal";
                    else
                    str="Normal";

                }
                else if (age < 6){
                    if ( BP > 110 || BP < 80 || HR > 120 || HR < 80 || RR > 30 || RR < 20 || W > 40 || W < 31)
                     str="Abnormal";
                    else
                    str= "Normal";
                }
                else if (age < 13){
                    if ( BP > 120 || BP < 80 || HR > 110 || HR < 70 || RR > 30 || RR < 20 || W > 92 || W < 41 )
                      str="Abnormal";
                    else
                    str= "Normal";
                }
                else if (age > 12 ){
                    if ( BP > 120 || BP < 110 || HR > 105 || HR < 55 || RR > 30 || RR < 20 ||  W < 110 )
                     str="Abnormal";
                    else
                    str= "Normal";
                }
                return str;
}

}
