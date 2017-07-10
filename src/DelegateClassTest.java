/**
 * Created by Whyte on 2017/7/10.
 */
public class DelegateClassTest {
    public static void main(String[] args) {
        L2 c = new L2();
        c.f();//L
        c.toL1();
        c.f();//L1
        c.toL();
        c.f();//L
    }
}

interface I {
    void f();
}

class L implements I {
    public void f() {
        System.out.println("L");
    }
}

class L1 implements I {
    public void f() {
        System.out.println("L1");
    }
}

class L2 implements I {
    //将L对象委托为I接口，再通过I去调用
    private I i = new L();

    public void f() {
        i.f();
    }

    /**
     * 新建L对象
     */
    public void toL() {
        i = new L();
    }

    /**
     * 新建L1对象
     */
    public void toL1() {
        i = new L1();
    }
}


