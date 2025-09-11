package cleancode.minesweeper.tobe.minesweeper.board.cell;

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
    public CellSnapshot getSnapshot() {
        if (cellState.isOpened()) {
            return CellSnapshot.ofNumber(nearByLandMineCount);
        }
        if (cellState.isFlagged()) {
            return CellSnapshot.ofFlag();
        }
        return CellSnapshot.ofUnchecked();
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
