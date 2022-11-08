package study.book.effective.chap4.item15;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ComponentB implements APIOfComponentB{

    private int internalJob(){
        throw new NotImplementedException();
    }

    @Override
    public int openedAPI() {
        return internalJob();
    }
}
