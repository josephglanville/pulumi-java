// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.secretmanager_v1.outputs.ReplicationResponse;
import io.pulumi.googlenative.secretmanager_v1.outputs.RotationResponse;
import io.pulumi.googlenative.secretmanager_v1.outputs.TopicResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetSecretResult {
    private final String createTime;
    private final String etag;
    private final String expireTime;
    private final Map<String,String> labels;
    private final String name;
    private final ReplicationResponse replication;
    private final RotationResponse rotation;
    private final List<TopicResponse> topics;
    private final String ttl;

    @OutputCustomType.Constructor({"createTime","etag","expireTime","labels","name","replication","rotation","topics","ttl"})
    private GetSecretResult(
        String createTime,
        String etag,
        String expireTime,
        Map<String,String> labels,
        String name,
        ReplicationResponse replication,
        RotationResponse rotation,
        List<TopicResponse> topics,
        String ttl) {
        this.createTime = Objects.requireNonNull(createTime);
        this.etag = Objects.requireNonNull(etag);
        this.expireTime = Objects.requireNonNull(expireTime);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.replication = Objects.requireNonNull(replication);
        this.rotation = Objects.requireNonNull(rotation);
        this.topics = Objects.requireNonNull(topics);
        this.ttl = Objects.requireNonNull(ttl);
    }

    public String getCreateTime() {
        return this.createTime;
    }
    public String getEtag() {
        return this.etag;
    }
    public String getExpireTime() {
        return this.expireTime;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getName() {
        return this.name;
    }
    public ReplicationResponse getReplication() {
        return this.replication;
    }
    public RotationResponse getRotation() {
        return this.rotation;
    }
    public List<TopicResponse> getTopics() {
        return this.topics;
    }
    public String getTtl() {
        return this.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String etag;
        private String expireTime;
        private Map<String,String> labels;
        private String name;
        private ReplicationResponse replication;
        private RotationResponse rotation;
        private List<TopicResponse> topics;
        private String ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.etag = defaults.etag;
    	      this.expireTime = defaults.expireTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.replication = defaults.replication;
    	      this.rotation = defaults.rotation;
    	      this.topics = defaults.topics;
    	      this.ttl = defaults.ttl;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExpireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReplication(ReplicationResponse replication) {
            this.replication = Objects.requireNonNull(replication);
            return this;
        }

        public Builder setRotation(RotationResponse rotation) {
            this.rotation = Objects.requireNonNull(rotation);
            return this;
        }

        public Builder setTopics(List<TopicResponse> topics) {
            this.topics = Objects.requireNonNull(topics);
            return this;
        }

        public Builder setTtl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }

        public GetSecretResult build() {
            return new GetSecretResult(createTime, etag, expireTime, labels, name, replication, rotation, topics, ttl);
        }
    }
}