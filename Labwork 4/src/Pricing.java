public enum Pricing {
    TOP_UP(10.0f),
    MAKE_CALL(1.0f),
    SEND_TEXT(0.5f);

    private float price;

    private Pricing(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}