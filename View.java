import java.awt.*;
import javax.swing.*;

public class View {
	private JFrame frame = new JFrame();
	private JPanel p = new JPanel();
	private JSlider slider;
	private JLabel label;
	private Model icn;
    
	private JButton rectangle;
	private JButton triangle;
	private JButton circle;
	private JButton red;
	private JButton yellow;
	private JButton blue;
	
    public View(Model model) {

		p.setLayout(new BorderLayout());
		
		icn = model; 
		label = new JLabel(icn);
		p.add(label,BorderLayout.CENTER);
		
		JPanel north = new JPanel(new GridLayout(1,3));
		rectangle = new JButton("Rectangle");  
		triangle = new JButton("Triangle");
		circle = new JButton("Circle");       
		north.add(rectangle);
		north.add(triangle);
		north.add(circle);
		p.add(north,BorderLayout.NORTH);
		
		JPanel south = new JPanel(new GridLayout(1,3));
		red = new JButton("Red");
		yellow = new JButton("Yellow");
		blue = new JButton("Blue");
		south.add(red);
		south.add(yellow);
		south.add(blue);
		p.add(south,BorderLayout.SOUTH);
		
		JPanel west = new JPanel();
		slider = new JSlider(1,20,150,20);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		west.add(slider);
		p.add(west,BorderLayout.WEST);
		
		frame.add(p);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
    }
	public JButton getRectangle(){
        return rectangle;
    }
	public JButton getTriangle(){
        return triangle;
    }
	public JButton getCircle(){
        return circle;
    }
	public JButton getRed(){
        return red;
    }
	public JButton getYellow(){
        return yellow;
    }
	public JButton getBlue(){
        return blue;
    }
	public JLabel getLabel(){
		return label;
	}
	public JSlider getSlider(){
		return slider;
	}
}