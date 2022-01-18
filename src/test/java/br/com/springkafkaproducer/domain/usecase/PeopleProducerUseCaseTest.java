package br.com.springkafkaproducer.domain.usecase;

import br.com.springkafkaproducer.domain.usecase.port.PeopleProducerPort;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PeopleProducerUseCaseTest {

    @InjectMocks
    private PeopleProducerUseCase peopleProducerUseCase;

    @Mock
    private PeopleProducerPort peopleProducerPort;
}
