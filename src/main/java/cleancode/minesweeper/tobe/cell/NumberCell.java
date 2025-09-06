package cleancode.minesweeper.tobe.cell;

public class NumberCell extends Cell {
    private final int nearByLandMineCount;

    public NumberCell(int newarByLandMineCount) {
        this.nearByLandMineCount = newarByLandMineCount;
    }

    @Override
    public boolean isLandMine() {
        return false;
    }

    @Override
    public boolean hasLandMineCount() {
        return true;
    }

    @Override
    public String getSign() {
        if (isOpened) {
            return String.valueOf(nearByLandMineCount);
        }
        if (isFlagged) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGN;
    }
}
