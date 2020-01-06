package classdesign.srp;

public class SingleResponsibilityOne {
    RoleManager roleManager;

    public SingleResponsibilityOne(RoleManager roleManager) {
        this.roleManager = roleManager;
    }

    public void updateOne() {
        if (roleManager.isAdmin()) {
            System.out.println("updated!");
        }
    }
}

class SingleResponsibilityTwo {
    RoleManager roleManager;

    public SingleResponsibilityTwo(RoleManager roleManager) {
        this.roleManager = roleManager;
    }

    public void updateTwo() {
        if (roleManager.isAdmin()) {
            System.out.println("updated!");
        }
    }
}

class RoleManager {
    boolean isAdmin() {
        return true;
    }
}