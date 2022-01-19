package br.com.springkafkaproducer.adapter.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CarProducerDTO {

    private String name;
    private String brand;

}
