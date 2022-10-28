package handlers.abstractions;

import common.Purchase;

public abstract class ApproverWithLimit extends Approver {

    protected abstract int limitFor(Purchase purchase);

    protected boolean canApprove(Purchase purchase) {
        return purchase.getCost() <= this.limitFor(purchase);
    }

    @Override
    public void approve(Purchase purchase) {
        if (canApprove(purchase)) {
            System.out.println(this + " approved " + purchase);
            return;
        }

        System.out.println(purchase + " needs approval from a higher position than " + this);
        next.approve(purchase);
    }
}
