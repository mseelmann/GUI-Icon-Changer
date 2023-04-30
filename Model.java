import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class Model implements Icon {
	private int width;
    private int height;
    private Color color;
	private int shape;
	
    public Model(int width, int height, Color color) {
	this.width=width;
	this.height=height;
	this.color=color;
    }
	
    public int getIconWidth() {
		return width;
    }
    public int getIconHeight() {
		return height;
    }
	public Color getIconColor() {
		return color;
    }
	public int getShape() {
		return shape;
	}
	
	public void setIconWidth(int width) {
		this.width = width;
    }
    public void setIconHeight(int height) {
		this.height = height;
    }
	public void setIconColor(Color color) {
		this.color = color;
    }
	public void setShape(int shape) {
		this.shape = shape;
	}
	
    public void paintIcon(Component c, Graphics g, int x, int y){
		Graphics2D g2 = (Graphics2D) g;
		if(shape==1) {
			Rectangle r = new Rectangle(x, y, width, height);
			g2.setColor(color);
			g2.fill(r);
		}else if(shape==2) {
			Ellipse2D.Double r = new Ellipse2D.Double(x,y, width, width);
			g2.setColor(color);
			g2.fill(r);
		}else {
			Triangle_Shape r = new Triangle_Shape(new Point2D.Double(x+(width/2),x+0),
                new Point2D.Double(x+width,x+height), new Point2D.Double(x+0,x+height));
			g2.setColor(color);
			g2.fill(r);
		}
    }
}
class Triangle_Shape extends Path2D.Double {
	public Triangle_Shape(Point2D... points) {
        moveTo(points[0].getX(), points[0].getY());
        lineTo(points[1].getX(), points[1].getY());
        lineTo(points[2].getX(), points[2].getY());
        closePath();
    }
}