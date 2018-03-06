package br.com.wasalexandreapi.games.controller

import br.com.wasalexandreapi.games.model.Game
import br.com.wasalexandreapi.games.service.GameServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(value = "/game")
class GameController {

    @Autowired
    lateinit var gameService: GameServices

    @GetMapping
    fun buscarTodos() : List<Game>{
        return gameService.buscarTodos()
    }

    @PostMapping
    fun salvar(@RequestBody game: Game) {
        gameService.salvar(game)
    }

    @GetMapping(value = "titulo/{titulo}")
    fun buscaPor(@PathVariable(value = "titulo") titulo: String ) : List<Game> {
        return gameService.buscarPor(nome = titulo)
    }

    @DeleteMapping( "/{id}")
    fun apagar(@PathVariable(value = "id") id : String) {
        gameService.deletar(id)
    }
}