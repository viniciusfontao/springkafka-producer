package br.com.springkafkaproducer.domain.usecase.port;

import br.com.springkafkaproducer.adapter.dto.PeopleProducerDTO;

public interface PeopleProducerPort {

    void publish(PeopleProducerDTO peopleProducerDTO);
}
