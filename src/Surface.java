public class Surface {

	/**
	 * Should we have one Surface class or should we create multiple classes
	 * (that may inherit from the Surface class) for different types of
	 * surfaces?
	 */

	private int type;
	private int height;
	private int width;
	private static int length;
	private double tileArea;
	private static double trimArea;
	private double paintArea;

	final int TYPE_FLOOR = 0;
	final int TYPE_CEILING = 1;
	final int TYPE_WALL = 2;

	public Surface() {

 	}
	
	public Surface(int type, int length) {

		this.type = type;
		this.length = length;
		}
	public Surface(int type, int length, int width) {
		this.type = type;
		this.length = length;
		this.width = width;
		}
	public Surface(int type, int length, int width, int height) {
		this.type = type;
		this.length = length;
		this.width = width;
		this.height = height;
	}


	public double getfloorArea(int length, int width) {
		return tileArea = length * width;
	}

	public double getPaintArea(int height, int width) {
		return paintArea = height * width;
	}

	public static double gettrimArea() {
		return trimArea = length;
	}
}
