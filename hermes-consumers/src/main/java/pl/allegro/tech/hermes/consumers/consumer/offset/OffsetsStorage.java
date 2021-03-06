package pl.allegro.tech.hermes.consumers.consumer.offset;

import pl.allegro.tech.hermes.api.Subscription;
import pl.allegro.tech.hermes.common.kafka.KafkaTopicName;
import pl.allegro.tech.hermes.common.kafka.offset.PartitionOffset;

public interface OffsetsStorage {

    void setSubscriptionOffset(Subscription subscription, PartitionOffset partitionOffset) throws Exception;

    long getSubscriptionOffset(Subscription subscription, KafkaTopicName kafkaTopicName, int partitionId);
}
