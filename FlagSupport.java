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
    final int rectHeight = 25;
    final int lineX = 150;
    final int lineY1 = 25;
    final int lineY2 = 500;
    private int flagHeight = 60;
    private int flagWidth = 100;
    
    /**
     * draws flag staff
     */
    public void redraw() {
        UI.setLineWidth(5);
        UI.setColor(Color.black);
        UI.drawLine(lineX, lineY1, lineX, lineY2);
        UI.setColor(Color.green);
        UI.fillRect(this.rectX, this.rectY, this.rectWidth, this.rectHeight);
    }
    
    /**
     * raises flag
     */
    public void raise() {
        
    }
    
    /** 
     * lowers flag
     */
    public void lower() {
        
    }
}
