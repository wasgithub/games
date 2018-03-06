package br.com.wasalexandreapi.games.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class   Game(@Id val id: String?,
                  var nome: String,
                  var urlImagem: String,
                  var anoLancamento: Integer)