package shapeandsubclasses;

public class Rectangle extends Shape {
	
		private double width;
		private double length;
		
		public Rectangle()
		{
			
		}
		public Rectangle(double width, double length)
		{
			this.width = width;
			this.length = length;
		}
		public Rectangle(double width, double length,String color,boolean filled)
		{
			super(color,filled);
			this.width = width;
			this.length = length;
		}
		
		
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		
		
		public String toString()
		{
			return "Rectangle[Shape[color= "+getColor()+", filled= "+isFilled()+"], width: "+getWidth()+", length= "+getLength()+"]";
		}

}
