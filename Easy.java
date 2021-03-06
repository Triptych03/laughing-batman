
/**
 * @author Stuart Aitken, Brandon Sandoval, Leah Williams, Avery Hockridge
 * Makes the maze Easier by setting less paths with more wall breaks 
 */
public class Easy implements Difficulty{
	private int size;
	private int extraPaths;
	
	/**
	 * Easy constructor
	 */
	public Easy(){
		size = 15;
		extraPaths = 2;
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
