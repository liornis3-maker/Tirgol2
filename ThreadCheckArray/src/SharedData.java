import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class SharedData 
{
	private ArrayList <Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/** SharedData class holds the shared information used by multiple threads.
	 * @param array
	 * @param constarctor 
	 */
	public SharedData(ArrayList array, int b) {
		this.array =array;
		this.b = b;
	}

	/**  Boolean array representing which elements matched (true/false)
	 * @return  winArray
	 */ 
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/** Sets the result boolean array after processing.
	 * @param winArray the boolean array to set
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**Returns the list of integers being processed.
	 * @return array the ArrayList of integers
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/** Returns the target number to search for.
	 * @return  b the target number
	 */
	public int getB() 
	{
		return b;
	}

	/**Returns the current flag value.
     * Indicates whether the target number was found or not.
	 * @return  true if the target number was found, false otherwise
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * Sets the flag value.
     * Used by threads to update whether the target number was found.
	 * @param flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
