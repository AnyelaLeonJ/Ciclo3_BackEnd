package com.usa.edu.co.ciclo3.repository;

import java.util.List;
import java.util.Optional;
import com.usa.edu.co.ciclo3.model.Client;
import com.usa.edu.co.ciclo3.repository.crud.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepository {

    @Autowired
    private ClientCrudRepository CrudRepository;
    public List<Client> getAll() {return (List<Client>) CrudRepository.findAll();}
    public Optional<Client> getClient(int id) {return CrudRepository.findById(id);}
    public Client save (Client client){return CrudRepository.save(client);}
    public void delete(Client client){CrudRepository.delete(client);}
}

