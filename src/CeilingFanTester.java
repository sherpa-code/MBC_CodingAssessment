/**
 * CeilingFanTester object.
 * Creates a CeilingFan using invalid parameters to demonstrate exception handling;
 * demonstrates the cord logic specified in the test assessment specifications.
 *
 * @author joseph.crane
 */
public class CeilingFanTester {

    CeilingFanTester() {
        main();
    }

    public void main() {
        System.out.println("\nCeilingFanTester begins.");
        System.out.println("\nCreating a ceiling fan with invalid parameters...");
        CeilingFan ceilingFan = new CeilingFan(-1,-1, true, -1);

        ceilingFan.pullCord(0); // increment speed
        ceilingFan.pullCord(0);
        ceilingFan.pullCord(0);
        ceilingFan.pullCord(0);
        ceilingFan.pullCord(0);
        ceilingFan.pullCord(1);// reverse direction
        ceilingFan.pullCord(0);
        ceilingFan.pullCord(1);
        ceilingFan.pullCord(0);
        ceilingFan.pullCord(1);
        ceilingFan.pullCord(0);
        ceilingFan.pullCord(0);
        ceilingFan.pullCord(-1);// pulling an invalid cord (fanCordId < 0)
        ceilingFan.pullCord(0);
        ceilingFan.pullCord(4);// pulling an invalid cord (fanCordId >= numberOfCords)
        ceilingFan.pullCord(0);
        ceilingFan.pullCord(0);
    }

}
