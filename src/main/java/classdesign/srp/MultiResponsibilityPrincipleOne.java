package classdesign.srp;

public class MultiResponsibilityPrincipleOne {
    public void updateOne() {
        if (isAdmin()) {
            System.out.println("updated!");
        }
    }

    private boolean isAdmin() {
        return true;
    }
}

class MultiResponsibilityPrincipleTwo {
    public void updateTwo() {
        if (isAdmin()) {
            System.out.println("updated!");
        }
    }

    private boolean isAdmin() {
        return true;
    }
}