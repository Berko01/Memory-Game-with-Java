public class card {
    private boolean cardStatus = false;
    private int value;

    public card(int value) {

        this.value = value;
    }

    public boolean CardStatusInfo() {
        return cardStatus;
    }

    public void setCardStatus(boolean cardStatus) {
        this.cardStatus = cardStatus;
    }

    public int getValue() {
        return value;
    }

    public void setvalue(int value) {
        this.value = value;
    }

}
