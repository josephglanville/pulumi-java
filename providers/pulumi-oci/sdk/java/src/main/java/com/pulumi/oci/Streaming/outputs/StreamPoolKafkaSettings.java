// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Streaming.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamPoolKafkaSettings {
    /**
     * @return (Updatable) Enable auto creation of topic on the server.
     * 
     */
    private final @Nullable Boolean autoCreateTopicsEnable;
    /**
     * @return (Updatable) Bootstrap servers.
     * 
     */
    private final @Nullable String bootstrapServers;
    /**
     * @return (Updatable) The number of hours to keep a log file before deleting it (in hours).
     * 
     */
    private final @Nullable Integer logRetentionHours;
    /**
     * @return (Updatable) The default number of log partitions per topic.
     * 
     */
    private final @Nullable Integer numPartitions;

    @CustomType.Constructor
    private StreamPoolKafkaSettings(
        @CustomType.Parameter("autoCreateTopicsEnable") @Nullable Boolean autoCreateTopicsEnable,
        @CustomType.Parameter("bootstrapServers") @Nullable String bootstrapServers,
        @CustomType.Parameter("logRetentionHours") @Nullable Integer logRetentionHours,
        @CustomType.Parameter("numPartitions") @Nullable Integer numPartitions) {
        this.autoCreateTopicsEnable = autoCreateTopicsEnable;
        this.bootstrapServers = bootstrapServers;
        this.logRetentionHours = logRetentionHours;
        this.numPartitions = numPartitions;
    }

    /**
     * @return (Updatable) Enable auto creation of topic on the server.
     * 
     */
    public Optional<Boolean> autoCreateTopicsEnable() {
        return Optional.ofNullable(this.autoCreateTopicsEnable);
    }
    /**
     * @return (Updatable) Bootstrap servers.
     * 
     */
    public Optional<String> bootstrapServers() {
        return Optional.ofNullable(this.bootstrapServers);
    }
    /**
     * @return (Updatable) The number of hours to keep a log file before deleting it (in hours).
     * 
     */
    public Optional<Integer> logRetentionHours() {
        return Optional.ofNullable(this.logRetentionHours);
    }
    /**
     * @return (Updatable) The default number of log partitions per topic.
     * 
     */
    public Optional<Integer> numPartitions() {
        return Optional.ofNullable(this.numPartitions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamPoolKafkaSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoCreateTopicsEnable;
        private @Nullable String bootstrapServers;
        private @Nullable Integer logRetentionHours;
        private @Nullable Integer numPartitions;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamPoolKafkaSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateTopicsEnable = defaults.autoCreateTopicsEnable;
    	      this.bootstrapServers = defaults.bootstrapServers;
    	      this.logRetentionHours = defaults.logRetentionHours;
    	      this.numPartitions = defaults.numPartitions;
        }

        public Builder autoCreateTopicsEnable(@Nullable Boolean autoCreateTopicsEnable) {
            this.autoCreateTopicsEnable = autoCreateTopicsEnable;
            return this;
        }
        public Builder bootstrapServers(@Nullable String bootstrapServers) {
            this.bootstrapServers = bootstrapServers;
            return this;
        }
        public Builder logRetentionHours(@Nullable Integer logRetentionHours) {
            this.logRetentionHours = logRetentionHours;
            return this;
        }
        public Builder numPartitions(@Nullable Integer numPartitions) {
            this.numPartitions = numPartitions;
            return this;
        }        public StreamPoolKafkaSettings build() {
            return new StreamPoolKafkaSettings(autoCreateTopicsEnable, bootstrapServers, logRetentionHours, numPartitions);
        }
    }
}
