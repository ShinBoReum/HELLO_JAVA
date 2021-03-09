package chapter9.template.gameLevel;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        AdvenceLevel aLevel = new AdvenceLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);
    }
}
