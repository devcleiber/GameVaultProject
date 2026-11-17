package library;

import domain.GamesData;
import java.util.ArrayList;

public class GameLibrary {
    private ArrayList<GamesData> games;

    public GameLibrary() {
        this.games = new ArrayList<>();
    }

    public void AddednewGame(GamesData game) {
        this.games.add(game);
    }

    public GamesData searchGameById(int id) {
        for (GamesData game : games) {
            if (game.getId() == id) {
                return game;
            }
        }
        return null; // Return null if the game is not found
    }

    public ArrayList<GamesData> getAllGames() {
        return games;
    }

    public void getList() {
        for (GamesData game : games) {
            System.out
                    .println("ID: " + game.getId() + ", Name: " + game.getName() + ", Platform: " + game.getPlatform() +
                            ", Genre: " + game.getGenre() + ", Launch Year: " + game.getLancamentYear() +
                            ", Personal Score: " + game.getPessoalScore() + ", Status: " + game.getStatus());
        }
    }
}
