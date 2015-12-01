/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sched_App_GUI;

import Sched_App_GUI.CourseNodeManager.checkTaken;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTabbedPane;

/**
 *
 * @author Calvin
 */
public class CoursePane extends JTabbedPane{
    /* Global Constants */
    private final Color COLOR_PANE = new Color(150,150,150);
    private final Color COLOR_OVER = new Color(200,200,200);
    private final Color COLOR_PRER = new Color(150,150,150);
    
    /* Global Variable Declarations and Initializations */
    private Font CourseFont = new Font("Serif",0,14);
    private Font PrereqFont = new Font("Serif",0,14);
    
    /**
     * Constructor: 0 Arguments
     */
    public CoursePane(){
        OverviewPanel OverviewPan = new OverviewPanel();
        PrerequisitePanel PrerequisitesPan = new PrerequisitePanel();
        
        /* Miscellaneous Component Edits */
        this.setBackground(COLOR_PANE);
        OverviewPan.setBackground(COLOR_OVER);
        PrerequisitesPan.setBackground(COLOR_PRER);
        
        
        //Safeguard against font-growth infinite loop
        OverviewPan.setMaximumSize(new Dimension(400,400));
        PrerequisitesPan.setMaximumSize(new Dimension(400,400));
        
        changeFont(OverviewPan, CourseFont);
        changeFont(PrerequisitesPan, PrereqFont);
        setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
        setFont(CourseFont);
        add("Overview", OverviewPan);
        add("Prerequisites", PrerequisitesPan);
    }
    
    /**
     * Creates a course pain based on course information passed in to it in @c
     * @param c 
     * @param Lstnr 
     */
    public CoursePane(Course c, checkTaken Lstnr){
        OverviewPanel OverviewPan = new OverviewPanel(Lstnr, COLOR_OVER,c);
        PrerequisitePanel PrerequisitesPan = new PrerequisitePanel(c, COLOR_PRER);
        
        /* Miscellaneous Component Edits */
        this.setBackground(COLOR_PANE);
        OverviewPan.setBackground(COLOR_OVER);
        PrerequisitesPan.setBackground(COLOR_PRER);
        
        
        //Safeguard against font-growth infinite loop
        OverviewPan.setMaximumSize(new Dimension(400,400));
        PrerequisitesPan.setMaximumSize(new Dimension(400,400));
        
        changeFont(OverviewPan, CourseFont);
        changeFont(PrerequisitesPan, PrereqFont);
        PrerequisitesPan.setFont(PrereqFont);
        setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
        setFont(CourseFont);
        add("Overview", OverviewPan);
        add("Prerequisites", PrerequisitesPan);
        
    }
    
    private static void changeFont ( Component component, Font font ){
        component.setFont ( font );
        if ( component instanceof Container ){
            for ( Component child : ( ( Container ) component ).getComponents () ){
                changeFont ( child, font );
            }
        }
    }
}
