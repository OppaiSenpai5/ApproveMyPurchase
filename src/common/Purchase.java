package common;

public final class Purchase {
    private final int id;
    private final double cost;
    private final Type type;

    public Purchase(int id, double cost, Type type) {
        this.id = id;
        this.cost = cost;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Purchase with id %d that costs %.2f".formatted(
                this.getId(),
                this.getCost()
        );
    }

    public int getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }

    public Type getType() {
        return type;
    }
}
