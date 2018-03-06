package br.com.wasalexandreapi.games.repository

import br.com.wasalexandreapi.games.model.Game
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface GameRepository : MongoRepository<Game, String> {
    fun findByNomeIgnoreCase(nome: String) : List<Game>
}

