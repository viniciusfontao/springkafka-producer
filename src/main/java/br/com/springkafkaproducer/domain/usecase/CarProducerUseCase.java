package br.com.springkafkaproducer.domain.usecase;

import br.com.springkafkaproducer.adapter.dto.CarProducerDTO;
import br.com.springkafkaproducer.domain.usecase.port.CarProducerPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CarProducerUseCase {

    private final CarProducerPort carProducerPort;

    public void execute(CarProducerDTO carProducerDTO) {
        carProducerPort.publish(carProducerDTO);
    }
}
