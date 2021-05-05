package facade;

public class ShapeFacade {

	
	private Shape circle;
	private Shape square;
	private Shape rectangle;
	
	
	public ShapeFacade() {
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.square = new Square();
	}

	public void drawCircle() {
		
		//complexity to draw it
		
		this.circle.draw();
	}
	public void drawRectangle() {
		
		//complexity to draw it
		
		this.rectangle.draw();
	}
	public void drawSquare() {
	
	//complexity to draw it
	
		this.square.draw();
	}
	
}
