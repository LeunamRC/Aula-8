package br.com.projaula1.service;


import br.com.projaula1.model.Compras;

import br.com.projaula1.repository.ComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComprasService {
    @Autowired
    private ComprasRepository comprasRepository;

    public Compras save(Compras compras){
        return comprasRepository.save(compras);
    }

    public List<Compras> findAll(){
        return comprasRepository.findAll();
    }

    public Optional<Compras> findByid(int id){
        return comprasRepository.findById(id);
    }

    public void delete(int id){
        comprasRepository.deleteById(id);
    }
}
