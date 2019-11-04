package Model;


/**
 * An Entity is an object, which has
 *   - a position (index of 2d-grid array)
 *   - height (size in pixels from ground up)
 *   - width (size in pixels from position away)
 *   - name (a recognizable definition)
 *   - indicator (an int as recognizable definiton inside the game)
 *   - color (a unique visual representation)
 *   a draw function: to draw itself onto the canvas
 *   a info function: to output information about itself into the console
 */

public interface entity {

    public int getX();

    public int getY();

    public int getHeigth();

    public int getWidth();

    public int getIndicator();

    public int getColor();

    public String getName();

    public int setX();

    public int setY();

    public int setHeigth();

    public int setWidth();

    public int setIndicator();

    public int setColor();

    public String setName();
   
    public void info();

    public int[] draw(
        int[] pixels,
        int yMin,
        int xMax,
        int tileWidth,
        int rowLength
    );
}
