package br.com.springkafkaproducer.adapter.gateway;

import br.com.springkafkaproducer.PeopleAvro;
import br.com.springkafkaproducer.adapter.dto.PeopleProducerDTO;
import br.com.springkafkaproducer.domain.mapper.PeopleAvroMapper;
import br.com.springkafkaproducer.domain.usecase.port.PeopleProducerPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PeopleKafkaProducerGateway implements PeopleProducerPort {

    private final String topicName;
    private final KafkaTemplate<String, PeopleAvro> kafkaTemplate;
    private final PeopleAvroMapper peopleAvroMapper;

    public PeopleKafkaProducerGateway(@Value("${topic.name}") String topicName,
                                      KafkaTemplate<String, PeopleAvro> kafkaTemplate,
                                      PeopleAvroMapper peopleAvroMapper
    ) {
        this.topicName = topicName;
        this.kafkaTemplate = kafkaTemplate;
        this.peopleAvroMapper = peopleAvroMapper;
    }

    @Override
    public void publish(PeopleProducerDTO peopleProducerDTO) {
        var peopleAvro = peopleAvroMapper.toAvro(peopleProducerDTO);
        kafkaTemplate.send(topicName, peopleAvro).addCallback(
                success -> log.info("Message sent successfully!"),
                failure -> log.error("Error while sending the message!")
        );
    }
}
