package handlers.abstractions;

import common.Purchase;

public abstract class ApproverWithLimit extends Approver {

    public abstract int limitFor(Purchase purchase);

    public boolean canApprove(Purchase purchase) {
        return purchase.getCost() <= this.limitFor(purchase);
    }

    @Override
    public void approve(Purchase purchase) {
        if (canApprove(purchase)) {
            System.out.println(this + " approved " + purchase);
            return;
        }

        System.out.println(purchase + " needs approval from higher a position than " + this);
        next.approve(purchase);
    }
}
