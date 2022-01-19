package br.com.springkafkaproducer.domain.mapper;

import br.com.springkafkaproducer.CarAvro;
import br.com.springkafkaproducer.adapter.dto.CarProducerDTO;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CarAvroMapper {

    public CarAvro toAvro(CarProducerDTO carProducerDTO) {
        return CarAvro.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setName(carProducerDTO.getName())
                .setBrand(carProducerDTO.getBrand())
                .build();
    }
}
