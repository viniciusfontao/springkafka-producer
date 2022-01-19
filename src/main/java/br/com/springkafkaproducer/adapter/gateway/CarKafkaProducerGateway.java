package br.com.springkafkaproducer.adapter.gateway;

import br.com.springkafkaproducer.CarAvro;
import br.com.springkafkaproducer.adapter.dto.CarProducerDTO;
import br.com.springkafkaproducer.domain.mapper.CarAvroMapper;
import br.com.springkafkaproducer.domain.usecase.port.CarProducerPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CarKafkaProducerGateway implements CarProducerPort {

    private final String topicName;
    private final KafkaTemplate<String, CarAvro> kafkaTemplate;
    private final CarAvroMapper carAvroMapper;

    public CarKafkaProducerGateway(@Value("${topic.name}") String topicName,
                                   KafkaTemplate<String, CarAvro> kafkaTemplate,
                                   CarAvroMapper carAvroMapper
    ) {
        this.topicName = topicName;
        this.kafkaTemplate = kafkaTemplate;
        this.carAvroMapper = carAvroMapper;
    }

    @Override
    public void publish(CarProducerDTO carProducerDTO) {
        var carAvro = carAvroMapper.toAvro(carProducerDTO);
        kafkaTemplate.send(topicName, carAvro).addCallback(
                success -> log.info("Message sent successfully!"),
                failure -> log.error("Error while sending the message!")
        );
    }
}
