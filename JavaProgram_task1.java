package pratices.index;                      

class Employee {
    void work() {
        System.out.println("employee working");
    }
}

interface Developer {
    void develop();
}

interface Tester {
    void test();
}

class TeamLead extends Employee implements Developer, Tester {
    public void develop() {
        System.out.println("Web developer");
    }

    public void test() {
        System.out.println("Software tester");
    }
}

public class Javaprogram_task1 {
    public static void main(String[] args) {
        TeamLead a = new TeamLead();
        a.work();
        a.develop();
        a.test();
    }
}
