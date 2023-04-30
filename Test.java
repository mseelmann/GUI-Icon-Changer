import java.awt.Color;
import javax.swing.SwingUtilities;
public class Test {
    public static void main(String[] args) {
            
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { 
                Model model = new Model(20,20,Color.YELLOW); 
				View view = new View(model);
                Controller controller = new Controller(model,view);
                controller.control();
            }
        }); 
    }
}