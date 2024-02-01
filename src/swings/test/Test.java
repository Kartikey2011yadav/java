package swings.test;

import swings.Graphs.chart.ModelChart;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author swings.Graphs
 */
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    public Test() {
        initComponents();
        chart.setTitle("Chart Data");
        chart.addLegend("Amount", Color.decode("#7b4397"), Color.decode("#dc2430"));
        chart.addLegend("Cost", Color.decode("#e65c00"), Color.decode("#F9D423"));
        chart.addLegend("Profit", Color.decode("#0099F7"), Color.decode("#F11712"));
        test();
//        setData();
    }

    private void setData() {
        try {
            List<ModelData> lists = new ArrayList<>();
            List<String> month = new ArrayList<>();
            month.add("Jan");
            month.add("Feb");
            month.add("Mar");
            month.add("Apr");
            month.add("May");
            month.add("Jun");
            month.add("Jul");
            month.add("Aug");
            month.add("Sep");
            month.add("Out");
            month.add("Nov");
            month.add("Dec");
            for (int i=1;i<13;i++){
                String mo = month.get(i-1);
                double amount = (i*10)+200;
                double cost = 30;
                double profit = 50;
                lists.add(new ModelData(mo, amount, cost, profit));
            }
            //  Add Data to chart
            for (int i = 1; i < 13; i++) {
                ModelData d = lists.get(i-1);
                chart.addData(new ModelChart(d.getMonth(), new double[]{d.getAmount(), d.getCost(), d.getProfit()}));
            }
            //  Start to show data with animation
            chart.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void test() {
        chart.clear();
        chart.addData(new ModelChart("January", new double[]{500, 50, 100}));
        chart.addData(new ModelChart("February", new double[]{600, 300, 150}));
        chart.addData(new ModelChart("March", new double[]{200, 50, 900}));
        chart.addData(new ModelChart("April", new double[]{480, 700, 100}));
        chart.addData(new ModelChart("May", new double[]{350, 540, 500}));
        chart.addData(new ModelChart("June", new double[]{450, 800, 100}));
        chart.start();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new swings.Graphs.panel.PanelGradient();
        chart = new swings.Graphs.chart.CurveLineChart();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelShadow1.setBackground(new java.awt.Color(34, 59, 69));
        panelShadow1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelShadow1.setColorGradient(new java.awt.Color(17, 38, 47));

        chart.setForeground(new java.awt.Color(237, 237, 237));
        chart.setFillColor(true);

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swings.Graphs.chart.CurveLineChart chart;
    private swings.Graphs.panel.PanelGradient panelShadow1;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @author swings.Graphs
     */
    public static class ModelData {

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public double getProfit() {
            return profit;
        }

        public void setProfit(double profit) {
            this.profit = profit;
        }

        public ModelData(String month, double amount, double cost, double profit) {
            this.month = month;
            this.amount = amount;
            this.cost = cost;
            this.profit = profit;
        }

        public ModelData() {
        }

        private String month;
        private double amount;
        private double cost;
        private double profit;
    }
}
