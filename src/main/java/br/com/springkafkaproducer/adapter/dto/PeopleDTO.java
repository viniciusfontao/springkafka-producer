package br.com.springkafkaproducer.adapter.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PeopleDTO {

    private String id;
    private String name;
    private String cpf;

    private List<String> books;
}
