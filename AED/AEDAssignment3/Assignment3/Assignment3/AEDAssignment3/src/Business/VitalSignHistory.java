/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;

/**
 *
 * @author priyank
 */
public class VitalSignHistory {
   
    private ArrayList<VitalSign> vitalSignHistory;
    
    public VitalSignHistory () {
        vitalSignHistory = new ArrayList<>();
   
    }
    
    
    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }
     
//No need of setter coz of constructer automatically allocate memore
    public void setVitalSignHistory(ArrayList<VitalSign> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    

  public VitalSign createVitalSign(){
        VitalSign vs = new VitalSign();
       vitalSignHistory.add(vs);
       return vs;
  }
   
   public void deleteVitalSign(VitalSign vs){
        vitalSignHistory.remove(vs);
   }
   
}
