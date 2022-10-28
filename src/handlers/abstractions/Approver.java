package handlers.abstractions;

import common.Purchase;

public abstract class Approver {

    protected Approver next;

    public abstract void approve(Purchase purchase);

    public Approver registerNext(Approver next) {
        this.next = next;
        return next;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
