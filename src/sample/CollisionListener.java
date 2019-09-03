package sample;

public class CollisionListener {

    private GameManager gameManager;

    public CollisionListener( GameManager gameManager) {
        this.gameManager = gameManager;
    }

    public void cookieCollision(boolean hidden, int cookie, boolean endgame, boolean score) {
        if(hidden) {
            this.hidden();

        } else if (cookie >= 0) {
            this.gameManager.hideCookie(cookie);
        }
        if (endgame) {
            this.gameManager.endGame();
        }
        if (score) {
            this.gameManager.setScoreBoard();
        }

    }

    public void ghostCollision(){
        this.gameManager.lifeLost();
    }


    private void hidden(){
        this.gameManager.setScore();
        this.gameManager.cookiesEaten();
    }

}
