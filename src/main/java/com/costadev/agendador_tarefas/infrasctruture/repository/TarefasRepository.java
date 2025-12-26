package com.costadev.agendador_tarefas.infrasctruture.repository;

import com.costadev.agendador_tarefas.infrasctruture.entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends MongoRepository <TarefasEntity, String> {
}
