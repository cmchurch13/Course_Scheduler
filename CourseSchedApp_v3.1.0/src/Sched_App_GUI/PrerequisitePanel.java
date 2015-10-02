/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sched_App_GUI;

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
public class PrerequisitePanel extends JPanel {
    private GridBagConstraints cons = new GridBagConstraints();
    private JLabel Prerequisite_1Label = new JLabel("Prerequisite 1:");
    private JLabel Prerequisite_2Label = new JLabel("Prerequisite 2:");
    private JTextField Prerequisite_1TextField = new JTextField();
    private JTextField Prerequisite_2TextField = new JTextField();
    private JCheckBox Prerequisite_1CheckBox = new JCheckBox("Passed");
    private JCheckBox Prerequisite_2CheckBox = new JCheckBox("Passed");
    
    public PrerequisitePanel() {
        setLayout(new GridBagLayout());

        Prerequisite_1TextField.setText("NONE");
        Prerequisite_2TextField.setText("NONE");
        Prerequisite_1TextField.setEditable(false);
        Prerequisite_2TextField.setEditable(false);
        Prerequisite_1CheckBox.setEnabled(false);
        Prerequisite_2CheckBox.setEnabled(false);
        
        assemblePanel();
    }
    
    public PrerequisitePanel(Course c, Color COLOR_PRER){
        setLayout(new GridBagLayout());
        
        Prerequisite_1TextField.setText(c.getPrerequisites().get(0));
        Prerequisite_2TextField.setText(c.getPrerequisites().get(1));
        Prerequisite_1TextField.setEditable(false);
        Prerequisite_2TextField.setEditable(false);
        Prerequisite_1CheckBox.setEnabled(false);
        Prerequisite_2CheckBox.setEnabled(false);
        
        Prerequisite_1CheckBox.setBackground(COLOR_PRER);
        Prerequisite_2CheckBox.setBackground(COLOR_PRER);
        
        assemblePanel();
    }
    
    private void assemblePanel() {
        //Prerequisites Panel Components Added
        setColorConstraints(cons);
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 3;
        add(Prerequisite_1Label, cons);
        cons.gridy++;
        cons.gridwidth = 2;
        add(Prerequisite_1TextField, cons);
        cons.gridx += 2;
        cons.gridwidth = 1;
        add(Prerequisite_1CheckBox, cons);
        cons.gridx = 0;
        cons.gridy++;
        cons.gridwidth = 3;
        add(Prerequisite_2Label, cons);
        cons.gridy++;
        cons.gridwidth = 2;
        add(Prerequisite_2TextField, cons);
        cons.gridx += 2;
        cons.gridwidth = 1;
        add(Prerequisite_2CheckBox, cons);
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
     
    public String getPrerequisite1(){
        return Prerequisite_1TextField.getText();
    }
    
    public String getPrerequisite2(){
        return Prerequisite_2TextField.getText();
    }
}
