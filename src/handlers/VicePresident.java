package handlers;

import common.Purchase;
import handlers.abstractions.ApproverWithLimit;

public class VicePresident extends ApproverWithLimit {

    @Override
    public int limitFor(Purchase purchase) {
        return switch (purchase.getType()) {
            case CONSUMABLES -> 700;
            case CLERICAL -> 1500;
            case GADGETS -> 2000;
            case GAMING -> 4500;
            case PC -> 6500;
        };
    }
}
