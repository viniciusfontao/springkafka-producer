package br.com.springkafkaproducer.adapter.gateway;

import br.com.springkafkaproducer.PeopleAvro;
import br.com.springkafkaproducer.domain.mapper.PeopleAvroMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.kafka.core.KafkaTemplate;

@ExtendWith(MockitoExtension.class)
public class PeopleKafkaProducerGatewayTest {

    private PeopleKafkaProducerGateway peopleKafkaProducerGateway;

    @Mock
    private KafkaTemplate<String, PeopleAvro> kafkaTemplate;

    @Mock
    private PeopleAvroMapper peopleAvroMapper;

    @BeforeEach
    void init() {
        String TOPIC_NAME = "TOPIC_NAME";
        peopleKafkaProducerGateway = new PeopleKafkaProducerGateway(TOPIC_NAME, kafkaTemplate, peopleAvroMapper);
    }

}
