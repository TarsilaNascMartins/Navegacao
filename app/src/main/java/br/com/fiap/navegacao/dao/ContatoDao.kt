package br.com.fiap.navegacao.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.navegacao.model.Contato
@Dao
interface ContatoDao {
@Insert
    fun salvar(contato: Contato):Long
@Update
    fun atualizar(contato: Contato): Int

@Delete

    fun excluir(contato: Contato):Int

@Query("SELECT * FROM tbl_contato Where id= :id")
    fun buscarContatoPeloID(id:Long):Contato

    @Query("SELECT * FROM TBL_CONTATO ORDER BY nome ASC")
    fun listarContatos():List <Contato>
}