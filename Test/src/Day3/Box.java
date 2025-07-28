package Day3;

public class Box {
	double width,height,depth;
	Box(double width,double depth,double height){
		this.width=width;
		this.depth=depth;
		this.height=height;
	}
	double getVolume() {
	return depth*width*height;}
	
	

	public static void main(String[] args) {
		Box b= new Box (10,2,3);
		System.out.println("Volume of the Box: " +b.getVolume());
		

	}

}
