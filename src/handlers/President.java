package handlers;

import common.Purchase;
import handlers.abstractions.ApproverWithLimit;

public class President extends ApproverWithLimit {

    @Override
    public int limitFor(Purchase purchase) {
        return switch (purchase.getType()) {
            case CONSUMABLES -> 1000;
            case CLERICAL -> 2000;
            case GADGETS -> 3000;
            case GAMING -> 5000;
            case PC -> 8000;
        };
    }
}
