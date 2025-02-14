package com.dzirbel.robopower

import kotlin.random.Random

// TODO move out of runner?
class RandomPlayer(
    playerIndex: Int,
    game: Game,
    private val random: Random = Random.Default,
) : Player(playerIndex, game) {

    override fun discard() = random.nextInt(until = hand.size)

    override fun duel(involvedPlayers: Set<Int>, previousRounds: List<DuelRound>) = random.nextInt(until = hand.size)

    override fun spy() = game.activePlayers.filter { it.index != playerIndex }.random(random).index

    companion object : Factory {
        override fun create(playerIndex: Int, game: Game) = RandomPlayer(playerIndex, game)
    }
}
