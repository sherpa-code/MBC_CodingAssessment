/**
 * CeilingFanApplication object.
 * Can either create a CeilingFan and with the test assessment specifications and print them;
 * or create a CeilingFanTester to demonstrate functionality and exception handling in CeilingFan.
 *
 * @author joseph.crane
 */

public class CeilingFanApplication {
    public static void main(String[] args){
        // Create a CeilingFan fan using the specifications from the assessment test statement
        //  then print its attributes.
        //CeilingFan ceilingFan = new CeilingFan(0,3, true, 2);

        // Create a CeilingFanTester to demonstrate CeilingFan exception handling and cord pulling functionality
        CeilingFanTester ceilingFanTester = new CeilingFanTester();
    }
}
