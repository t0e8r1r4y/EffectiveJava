package study.book.effective.chap4.item15;

public class ComponentA {
    public void someOperation(){
//        APIOfComponentB componentB = new ComponentB(); // B가 완성되지 않으면 진행할 수 없다.
        // dummy에 테스트 데이터를 넣고 개발을 진행할 수 있다.
        APIOfComponentB componentB = new ComponentBDummy();
        componentB.openedAPI();
        System.out.println("A");
    }
}
