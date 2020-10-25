package factory;

import entity.Anonymity;
import entity.Visitor;

public class AnonyFac implements VisitorFactory {

    @Override
    public Anonymity createVisitor(){
        return new Anonymity();
    }
}
