import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;
import javax.swing.JColorChooser;
/**
 * support class
 *
 * @author dewitno
 * @version 6/5/2021
 */
public class FlagSupport
{
    // variables
    final int rectX = 0;
    final int rectY = 500;
    final int rectWidth = 600;
    final int rectHeight = 20;
    final int lineX = 150;
    final int lineY1 = 25;
    final int lineY2 = 500;
    private double flagHeight = 60;
    private double flagWidth = 100;
    final double flagX = 153;
    final double flagY1 = 440;
    private double flagY2 = 440;
    
    
    /**
     * constructer
     */
    public FlagSupport() {
        
    }
    
    /**
     * draws flag staff
     */
    public void redraw() {
        UI.setLineWidth(5);
        UI.setColor(Color.black);
        UI.drawLine(lineX, lineY1, lineX, lineY2);
        UI.setColor(Color.green);
        UI.fillRect(this.rectX, this.rectY, this.rectWidth, this.rectHeight);
        UI.setColor(Color.blue);
        UI.fillRect(this.flagX, this.flagY1, this.flagWidth, this.flagHeight);
        UI.sleep(500);
    }
    
    /**
     * raises flag
     */
    public void raise(double dist) {
        erase();
        UI.setColor(Color.blue);
        this.flagY2 = this.flagY2 - dist;
        if (this.flagY2<this.lineY1) {
            UI.fillRect(this.flagX, this.lineY1, this.flagWidth, this.flagHeight);
            this.flagY2 = this.lineY1;
        } else {
            UI.fillRect(this.flagX, this.flagY2, this.flagWidth, this.flagHeight);
        }
        UI.sleep(500);
    }
    
    /** 
     * lowers flag
     */
    public void lower(double dist) {
        erase();
        UI.setColor(Color.blue);
        this.flagY2 = this.flagY2 + dist;
        if (this.flagY2>this.flagY1) {
            UI.fillRect(this.flagX, this.flagY1, this.flagWidth, this.flagHeight);
            this.flagY2 = this.flagY1;
        } else {
            UI.fillRect(this.flagX, this.flagY2, this.flagWidth, this.flagHeight);
        }
        UI.sleep(500);
    }
    
    /**
     * erases flag when it gets moved
     */
    private void erase() {
        UI.eraseRect(this.flagX+2, this.flagY2, this.flagWidth, this.flagHeight-3);
    }
}
