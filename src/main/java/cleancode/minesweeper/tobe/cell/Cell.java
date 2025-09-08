package cleancode.minesweeper.tobe.cell;

public interface Cell {
    String FLAG_SIGN = "⚑";
    String UNCHECKED_SIGN = "□";

    boolean isLandMine();

    void flag();

    String getSign();

    boolean isChecked();

    void open();

    boolean isOpened();

    boolean hasLandMineCount();

}
