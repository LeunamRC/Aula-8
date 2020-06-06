package br.com.projaula1.service;


import br.com.projaula1.model.Fornecedor;

import br.com.projaula1.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor save(Fornecedor fornecedor){
        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> findAll(){
        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> findByid(int id){
        return fornecedorRepository.findById(id);
    }

    public void delete(int id){
        fornecedorRepository.deleteById(id);
    }
}
