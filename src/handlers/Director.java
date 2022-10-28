package handlers;

import common.Purchase;
import handlers.abstractions.ApproverWithLimit;

public class Director extends ApproverWithLimit {

    @Override
    public int limitFor(Purchase purchase) {
        return switch (purchase.getType()) {
            case CONSUMABLES -> 500;
            case CLERICAL -> 1000;
            case GADGETS -> 1500;
            case GAMING -> 3500;
            case PC -> 6000;
        };
    }
}
