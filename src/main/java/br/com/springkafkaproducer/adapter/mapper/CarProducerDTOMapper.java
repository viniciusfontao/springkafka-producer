package br.com.springkafkaproducer.adapter.mapper;

import br.com.springkafkaproducer.adapter.dto.CarProducerDTO;
import br.com.springkafkaproducer.adapter.dto.CarRequestDTO;
import br.com.springkafkaproducer.adapter.dto.PeopleProducerDTO;
import br.com.springkafkaproducer.adapter.dto.PeopleRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class CarProducerDTOMapper {

    public CarProducerDTO toDTO(CarRequestDTO carRequestDTO) {
        return CarProducerDTO.builder()
                .name(carRequestDTO.getName())
                .brand(carRequestDTO.getBrand())
                .build();
    }
}
