package com.costadev.agendador_tarefas.business.mapper;

import com.costadev.agendador_tarefas.business.dto.TarefasDTO;
import com.costadev.agendador_tarefas.infrasctruture.entity.TarefasEntity;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

//    @Mapping(source = "id", target = "id")
    TarefasEntity paraTarefasEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);

    List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> dto);

    List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> entity);
}
