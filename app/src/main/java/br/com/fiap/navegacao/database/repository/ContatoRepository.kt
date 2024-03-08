package br.com.fiap.navegacao.database.repository

import ContatoDb
import android.content.Context
import br.com.fiap.navegacao.model.Contato

class ContatoRepository(context: Context) {
    var db = ContatoDb.getDatabase(context).contatoDao()
    fun salvar(contato:Contato): Long{
        return  db.salvar(contato = contato)
    }
    fun atualizar(contato:Contato): Int{
        return  db.atualizar(contato = contato)
    }

    fun excluir(contato:Contato): Int{
        return  db.excluir(contato = contato)
    }

    fun buscar(id:Long): Contato{
        return  db.buscarContatoPeloID(id = id)
    }

    fun listarTodos(): List<Contato>{
        return  db.listarContatos()
    }

}