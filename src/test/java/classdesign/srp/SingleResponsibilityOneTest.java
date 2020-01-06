package classdesign.srp;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleResponsibilityOneTest {

    @Test
    public void update() {
        RoleManager roleManager = new RoleManager();

        SingleResponsibilityOne singleResponsibilityOne = new SingleResponsibilityOne(roleManager);
        singleResponsibilityOne.updateOne();

        SingleResponsibilityTwo singleResponsibilityTwo = new SingleResponsibilityTwo(roleManager);
        singleResponsibilityTwo.updateTwo();
    }
}