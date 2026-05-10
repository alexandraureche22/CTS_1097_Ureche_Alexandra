package gaming.main.mainSingleton;

import gaming.model.singleton.TestingModule;

public class Main {
    public static void main(String[] args) {
        TestingModule testingModule1 = TestingModule.getInstance();
        TestingModule testingModule2 = TestingModule.getInstance();
        System.out.println("egale?"+(testingModule2==testingModule1));
        System.out.println(testingModule1.test());
    }
}
