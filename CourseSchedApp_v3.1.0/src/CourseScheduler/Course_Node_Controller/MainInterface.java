/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sched_App_GUI;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;

/**
 *
 * @author Calvin
 */
public class SchedAppGUI extends javax.swing.JApplet {
    
    CourseNodeManager GloriousCreator = new CourseNodeManager();

    /**
     * Initializes the applet SchedAppGUI
     */
    @Override
    public void init() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SchedAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchedAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchedAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchedAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        setBackground(new java.awt.Color(150,150,150));
        resize(1100,650);
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        SelectMajorComboBox = new javax.swing.JComboBox();
        CourseTypeComboBox = new javax.swing.JComboBox();
        CourseTypeComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        ExportButton = new javax.swing.JButton();
        SubmitErrorButton1 = new javax.swing.JButton();
        javax.swing.JTabbedPane ViewTabbedPane = new javax.swing.JTabbedPane();
        SchedScrollPane = new javax.swing.JScrollPane();
        SchedScrollPane.getVerticalScrollBar().setUnitIncrement(16);
        SchedTreePanel = new javax.swing.JPanel();
        SchedTreePanel1 = new javax.swing.JPanel();
        SchedTreePanel2 = new javax.swing.JPanel();
        SchedTreePanel3 = new javax.swing.JPanel();
        SchedTreePanel4 = new javax.swing.JPanel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(200, 200, 200));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1100, 600));
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setPreferredSize(new java.awt.Dimension(1100, 600));

        SelectMajorComboBox.setBackground(new java.awt.Color(150, 150, 150));
        SelectMajorComboBox.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        SelectMajorComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a Major", "Computer Science", "Chemistry", "Physics", "Biology", "Mathematics" }));
        SelectMajorComboBox.setMaximumSize(new java.awt.Dimension(153, 23));
        SelectMajorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectMajorComboBoxActionPerformed(evt);
            }
        });

        CourseTypeComboBox.setBackground(new java.awt.Color(150, 150, 150));
        CourseTypeComboBox.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        CourseTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Major Courses", "Science Courses", "Gen Ed Courses" }));

        CourseTypeComboBox1.setBackground(new java.awt.Color(150, 150, 150));
        CourseTypeComboBox1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        CourseTypeComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Panel View", "Table View", "List View" }));
        CourseTypeComboBox1.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton1.setText("Create Planner");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ExportButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        ExportButton.setText("Export");

        SubmitErrorButton1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        SubmitErrorButton1.setText("Submit Error");

        ViewTabbedPane.setBackground(new java.awt.Color(175, 175, 175));
        ViewTabbedPane.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N

        SchedScrollPane.setPreferredSize(new java.awt.Dimension(1000, 1000));

        SchedTreePanel.setBackground(new java.awt.Color(100, 0, 100));
        SchedTreePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        SchedTreePanel.setAutoscrolls(true);
        SchedTreePanel.setMaximumSize(new java.awt.Dimension(1500, 1500));
        SchedTreePanel.setMinimumSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout SchedTreePanelLayout = new javax.swing.GroupLayout(SchedTreePanel);
        SchedTreePanel.setLayout(SchedTreePanelLayout);
        SchedTreePanelLayout.setHorizontalGroup(
            SchedTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        SchedTreePanelLayout.setVerticalGroup(
            SchedTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );

        SchedScrollPane.setViewportView(SchedTreePanel);

        ViewTabbedPane.addTab("Major Courses", SchedScrollPane);

        SchedTreePanel1.setBackground(new java.awt.Color(100, 0, 100));
        SchedTreePanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        SchedTreePanel1.setAutoscrolls(true);
        SchedTreePanel1.setMaximumSize(new java.awt.Dimension(1500, 1500));
        SchedTreePanel1.setMinimumSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout SchedTreePanel1Layout = new javax.swing.GroupLayout(SchedTreePanel1);
        SchedTreePanel1.setLayout(SchedTreePanel1Layout);
        SchedTreePanel1Layout.setHorizontalGroup(
            SchedTreePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
        );
        SchedTreePanel1Layout.setVerticalGroup(
            SchedTreePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        ViewTabbedPane.addTab("Electives", SchedTreePanel1);

        SchedTreePanel2.setBackground(new java.awt.Color(100, 0, 100));
        SchedTreePanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        SchedTreePanel2.setAutoscrolls(true);
        SchedTreePanel2.setMaximumSize(new java.awt.Dimension(1500, 1500));
        SchedTreePanel2.setMinimumSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout SchedTreePanel2Layout = new javax.swing.GroupLayout(SchedTreePanel2);
        SchedTreePanel2.setLayout(SchedTreePanel2Layout);
        SchedTreePanel2Layout.setHorizontalGroup(
            SchedTreePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
        );
        SchedTreePanel2Layout.setVerticalGroup(
            SchedTreePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        ViewTabbedPane.addTab("Science Requirements", SchedTreePanel2);

        SchedTreePanel3.setBackground(new java.awt.Color(100, 0, 100));
        SchedTreePanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        SchedTreePanel3.setAutoscrolls(true);
        SchedTreePanel3.setMaximumSize(new java.awt.Dimension(1500, 1500));
        SchedTreePanel3.setMinimumSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout SchedTreePanel3Layout = new javax.swing.GroupLayout(SchedTreePanel3);
        SchedTreePanel3.setLayout(SchedTreePanel3Layout);
        SchedTreePanel3Layout.setHorizontalGroup(
            SchedTreePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
        );
        SchedTreePanel3Layout.setVerticalGroup(
            SchedTreePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        ViewTabbedPane.addTab("General Eduacation Requirements", SchedTreePanel3);

        SchedTreePanel4.setBackground(new java.awt.Color(100, 0, 100));
        SchedTreePanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        SchedTreePanel4.setAutoscrolls(true);
        SchedTreePanel4.setMaximumSize(new java.awt.Dimension(1500, 1500));
        SchedTreePanel4.setMinimumSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout SchedTreePanel4Layout = new javax.swing.GroupLayout(SchedTreePanel4);
        SchedTreePanel4.setLayout(SchedTreePanel4Layout);
        SchedTreePanel4Layout.setHorizontalGroup(
            SchedTreePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
        );
        SchedTreePanel4Layout.setVerticalGroup(
            SchedTreePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        ViewTabbedPane.addTab("Courses By Department", SchedTreePanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ExportButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CourseTypeComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CourseTypeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SelectMajorComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SubmitErrorButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(ViewTabbedPane)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(SelectMajorComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CourseTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CourseTypeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExportButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SubmitErrorButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ViewTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        ViewTabbedPane.getAccessibleContext().setAccessibleName("Major Courses");
    }// </editor-fold>//GEN-END:initComponents

    private void SelectMajorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectMajorComboBoxActionPerformed
        Course[]CourseList;
        CourseList = new Course[24];
       
        /* Course Info Hard Coding for testing purposes */
        Course Test = new Course(1470, 4, "Computer Science I", "CSCI", "Always");
        Course comp = new Course(1480, 4, "Computer Science II", "CSCI", "Always", "CSCI 1470 Computer Science I");
        CourseList[0] = Test;
        CourseList[1] = comp;
        comp = new Course(2320, 3, "Data Structures", "CSCI", "Always", "CSCI 1480 Computer Science II");
        CourseList[6] = comp;
        comp = new Course(2440, 3, "Assembly Language", "CSCI", "Always", "CSCI 1480 Computer Science II");
        CourseList[7] = comp;
        comp = new Course(3190, 1, "Social Implications", "CSCI", "Fall", "CSCI 2320 Data Structures");
        CourseList[12] = comp;
        comp = new Course(3330, 3, "Algorithms", "CSCI", "Always", "CSCI 2320 Data Structures");
        CourseList[13] = comp;
        comp = new Course(3360, 3, "Database Systems", "CSCI", "Fall", "CSCI 2320 Data Structures");
        CourseList[14] = comp;
        comp = new Course(3370, 3, "Principles of Program", "CSCI", "Spring", "CSCI 2320 Data Structures");
        CourseList[15] = comp;
        comp = new Course(3380, 3, "Computer Architecture", "CSCI", "Spring", "CSCI 2440 Assembly Language");
        CourseList[16] = comp;
        comp = new Course(3381, 4, "Java", "CSCI","Spring", "CSCI 2320 Data Structures");
        CourseList[17] = comp;
        comp = new Course(4191, 1, "Seminar", "CSCI", "Spring");
        CourseList[18] = comp;
        comp = new Course(4300, 3, "Operating Systems", "CSCI", "Spring", "CSCI 3330 Algorithms", "CSCI 3380 Computer Architecture");
        CourseList[19] = comp;
        comp = new Course(4490, 3, "Software Engineering", "CSCI", "Always", "CSCI 3381 Java");
        CourseList[20] = comp;
        
        SchedTreePanel.removeAll();
        GloriousCreator.TreeCreation(CourseList, SchedTreePanel);
    }//GEN-LAST:event_SelectMajorComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] params = new String[4];
        YearPlanner Planner = new YearPlanner();
        YearPlanner.main(params);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void changeFont ( Component component, Font font ){
        component.setFont ( font );
        if ( component instanceof Container )
        {
            for ( Component child : ( ( Container ) component ).getComponents () )
            {
                changeFont ( child, font );
         }
    }
}
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CourseTypeComboBox;
    private javax.swing.JComboBox CourseTypeComboBox1;
    private javax.swing.JButton ExportButton;
    private javax.swing.JScrollPane SchedScrollPane;
    private javax.swing.JPanel SchedTreePanel;
    private javax.swing.JPanel SchedTreePanel1;
    private javax.swing.JPanel SchedTreePanel2;
    private javax.swing.JPanel SchedTreePanel3;
    private javax.swing.JPanel SchedTreePanel4;
    private javax.swing.JComboBox SelectMajorComboBox;
    private javax.swing.JButton SubmitErrorButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    // End of variables declaration//GEN-END:variables
}
