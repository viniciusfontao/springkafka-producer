package br.com.springkafkaproducer.adapter.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CarRequestDTO {

    private String name;
    private String brand;
}
