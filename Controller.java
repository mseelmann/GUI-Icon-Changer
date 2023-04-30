import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;

class Controller {
	private Model model;
    private View view;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;    
         
    }
    public void control(){
    
		view.getTriangle().addActionListener(new ActionListener() {	
    		public void actionPerformed(ActionEvent e) {
				model.setShape(0);
						
				view.getLabel().repaint();
			}
		});
	
		view.getCircle().addActionListener(new ActionListener() {	
    		public void actionPerformed(ActionEvent e) {
				model.setShape(2);
						
				view.getLabel().repaint();
			}
		});
		
		view.getRectangle().addActionListener(new ActionListener() {	
    		public void actionPerformed(ActionEvent e) {
				model.setShape(1);
						
				view.getLabel().repaint();
			}
		});
		
		view.getRed().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    model.setIconColor(Color.RED);
				view.getLabel().repaint();
			}
		}); 
				
		view.getYellow().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					model.setIconColor(Color.YELLOW);
					view.getLabel().repaint();
		   }
		}); 
		
		view.getBlue().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setIconColor(Color.BLUE);
				view.getLabel().repaint();
			}
		}); 	
		
		view.getSlider().addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				model.setIconWidth(view.getSlider().getValue());
				model.setIconHeight(view.getSlider().getValue());
				
				view.getLabel().repaint();
			}
		});
		
    }
}