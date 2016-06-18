/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Person;
import Business.VitalSign;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author priyank
 */
public class ChartPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChartPanel
     */
        private Person person;
    private JPanel userProcessContainer;
    public ChartPanel(Person person,JPanel userProcessContainer) {
        initComponents();
         this.person=person;
        this.userProcessContainer=userProcessContainer;
           
       
       
    }
private  CategoryDataset createDataset(int i){
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         for (VitalSign vs : person.getPatient().getVSH().getVitalSignHistory()){
           String countM = String.valueOf(vs.getDate());
         //  int countM = Integer.parseInt(mm);
           if (i==1){
             dataset.addValue(vs.getBloodPressure(),"BloodPressure",String.valueOf(countM));  
           }
           else if (i==2){
         dataset.addValue(vs.getRespiratoryRate(),"Respiration Rate",String.valueOf(countM));
           }
           else if (i==3){
               dataset.addValue(vs.getHeartRate(),"Heart rate",String.valueOf(countM));
           }
           else {
               dataset.addValue(vs.getWeight(),"Weight",String.valueOf(countM));
           }
        }
         return dataset;
    }
public void populateChart(Person person,int i){
    CategoryDataset dataset = createDataset(i);
    JFreeChart chart = createChart(dataset);

ChartFrame frame = new ChartFrame("Graph", chart);
frame.pack();
frame.setVisible(true);
}

private static JFreeChart createChart(CategoryDataset dataset) {
   // JFreeChart chart = ChartFactory.createLineChart("BAR Chart", null, null, dataset, PlotOrientation.HORIZONTAL, true, true, true);
        JFreeChart chart = ChartFactory.createLineChart(
           "Line Chart", null /* x-axis label*/, 
                "Range" /* y-axis label */, dataset);
        chart.addSubtitle(new TextTitle(" Its is generated to show patient History " 
                ));
        chart.setBackgroundPaint(Color.white);
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
	NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
      //  Line renderer = (BarRenderer) plot.getRenderer();
      //  renderer.setDrawBarOutline(false);
  //  LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer(); 
//renderer.setItemMargin(3); 
//renderer.setItemLabelsVisible(true);
        chart.getLegend().setFrame(BlockBorder.NONE);
        return chart;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBlood = new javax.swing.JButton();
        btnResp = new javax.swing.JButton();
        btnHeart = new javax.swing.JButton();
        btnWeight = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnBlood.setText("Blood Pressure");
        btnBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloodActionPerformed(evt);
            }
        });

        btnResp.setText("RespiratoryRate");
        btnResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespActionPerformed(evt);
            }
        });

        btnHeart.setText("Heart Rate");
        btnHeart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeartActionPerformed(evt);
            }
        });

        btnWeight.setText("Weight");
        btnWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWeightActionPerformed(evt);
            }
        });

        jLabel1.setText("GRAPH ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnResp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHeart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBlood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnBlood)
                .addGap(61, 61, 61)
                .addComponent(btnResp)
                .addGap(66, 66, 66)
                .addComponent(btnHeart)
                .addGap(67, 67, 67)
                .addComponent(btnWeight)
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloodActionPerformed
        // TODO add your handling code here:
        int i=1;
           populateChart(person,i);
    }//GEN-LAST:event_btnBloodActionPerformed

    private void btnRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespActionPerformed
        // TODO add your handling code here:
        int i=2;
        populateChart(person,i);
    }//GEN-LAST:event_btnRespActionPerformed

    private void btnHeartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeartActionPerformed
        // TODO add your handling code here:
        int i=3;
        populateChart(person,i);
    }//GEN-LAST:event_btnHeartActionPerformed

    private void btnWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWeightActionPerformed
        // TODO add your handling code here:
        int i=4;
        populateChart(person,i);
    }//GEN-LAST:event_btnWeightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlood;
    private javax.swing.JButton btnHeart;
    private javax.swing.JButton btnResp;
    private javax.swing.JButton btnWeight;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}