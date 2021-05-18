package shapeandsubclasses;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj_shape = new Shape("red",true);
		Rectangle obj_rect = new Rectangle(4,9);
		obj_rect.setColor(obj_shape.getColor());
		obj_rect.setFilled(obj_shape.isFilled());
		
		Square obj_sq = new Square(10,obj_shape.getColor(),obj_shape.isFilled());
		obj_sq.setWidth(obj_sq.getSide());
		obj_sq.setLength(obj_sq.getSide());
		
		Circle obj_cir = new Circle(4);
		obj_cir.setColor(obj_shape.getColor());
		obj_cir.setFilled(obj_shape.isFilled());
		
		System.out.println(obj_shape);
		System.out.println(obj_cir);
		System.out.println(obj_rect);
		System.out.println(obj_sq);
	}
	

}
