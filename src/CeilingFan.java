/**
 * CeilingFan object.
 * Has a currentSpeed, maxSpeed, direction of rotation, and number of cords.
 * Prints its attributes,
 * Validates parameters
 *
 * @author joseph.crane
 */

public class CeilingFan {

    private int currentSpeed;
    private int maxSpeed;
    private boolean fanDirection;
    private int numberOfCords;

    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public void setCurrentSpeed(int currentSpeed)
    {
        try {
            if (currentSpeed >= 0 && currentSpeed <= getMaxSpeed()) {
                this.currentSpeed = currentSpeed;
            } else {
                throw new IllegalArgumentException("Tried to set currentSpeed outside of valid range.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e+"\nInstead setting currentSpeed to 0.\n");
            this.currentSpeed = 0;
        }
    }

    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) {
        try {
            if (maxSpeed >= 0) {
                this.maxSpeed = maxSpeed;
            } else {
                throw new IllegalArgumentException("Tried to set maxSpeed to a negative value.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e+"\nInstead setting maxSpeed to 3.\n");
            this.maxSpeed = 3;
        }
    }

    public boolean getFanDirection() { return fanDirection; }
    public void setFanDirection(boolean fanDirection) { this.fanDirection = fanDirection; }

    public int getNumberOfCords() { return this.numberOfCords; }
    public void setNumberOfCords(int numberOfCords) {
        try {
            if (numberOfCords >= 0) {
                this.numberOfCords = numberOfCords;
            } else {
                throw new IllegalArgumentException("Tried to set number of cords to a negative value.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e+"\nInstead setting numberOfCords to 2.\n");
            this.numberOfCords = 2;
        }
    }

    CeilingFan(int currentSpeed, int maxSpeed, boolean fanDirection, int numberOfCords) {
        setCurrentSpeed(currentSpeed);
        setMaxSpeed(maxSpeed);
        setFanDirection(fanDirection);
        setNumberOfCords(numberOfCords);
        System.out.println("I am a ceiling fan with " + getNumberOfCords() + " cords.");
        System.out.println("My maximum speed of rotation is " + getMaxSpeed() + ".");
        selfReport();
    }

    /**
     * Validates fanCordId and may the cord's corresponding method.
     * @param fanCordId unique numeric id for each cord controlling the fan
     */
    public void pullCord(int fanCordId) {
        System.out.println("\nAttempting to pull cord with id " + fanCordId + "...");
        try {
            if (fanCordId >= 0 && fanCordId < getNumberOfCords()) {
                switch (fanCordId) {
                    case 0:
                        incrementFanSpeed();
                        break;
                    case 1:
                        reverseFanDirection();
                        break;
                }
                System.out.println("Success.");
                selfReport();
            } else {
                System.out.println("Failed.");
                throw new IllegalArgumentException("fanCordId is out of range.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            selfReport();
        }
    }

    /**
     * Increases fan speed incrementally.
     * Reduces fan speed to 0 (off) when 'pulled' at max speed.
     */
    private void incrementFanSpeed() {
        int currentSpeed = getCurrentSpeed();
        int maxSpeed = getMaxSpeed();

        if (currentSpeed == maxSpeed) {
            setCurrentSpeed(0);
        } else {
            setCurrentSpeed(currentSpeed + 1);
        }
    }

    /**
     * Reverses the direction of the fan's rotation.
     */
    private void reverseFanDirection() {
        setFanDirection(!getFanDirection());
    }

    /**
     * Prints the CeilingFan's speed and direction of rotation.
     */
    public void selfReport() {
        String output = "";
        if (getCurrentSpeed() == 0) {
            output += "My current speed is 0; I am not spinning.";
        } else {
            output += "I am spinning ";
            if (getFanDirection()) {
                output += "clockwise";
            } else {
                output += "counterclockwise";
            }
            output += " at speed " + getCurrentSpeed() + ".";
        }
        System.out.println(output);
    }
}