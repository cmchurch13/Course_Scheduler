/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sched_App_GUI;

import Sched_App_GUI.CourseNodeManager.checkTaken;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Calvin
 */
public class OverviewPanel extends JPanel {
    private GridBagConstraints cons = new GridBagConstraints();
    private JPanel ColorPanel = new JPanel();                                //Color bar at the top of a course (RED = can't take, BLUE = can take, GREEN = have taken and passed)
    private JLabel ClassNameLabel;
    private JCheckBox TakenCheckBox = new JCheckBox("Taken");                //Check box for student to choose which courses they have taken
    private JLabel CreditHoursLabel = new JLabel("Credit Hours:");
    private JTextField CreditHourTextField;
    private JLabel OfferedLabel = new JLabel("Offered:");
    private JTextField OfferedTextField;
    
    private final Color COLOR_BLUE = new Color(0,0,150);
    private final Color COLOR_DEFAULT = new Color(200,200,200);
    
    public OverviewPanel() {
        setLayout(new GridBagLayout());
        
        /* Field Initializations */
        ClassNameLabel = new JLabel("NONE 0000 Empty Class");
        CreditHourTextField = new JTextField("0");
        OfferedTextField = new JTextField("NEVER");
        OfferedTextField.setBackground(COLOR_DEFAULT);
        TakenCheckBox.setBackground(COLOR_DEFAULT);
        CreditHourTextField.setBackground(COLOR_DEFAULT);
        ColorPanel.setBackground(COLOR_BLUE);
        
        CreditHourTextField.setEditable(false);
        OfferedTextField.setEditable(false);
        ColorPanel.setBackground(COLOR_BLUE);
        
        assemblePanel();
    }
    
     public OverviewPanel(checkTaken listener, Color COLOR_OVER, Course c) {
        setLayout(new GridBagLayout());
        
        /* Field Initializations */
        ClassNameLabel = new JLabel(c.getDepartment() + " " + c.getID() + " " + c.getName());
        CreditHoursLabel = new JLabel("Credit Hours:");
        OfferedLabel = new JLabel("Offered:");
        OfferedTextField = new JTextField(c.getOffered());
        CreditHourTextField = new JTextField(String.valueOf(c.getCredithrs()));
        OfferedTextField.setBackground(COLOR_OVER);
        TakenCheckBox.setBackground(COLOR_OVER);
        CreditHourTextField.setBackground(COLOR_OVER);
        ColorPanel.setBackground(COLOR_BLUE);
        TakenCheckBox.addActionListener(listener);
        
        CreditHourTextField.setEditable(false);
        OfferedTextField.setEditable(false);
        ColorPanel.setBackground(COLOR_BLUE);
        
        assemblePanel();
    }
    
    private void assemblePanel(){
        setColorConstraints(cons);
        add(ColorPanel,cons);
        cons.gridy++;
        setInfoConstraints(cons);
        cons.ipadx = 5;
        add(ClassNameLabel,cons);
        cons.gridx++;
        add(TakenCheckBox, cons);
        cons.gridy++;
        cons.gridx--;
        add(CreditHoursLabel, cons);
        cons.gridx++;
        add(CreditHourTextField, cons);
        cons.gridy++;
        cons.gridx--;
        add(OfferedLabel, cons);
        cons.gridx++;
        add(OfferedTextField, cons);
        cons.gridy++;
        cons.gridx--;
    }
    
     private void setColorConstraints(GridBagConstraints c) {
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.EAST;
        c.weightx = 1.0;
        c.weighty = 1.0;
    }
     
     private void setInfoConstraints(GridBagConstraints c){
        c.gridwidth = 1;
        c.insets = new Insets(5,5,5,5);
    }
     
    public String getCreditHour(){
        return CreditHourTextField.getText();
    }
    
    public String getOffered(){
        return OfferedTextField.getText();
    }
    
    public String getCourse(){
        return ClassNameLabel.getText();
    }
}
