package functions;

import domain.GameStatus;
import domain.GamesData;
import library.GameLibrary;

public class Functions {
    private GameLibrary gameLibrary;

    public Functions(GameLibrary gameLibrary) {
        this.gameLibrary = gameLibrary;
    }

    // A Game Cadaster function
    public void addedgameCadaster(GamesData game) {
        gameLibrary.AddednewGame(game);
    }

    // List of All Games
    public void allGames() {
        gameLibrary.getAllGames();
    }

    // Search a game for Id
    public void searchGameId(int id) {
        gameLibrary.searchGameById(id);
    }

    // Remove Game
    public void removeGame() {

    }

    // Uptade Game
    public void uptadeGame() {

    }

    // Uptade Game Status
    public void uptadeStatus() {

    }

    // Game Status List
    public void statusList() {

    }

    // Library Game List
    public void libraryList() {
        gameLibrary.getList();
    }

}
