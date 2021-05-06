import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;
import javax.swing.JColorChooser;
/**
 * Write a description of class FlagDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FlagDriver
{
    private FlagSupport pole = new FlagSupport();
    /**
     * constructer
     */
    public FlagDriver() {
        
    }
    
    /**
     * raises flag
     */    
    public void doRaiseFlag() {
        
    }
    
    /**
     * lowers flag
     */
    public void doLowerFlag() {
        
    }
    
    /**
     * creates flag staff
     */
    public void doFlagStaff() {
        this.pole.redraw();
    }
    
    /**
     * set distance to move flag
     */
    public void setDist(double dist) {
        
    }
    
    /**
     * set the name of the country
     */
    public void doName(String words) {
        
    }
    
    /**
     * clear graphics pane
     */
    private void clear() {
        UI.clearPanes();        // clear the graphics pane
        UI.setDivider(0.0);     // hide the text pane
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        FlagDriver flag = new FlagDriver();
        
        // constant variables
        final int HEIGHTMIN = 1;
        final int HEIGHTMAX = 50;
        final int HEIGHTINIT = 25;
        
        // setup of buttons, slider and textField
        UI.initialise();
        UI.addButton("Flag Staff", flag::doFlagStaff);
        UI.addButton("Raise", flag::doRaiseFlag);
        UI.addButton("Lower", flag::doLowerFlag);
        UI.addSlider("Change Height", HEIGHTMIN, HEIGHTMAX, HEIGHTINIT, flag::setDist);
        UI.addTextField("Country", flag::doName);
        
        // standard buttons
        UI.addButton("Clear", flag::clear);
        UI.addButton("Quit", UI::quit);
        UI.setDivider(0.0);
    }
}
