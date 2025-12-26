package com.costadev.agendador_tarefas.business;

import com.costadev.agendador_tarefas.business.dto.TarefasDTO;
import com.costadev.agendador_tarefas.business.mapper.TarefasConverter;
import com.costadev.agendador_tarefas.infrasctruture.entity.TarefasEntity;
import com.costadev.agendador_tarefas.infrasctruture.enums.StatusNotificacaoEnum;
import com.costadev.agendador_tarefas.infrasctruture.repository.TarefasRepository;
import com.costadev.agendador_tarefas.infrasctruture.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefasService {

        private final TarefasRepository tarefasRepository;
        private final TarefasConverter tarefasConverter;
        private final JwtUtil jwtUtil;

        public TarefasDTO gravarTarefas(String token, TarefasDTO dto) {
                String email = jwtUtil.extrairEmailToken(token.substring(7));
                dto.setDataCriacao(LocalDateTime.now());
                dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
                dto.setEmailUsuario(email);

                TarefasEntity entity = tarefasConverter.paraTarefasEntity(dto);
                return tarefasConverter.paraTarefaDTO(tarefasRepository.save(entity));
        }
}
