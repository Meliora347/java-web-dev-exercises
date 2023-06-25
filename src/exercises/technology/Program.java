package exercises.technology;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Program {

    private Computer testComputer;
    private Computer fastComputerTest;

    private SmartPhone testPhone;
    private Laptop testLaptop;

    @Before
            public void setup() {
         testComputer = new Computer(200, 1200, true);
        fastComputerTest = new Computer(600, 1200, true);
        testPhone = new SmartPhone(1,9,false,9);
        testLaptop = new Laptop(50, 100, true, 400);
    }


    @Test
    public void computerIsSlowTest(){
        Assert.assertTrue(testComputer.isSlow());
    }

    @Test
    public void computerHasLargeDisplay(){
        Assert.assertTrue(testComputer.hasLargeDisplay());
    }

    @Test
    public void computerHasSmallDisplay(){
        Assert.assertFalse(testComputer.hasLargeDisplay());
    }

    @Test
    public void fastComputerIsFast(){
        Assert.assertFalse(fastComputerTest.isSlow());
    }

    @Test
    public void testPhoneNumberOfAppsTest(){
        Assert.assertEquals(9, testPhone.getNumberOfApps());
    }

    @Test
    public void testPhoneInstallAppTest(){
        testPhone.installApp();
        Assert.assertEquals(10, testPhone.getNumberOfApps() );
    }

    @Test
    public void testPhoneHasNoKeyboard(){
        Assert.assertFalse(testPhone.HasKeyboard());
    }


    @Test
    public void testLaptopHasKeyboard(){
        Assert.assertEquals(true, testLaptop.HasKeyboard());
    }

    @Test
    public void testLaptopCanRunDOTA(){
        Assert.assertTrue(testLaptop.isFastEnoughForDOTA());
    }

    @Test
    public void testLaptopHasSmallDisplay(){
        Assert.assertFalse(testLaptop.hasLargeDisplay());
    }
}
