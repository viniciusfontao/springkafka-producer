package br.com.springkafkaproducer.domain.usecase;

import br.com.springkafkaproducer.adapter.dto.PeopleProducerDTO;
import br.com.springkafkaproducer.domain.usecase.port.PeopleProducerPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PeopleProducerUseCase {

    private final PeopleProducerPort peopleProducerPort;

    public void execute(PeopleProducerDTO peopleProducerDTO) {
        peopleProducerPort.publish(peopleProducerDTO);
    }
}
