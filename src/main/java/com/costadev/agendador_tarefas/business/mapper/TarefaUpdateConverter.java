package com.costadev.agendador_tarefas.business.mapper;

import com.costadev.agendador_tarefas.business.dto.TarefasDTO;
import com.costadev.agendador_tarefas.infrasctruture.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefaUpdateConverter {
    void updateTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity);
}
