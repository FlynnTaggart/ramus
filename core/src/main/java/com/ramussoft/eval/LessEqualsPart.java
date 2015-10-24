package com.ramussoft.eval;

public class LessEqualsPart extends MathPart {

    public LessEqualsPart(Value[] values) {
        super(values);
    }

    @Override
    protected EObject calc(EObject a, EObject b) {
        EqualsPart part = new EqualsPart(values);
        if (part.calc(a, b).longValue() != 0l)
            return new EObject(1);
        return new LessPart(values).calc(a, b);
    }

    @Override
    protected void space(StringBuffer sb) {
        sb.append("<=");
    }

}
