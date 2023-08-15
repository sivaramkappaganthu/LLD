public abstract class Piece {

    private boolean killed;
    private boolean white;

    public boolean isKilled(){
        return killed;
    }

    public boolean isWhite(){
        return white;
    }

    public abstract void canMove();
}
