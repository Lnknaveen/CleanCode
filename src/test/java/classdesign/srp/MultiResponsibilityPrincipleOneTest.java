package classdesign.srp;

import org.junit.Test;

public class MultiResponsibilityPrincipleOneTest {

    @Test
    public void update() {
        MultiResponsibilityPrincipleOne multiResponsibilityPrincipleOne = new MultiResponsibilityPrincipleOne();
        multiResponsibilityPrincipleOne.updateOne();

        MultiResponsibilityPrincipleTwo multiResponsibilityPrincipleTwo = new MultiResponsibilityPrincipleTwo();
        multiResponsibilityPrincipleTwo.updateTwo();
    }
}