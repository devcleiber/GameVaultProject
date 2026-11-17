package domain;
import GameStatus;

public class GamesData {
    private int Id;
    private String Name;
    private String Platform;
    private String Genre;
    private int LancamentYear;
    private double PessoalScore;
    private GameStatus Status;

    public GamesData(int id, String name, String platform, String genre, int lancamentYear, double pessoalScore,
            GameStatus status) {
        Id = id;
        Name = name;
        Platform = platform;
        Genre = genre;
        LancamentYear = lancamentYear;
        PessoalScore = pessoalScore;
        Status = status;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getPlatform() {
        return Platform;
    }

    public String getGenre() {
        return Genre;
    }

    public int getLancamentYear() {
        return LancamentYear;
    }

    public double getPessoalScore() {
        return PessoalScore;
    }

    public gameStatus getStatus() {
        return Status;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPlatform(String platform) {
        Platform = platform;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setLancamentYear(int lancamentYear) {
        LancamentYear = lancamentYear;
    }

    public void setPessoalScore(double pessoalScore) {
        PessoalScore = pessoalScore;
    }

    public void setStatus(gameStatus status) {
        Status = status;
    }

    public String toString() {
        return "gamesData [Id=" + Id + ", Name=" + Name + ", Platform=" + Platform + ", Genre=" + Genre
                + ", LancamentYear=" + LancamentYear + ", PessoalScore=" + PessoalScore + ", Status=" + Status + "]";
    }

}
