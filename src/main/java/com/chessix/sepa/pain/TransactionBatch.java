package com.chessix.sepa.pain;

import generated.pain00800102.SequenceType1Code;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public abstract class TransactionBatch {
    private List<Transaction> transactions = new ArrayList<Transaction>();
    private Date collectionDate;

    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * Returns the required collection date
     *
     * @return the required collection date
     */
    public Date getCollectionDate() {
        return collectionDate;
    }

    /**
     * Sets the required collection date
     * Normally this should be at least 2 working days in the future for recurring direct debits and 5 working days for first payments
     * Depending on the bank a payment can be declined or a new date is set when it does not comply with regulations
     *
     * @param collectionDate the collection date to set.
     */
    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public void setCollectionDate(LocalDate collectionDate) {
        this.collectionDate = Date.from(collectionDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public abstract SequenceType1Code getSequenceType();

    @Override
    public String toString() {
        return "TransactionBatch{\n" +
                "collectionDate=" + collectionDate +
                "\ntransactions=" +
                transactions.stream()
                        .map(Transaction::toString)
                        .collect(Collectors.joining("\n,"))
                + "\n}";
    }
}
