package org.example.Models;


import java.util.List;
import java.util.ArrayList;

public class Game {
    private Board board;
    private List<Players>players;
    private Gamestatus gamestatus;

    private List<Move>moves;
    private Players Winner;

    public Game(Board board, List<Players> players, Gamestatus gamestatus, List<Move> moves) {
        this.board = board;
        this.players = players;
        this.gamestatus = Gamestatus.IN_PROGRESS;
        this.moves = moves;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Players> getPlayers() {
        return players;
    }

    public void setPlayers(List<Players> players) {
        this.players = players;
    }

    public Gamestatus getGamestatus() {
        return gamestatus;
    }

    public void setGamestatus(Gamestatus gamestatus) {
        this.gamestatus = gamestatus;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Players getWinner() {
        return Winner;
    }

    public void setWinner(Players winner) {
        Winner = winner;
    }
}
