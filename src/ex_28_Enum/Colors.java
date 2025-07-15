package ex_28_Enum;

public enum Colors {
    Red("#ff0000"),
    Blue("#0000ff"),
    white("#ffffff"),
    orange("#ffa500 ");

private String hexcode;

Colors(String hexcode){
    this.hexcode=hexcode;
}

    public String getHexcode() {
        return this.hexcode;
    }
}

