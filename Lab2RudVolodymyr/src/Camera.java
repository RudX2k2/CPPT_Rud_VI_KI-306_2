import java.util.List;
import java.util.Random;

/**
 * Class <code>Camera</code> implements camera
 * @author Volodymyr Rud
 * @version 1.0
 */
public class Camera {
    //resolution of camera
    private int resolution;

    /**
     * Constructor
     * @param resolution
     */
    public Camera(int resolution) {
        setResolution(resolution);

    }
    /**
     * Method that checks on correctness of parameters to set resolution
     * @param resolution
     */
    public void setResolution(int resolution) {
        if (resolution > 0) {
            this.resolution = resolution;
        }
    }

    /**
     * Method that returns resolution of camera
     * @return resolution of camera
     */
    public int getResolution() {
        return resolution;
    }

    /**
     * Method that returns true 7 in 10 chance
     * @return true 7 in 10 chance
     */
    public boolean captureImage() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);

        return randomNumber < 8;
    }
}
