package com.arquitetura.camadas.services;

import com.arquitetura.camadas.model.Produto;
import com.arquitetura.camadas.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    
    public Produto salvar(Produto produto){
        return produtoRepository.save(produto);
    }
    
    public List<Produto> buscarTodos(){
        return produtoRepository.findAll();
    }
}
