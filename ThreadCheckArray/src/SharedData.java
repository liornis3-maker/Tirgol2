import java.util.ArrayList;

/**
 * Holds data shared between threads for the subset-sum check:
 * the input numbers, the target b, a winner mask, and a found flag.
 */
public class SharedData {
    private ArrayList<Integer> array;
    private boolean[] winArray;
    private boolean flag;
    private final int b;

    /**
     * Creates a new SharedData container.
     * @param array the input numbers to search over
     * @param b     the target sum
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
    }

    /** @return the boolean mask of chosen indices (true if chosen) */
    public boolean[] getWinArray() { return winArray; }

    /** @param winArray the boolean mask to set */
    public void setWinArray(boolean[] winArray) { this.winArray = winArray; }

    /** @return the input numbers */
    public ArrayList<Integer> getArray() { return array; }

    /** @return the target sum */
    public int getB() { return b; }

    /**
     * @return true if a solution was found, false otherwise
     */
    public boolean getFlag() { return flag; }

    /**
     * Sets the "solution found" flag.
     * @param flag true if found, false otherwise
     */
    public void setFlag(boolean flag) { 
    	this.flag = flag; }
}
