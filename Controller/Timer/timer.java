package Controller.Timer;

/**
 * A Helper class to keep track of the time a certain object
 * is already on screen.
 * Has a:
 *   - variable start, which holds the time in nanoseconds the Object was
 *     instantiated
 *   - function elapsed, returning the amount of time has passed since
 *     instanciation
 */

public class timer {
    private long start;

    public timer(){
        this.start = System.nanoTime();
    }

    public long elapsed(){
        return System.nanoTime() - this.start;
    }
}
