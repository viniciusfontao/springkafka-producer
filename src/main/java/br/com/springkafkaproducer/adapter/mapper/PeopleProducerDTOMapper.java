package br.com.springkafkaproducer.adapter.mapper;

import br.com.springkafkaproducer.adapter.dto.PeopleProducerDTO;
import br.com.springkafkaproducer.adapter.dto.PeopleRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class PeopleProducerDTOMapper {

    public PeopleProducerDTO toDTO(PeopleRequestDTO peopleRequestDTO) {
        return PeopleProducerDTO.builder()
                .name(peopleRequestDTO.getName())
                .cpf(peopleRequestDTO.getCpf())
                .books(peopleRequestDTO.getBooks())
                .build();
    }
}
