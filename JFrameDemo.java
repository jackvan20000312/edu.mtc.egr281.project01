import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class JFrameDemo {
	public class JFrameDemo extends JFrame {

		private static final long serialVersionUID = 5793384690039519858L;// What Is This Supposed to DO?

		public JFrameDemo() {
			super();
			this.setTitle("Self Portrait");
			this.setSize(375,300);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}//end bracket of constructor

		public static void main(String[]args) {
			JFrameDemo hf = new JFrameDemo();
			hf.setVisible(true);
		}//ending bracket of method main
		
		public void paint(Graphics brush) {
	    	Color Hair1 = new Color(51, 47, 46);//Hair Color
	    	Color Hair2 = new Color(91, 63, 52);//Hair Color
	    	Color Skin = new Color(216, 180, 166);// Skin Color
	    	Color Eye = new Color(51, 47, 46);// Eye Color
	    	Color SkinShadow = new Color(202, 151, 132);// Skin Color Nose
	    	Color LE = new Color(231, 151, 132);// Skin Color Lips & Ears
	    	Color NoseHole = new Color(68, 40, 30);// Nose Hole
		}
}}
