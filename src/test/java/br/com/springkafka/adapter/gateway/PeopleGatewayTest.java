package br.com.springkafka.adapter.gateway;

import br.com.springkafka.adapter.repository.PeopleRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PeopleGatewayTest {

    @InjectMocks
    private PeopleGateway peopleGateway;

    @Mock
    private PeopleRepository peopleRepository;
}
