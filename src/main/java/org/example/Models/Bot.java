package org.example.Models;

import org.example.Strategies.PlayingStrategy.
        BotPlayingStrategy;

public class Bot  extends Players{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, Symbol symbol, PlayerType playerType, Long id,
               BotDifficultyLevel difficultyLevel,
               BotPlayingStrategy playingStrategy) {
        super(id, name, symbol, playerType);
        this.botDifficultyLevel = difficultyLevel;
        this.botPlayingStrategy = playingStrategy;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotPlayingStrategy getBotPlayingStrategy() {
        return botPlayingStrategy;
    }

    public void setBotPlayingStrategy(BotPlayingStrategy botPlayingStrategy) {
        this.botPlayingStrategy = botPlayingStrategy;
    }
}
