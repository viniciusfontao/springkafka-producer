package br.com.springkafkaproducer.domain.mapper;

import br.com.springkafkaproducer.PeopleAvro;
import br.com.springkafkaproducer.adapter.dto.PeopleProducerDTO;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class PeopleAvroMapper {
    
    public PeopleAvro toAvro(PeopleProducerDTO peopleProducerDTO) {
        return PeopleAvro.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setName(peopleProducerDTO.getName())
                .setCpf(peopleProducerDTO.getCpf())
                .setBooks(peopleProducerDTO.getBooks().stream().map(p -> (CharSequence) p).collect(Collectors.toList()))
                .build();
    }
}
