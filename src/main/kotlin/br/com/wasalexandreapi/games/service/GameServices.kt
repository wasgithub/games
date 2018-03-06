package br.com.wasalexandreapi.games.service

import br.com.wasalexandreapi.games.model.Game
import br.com.wasalexandreapi.games.repository.GameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GameServices {

    @Autowired
    lateinit var gameRepository : GameRepository

    fun buscarTodos() : List<Game> {
        return gameRepository.findAll()
    }

    fun salvar(game : Game) {
        gameRepository.save(game)
    }

    fun buscarPor(nome : String) : List<Game> {
        return gameRepository.findByNomeIgnoreCase(nome)
    }

    fun deletar(id: String) {
        this.gameRepository.deleteById(id)
    }

}