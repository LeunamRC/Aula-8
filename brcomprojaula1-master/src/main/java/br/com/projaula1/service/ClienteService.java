package br.com.projaula1.service;


import br.com.projaula1.model.Cliente;

import br.com.projaula1.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findByid(int id){
        return clienteRepository.findById(id);
    }

    public void delete(int id){
        clienteRepository.deleteById(id);
    }
}
