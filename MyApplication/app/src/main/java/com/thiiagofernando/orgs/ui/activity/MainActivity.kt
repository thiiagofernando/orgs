package com.thiiagofernando.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thiiagofernando.orgs.R
import com.thiiagofernando.orgs.model.Produto
import com.thiiagofernando.orgs.ui.recyclerview.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = findViewById<RecyclerView>(R.id.lista)
        lista.adapter = ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(nome = "Sucos", descricao = "Laranja, Acerola", valor = BigDecimal("18.99")),
                Produto(nome = "Salada Frutas", descricao = "Uva, Mamão", valor = BigDecimal("8.99")),
                Produto(nome = "Refrigerantes", descricao = "Coca, Fanta", valor = BigDecimal("1.99")),

            )
        )
    }
}