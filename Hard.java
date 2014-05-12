
/**
 * @author Stuart Aitken, Brandon Sandoval, Leah Williams, Avery Hockridge
 * Makes the maze harder by setting more paths with less wall breaks 
 */
public class Hard implements Difficulty{
	private int size;
	private int extraPaths;
	
	/**
	 * Hard constructor
	 */
	public Hard(){
		size = 25;
		extraPaths = 0;
	}

	@Override
	public int getSize() {
		int size = this.size;
		
		return size;
	}

	@Override
	public int getExtraPaths() {
		int extraPaths = this.extraPaths;

		return extraPaths;
	}
	
}
