package br.com.springkafkaproducer.adapter.controller;

import br.com.springkafkaproducer.adapter.dto.CarRequestDTO;
import br.com.springkafkaproducer.adapter.mapper.CarProducerDTOMapper;
import br.com.springkafkaproducer.domain.usecase.CarProducerUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
@AllArgsConstructor
public class CarController {

    private final CarProducerUseCase carProducerUseCase;

    private final CarProducerDTOMapper carProducerDTOMapper;

    @PostMapping
    public ResponseEntity<Void> sendMessage(@RequestBody CarRequestDTO carDTO) {
        carProducerUseCase.execute(carProducerDTOMapper.toDTO(carDTO));

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
