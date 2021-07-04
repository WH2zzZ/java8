package com.oowanghan.classfile.lsieun.code.opcode;

import com.oowanghan.classfile.lsieun.cst.OpcodeConst;
import com.oowanghan.classfile.lsieun.code.Instruction;
import com.oowanghan.classfile.lsieun.code.visitors.OpcodeVisitor;
import com.oowanghan.classfile.lsieun.code.facet.ArithmeticInstruction;

/**
 * IUSHR - Logical shift right int
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 */
public class IUSHR extends Instruction implements ArithmeticInstruction {

    public IUSHR() {
        super(OpcodeConst.IUSHR, 1);
    }

    @Override
    public void accept(final OpcodeVisitor v) {
        v.visitIUSHR(this);
    }

}
