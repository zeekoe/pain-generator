package com.chessix.sepa.pain;

import generated.pain00800102.SequenceType1Code;

/**
 * Transactions for debtors who have NO successful direct debits with the creditor yet (FRST)
 */
public class FirstTransactions extends TransactionBatch {
    @Override
    public SequenceType1Code getSequenceType() {
        return SequenceType1Code.FRST;
    }
}
