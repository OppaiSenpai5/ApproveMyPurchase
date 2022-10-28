package handlers;

import common.Purchase;
import handlers.abstractions.Approver;

public class ExecutiveMeeting extends Approver {
    private static final ExecutiveMeeting INSTANCE = new ExecutiveMeeting();

    public static ExecutiveMeeting getInstance() {
        return INSTANCE;
    }

    @Override
    public void approve(Purchase purchase) {

        System.out.println(purchase + " requires an approval of executive meeting.");
    }

}
