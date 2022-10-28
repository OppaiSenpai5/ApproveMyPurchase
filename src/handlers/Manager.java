package handlers;

import common.Purchase;
import handlers.abstractions.ApproverWithLimit;

public class Manager extends ApproverWithLimit {

    @Override
    public int limitFor(Purchase purchase) {
        return switch (purchase.getType()) {
            case CONSUMABLES -> 300;
            case CLERICAL -> 500;
            case GADGETS -> 1000;
            case GAMING -> 3000;
            case PC -> 5000;
        };
    }
}
