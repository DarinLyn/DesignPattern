package behavioralpattern.chainofresponsibilitypattern.demo2;

public class Client {

    public static void main(String[] args) {
        //initial responsibility chain
        Handler projectManager = new ProjectManager();
        Handler deptManager = new DeptManager();
        Handler globalManager = new GlobalManager();

        projectManager.setSuccessor(deptManager);
        deptManager.setSuccessor(globalManager);

        //begin test
        String test1 = projectManager.handleFeeRequest("Darin", 300);
        System.out.println("test1 = " + test1);
        String test2 = projectManager.handleFeeRequest("Daisy", 300);
        System.out.println("test2 = " + test2);
        System.out.println("--------------------------------------------------");

        String test3 = projectManager.handleFeeRequest("Darin", 700);
        System.out.println("test3 = " + test3);
        String test4 = projectManager.handleFeeRequest("Daisy", 700);
        System.out.println("test4 = " + test4);
        System.out.println("--------------------------------------------------");

        String test5 = projectManager.handleFeeRequest("Darin", 1500);
        System.out.println("test5 = " + test5);
        String test6 = projectManager.handleFeeRequest("Daisy", 1500);
        System.out.println("test6 = " + test6);
        System.out.println("--------------------------------------------------");

    }
}
