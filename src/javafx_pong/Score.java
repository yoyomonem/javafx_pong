package javafx_pong;

import java.awt.*;
/**
 * The score.
 * @author <a href="mailto:youssef.land@outlook.com">Youssef Nasr</a>
 * @since Pong 2022 (1.1)
 */
public class Score extends Rectangle {
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;
    /**
     * The score.
     * @param GAME_WIDTH The width of the window.
     * @param GAME_HEIGHT The height of the window.
     * @author <a href="mailto:youssef.land@outlook.com">Youssef Nasr</a>
     * @since Pong 2022 (1.1)
     */
    Score(int GAME_WIDTH, int GAME_HEIGHT) {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Segoe UI", Font.BOLD, 60));
        g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);
        g.drawString(String.valueOf(player1 / 10) + String.valueOf(player1 % 10), (GAME_WIDTH / 2) - 85, 50);
        g.drawString(String.valueOf(player2 / 10) + String.valueOf(player2 % 10), (GAME_WIDTH / 2) + 20, 50);
    }
}
