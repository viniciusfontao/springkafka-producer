package br.com.springkafka.domain.usecase;

import br.com.springkafka.domain.mapper.PeopleEntityMapper;
import br.com.springkafka.domain.usecase.port.PeoplePort;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PeopleConsumerUseCaseTest {

    @InjectMocks
    private PeopleConsumerUseCase peopleConsumerUseCase;

    @Mock
    private PeoplePort peoplePort;

    @Mock
    private PeopleEntityMapper peopleEntityMapper;
}
