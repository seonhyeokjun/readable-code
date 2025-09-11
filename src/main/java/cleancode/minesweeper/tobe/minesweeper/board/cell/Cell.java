package cleancode.minesweeper.tobe.minesweeper.board.cell;

public interface Cell {
    boolean isLandMine();

    void flag();

    CellSnapshot getSnapshot();

    boolean isChecked();

    void open();

    boolean isOpened();

    boolean hasLandMineCount();

}
