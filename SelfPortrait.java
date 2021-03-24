
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;

//Name: Jacob Vaught
//EGR-281
//Project-01__SelfPortrait
//9-2-2020

public class SelfPortrait extends JFrame {

	private static final long serialVersionUID = 5L;// What Is This Supposed to DO?

	public SelfPortrait() {
		super();
		this.setTitle("Self Portrait");
		this.setSize(250,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}//end bracket of constructor

	public static void main(String[]args) {
		SelfPortrait hf = new SelfPortrait();
		hf.setVisible(true);
	}//ending bracket of method main
	
	public void paint(Graphics paint_Function) {
    	Color Hair1 = new Color(51, 47, 46);//Hair Color
    	Color Hair2 = new Color(91, 63, 52);//Hair Color
    	Color Skin = new Color(216, 180, 166);// Skin Color
    	Color Eye = new Color(51, 47, 46);// Eye Color
    	Color SkinShadow = new Color(202, 151, 132);// Skin Color Nose
    	Color LE = new Color(231, 151, 132);// Skin Color Lips & Ears
    	Color NoseHole = new Color(68, 40, 30);// Nose Hole
    	
    	
    	super.paintComponents(paint_Function);
        Polygon decagon = new Polygon();
        
  for (int i = 0; i < 10; i++) decagon.addPoint((int) (
      100 + 100 * Math.cos(i * 2 * Math.PI / 10)),(int) (
      100 + 100 * Math.sin(i * 2 * Math.PI / 10)));
  paint_Function.setColor(Color.BLACK);    
  paint_Function.fillPolygon(decagon);
     
    	
    	
    	//paint_Function.setColor(Color.BLACK);
    	//paint_Function.fillRect(0, 0, 1000, 1000);
    	paint_Function.setColor(LE);
        paint_Function.fillOval(92, 145, 25, 18);//ears
        paint_Function.fillOval(90, 140, 25, 18);
        paint_Function.fillOval(175, 145, 25, 18);//ears
        paint_Function.fillOval(177, 140, 25, 18);
        paint_Function.setColor(Skin);
        paint_Function.fillOval(96, 92, 100, 125);//face
        paint_Function.setColor(Color.white);
        paint_Function.fillArc(128, 174, 37, 20, 180,180);  //bottom lip
        paint_Function.setColor(SkinShadow);
        paint_Function.fillPolygon(new int[] { 146, 146+15, 146-15 },//Nose
                          new int[] { 142, 170, 170 }, 3 );//Nose
        paint_Function.setColor(Color.BLACK);
    	paint_Function.drawLine(130, 189, 163, 189);
        paint_Function.setColor(LE);
        for (int j = 0; j < 3; j++) {
        paint_Function.setColor(LE);
        paint_Function.drawLine(128, 183 + j, 165, 183+j);//top lip
        paint_Function.drawArc(128, 173+j, 37, 20, 180, 180);  //bottom lip
        paint_Function.setColor(SkinShadow);
        paint_Function.drawArc(112, 140+j, 22, 14, 180, 180);  //bottom eye
        paint_Function.drawArc(162, 140+j, 22, 14, 180, 180);  //bottom eye
        paint_Function.setColor(NoseHole);
        paint_Function.fillOval(138, 165, 7, 5);//NoseHole Left
        paint_Function.fillOval(148, 165, 7, 5);//NoseHole Right
        }//closing bracket for lip
        paint_Function.setColor(Color.WHITE);
        paint_Function.fillOval(113, 141, 20, 11);//eye white
        paint_Function.fillOval(163, 141, 20, 11);//eye white
        paint_Function.setColor(Eye);
        paint_Function.fillOval(118, 142, 10, 10);//brown eye
        paint_Function.fillOval(168, 142, 10, 10);//brown eye
        paint_Function.setColor(Hair1);
        for (int i = 0; i < 4; i++) {
        paint_Function.drawLine(112, 134 + i, 133, 134+i);//eyebrows
        paint_Function.drawLine(162, 134 + i, 183, 134+i);
        paint_Function.drawLine(112, 134 + i, 106, 140+i);//eyebrows
        paint_Function.drawLine(183, 134 + i, 189, 140+i);
        for (int h = 0; h <= 15; h++){
        paint_Function.drawArc(95, 95-h, 100, 125, 115+h, 60);//Hair
        paint_Function.drawArc(95, 95-h, 100, 125, 125-h, -120);//Hair
        } //closing bracket for hair 
        paint_Function.setColor(Hair2);
        paint_Function.drawArc(97, 90, 80, 80, 30, 30);//Hair
        paint_Function.drawArc(96, 89, 80, 80, 30, 30);//Hair
        paint_Function.drawArc(95, 89, 80, 80, 30, 30);//Hair
        paint_Function.drawArc(94, 88, 80, 80, 30, 30);//Hair
        paint_Function.drawArc(93, 88, 80, 80, 30, 30);//Hair
        paint_Function.drawArc(92, 87, 80, 80, 30, 30);//Hair
        paint_Function.drawArc(91, 87, 80, 80, 30, 30);//Hair
        }//closing bracket for eyebrows
    }}//ending bracket of class

