package com.oowanghan.classfile.lsieun.code.opcode;

import com.oowanghan.classfile.lsieun.cst.OpcodeConst;
import com.oowanghan.classfile.lsieun.code.Instruction;
import com.oowanghan.classfile.lsieun.code.visitors.OpcodeVisitor;
import com.oowanghan.classfile.lsieun.code.facet.ConstantPushInstruction;

public final class ICONST_1 extends Instruction implements ConstantPushInstruction {

    public final int value = 1;

    public ICONST_1() {
        super(OpcodeConst.ICONST_1, 1);
    }

    @Override
    public void accept(OpcodeVisitor v) {
        v.visitICONST_1(this);
    }

    @Override
    public Number getValue() {
        return Integer.valueOf(value);
    }

}
