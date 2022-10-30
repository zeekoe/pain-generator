package com.chessix.sepa.pain;

import generated.pain00800102.SequenceType1Code;

public class FinalTransactions extends TransactionBatch{
    @Override
    public SequenceType1Code getSequenceType() {
        return SequenceType1Code.FNAL;
    }
}
