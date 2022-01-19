package br.com.springkafkaproducer.domain.usecase.port;

import br.com.springkafkaproducer.adapter.dto.CarProducerDTO;

public interface CarProducerPort {

    void publish(CarProducerDTO carProducerDTO);
}
