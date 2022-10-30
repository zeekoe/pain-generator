package com.chessix.sepa.pain;

import generated.pain00800102.SequenceType1Code;

/**
 * Transactions for debtors who have had previous, successful direct debits with the creditor (RCUR)
 */
public class RecurringTransactions extends TransactionBatch {
    @Override
    public SequenceType1Code getSequenceType() {
        return SequenceType1Code.RCUR;
    }
}
