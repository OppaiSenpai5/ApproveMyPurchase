import common.Purchase;
import handlers.abstractions.Approver;
import handlers.Manager;

import java.util.Arrays;
import java.util.List;

import static common.Type.*;

public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        List<Purchase> purchases = Arrays.asList(
                new Purchase(1, 15000, CONSUMABLES),
                new Purchase(2, 5000, PC),
                new Purchase(3, 6500, PC),
                new Purchase(4, 3000, CLERICAL),
                new Purchase(5, 4000, GAMING),
                new Purchase(6, 3000, GADGETS),
                new Purchase(7, 1001, CONSUMABLES),
                new Purchase(8, 200, CLERICAL)
        );

        for (Purchase p : purchases) {
            manager.approve(p);
            System.out.println();
        }

    }
}
