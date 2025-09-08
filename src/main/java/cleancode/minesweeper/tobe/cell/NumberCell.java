package cleancode.minesweeper.tobe.cell;

public class NumberCell implements Cell {
    private final int nearByLandMineCount;

    private final CellState cellState = CellState.initialize();

    public NumberCell(int newarByLandMineCount) {
        this.nearByLandMineCount = newarByLandMineCount;
    }

    @Override
    public boolean isLandMine() {
        return false;
    }

    @Override
    public void flag() {
        cellState.flag();
    }

    @Override
    public boolean hasLandMineCount() {
        return true;
    }

    @Override
    public String getSign() {
        if (cellState.isOpened()) {
            return String.valueOf(nearByLandMineCount);
        }
        if (cellState.isFlagged()) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGN;
    }

    @Override
    public boolean isChecked() {
        return cellState.isChecked();
    }

    @Override
    public void open() {
        cellState.open();
    }

    @Override
    public boolean isOpened() {
        return cellState.isOpened();
    }
}
