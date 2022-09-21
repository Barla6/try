package com.models

import com.checkers.models.Game

object GamesManager {
    private val games = mutableMapOf<Int, Game>()
    private var serialNumber = 0

    fun saveGame(game: Game): Int {
        val newGameId = serialNumber
        games[newGameId] = game
        serialNumber++
        return newGameId
    }
}