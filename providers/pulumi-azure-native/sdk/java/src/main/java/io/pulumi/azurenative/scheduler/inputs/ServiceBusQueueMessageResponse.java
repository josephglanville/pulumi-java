// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.inputs.ServiceBusAuthenticationResponse;
import io.pulumi.azurenative.scheduler.inputs.ServiceBusBrokeredMessagePropertiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceBusQueueMessageResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceBusQueueMessageResponse Empty = new ServiceBusQueueMessageResponse();

    @InputImport(name="authentication")
    private final @Nullable ServiceBusAuthenticationResponse authentication;

    public Optional<ServiceBusAuthenticationResponse> getAuthentication() {
        return this.authentication == null ? Optional.empty() : Optional.ofNullable(this.authentication);
    }

    @InputImport(name="brokeredMessageProperties")
    private final @Nullable ServiceBusBrokeredMessagePropertiesResponse brokeredMessageProperties;

    public Optional<ServiceBusBrokeredMessagePropertiesResponse> getBrokeredMessageProperties() {
        return this.brokeredMessageProperties == null ? Optional.empty() : Optional.ofNullable(this.brokeredMessageProperties);
    }

    @InputImport(name="customMessageProperties")
    private final @Nullable Map<String,String> customMessageProperties;

    public Map<String,String> getCustomMessageProperties() {
        return this.customMessageProperties == null ? Map.of() : this.customMessageProperties;
    }

    @InputImport(name="message")
    private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    @InputImport(name="namespace")
    private final @Nullable String namespace;

    public Optional<String> getNamespace() {
        return this.namespace == null ? Optional.empty() : Optional.ofNullable(this.namespace);
    }

    @InputImport(name="queueName")
    private final @Nullable String queueName;

    public Optional<String> getQueueName() {
        return this.queueName == null ? Optional.empty() : Optional.ofNullable(this.queueName);
    }

    @InputImport(name="transportType")
    private final @Nullable String transportType;

    public Optional<String> getTransportType() {
        return this.transportType == null ? Optional.empty() : Optional.ofNullable(this.transportType);
    }

    public ServiceBusQueueMessageResponse(
        @Nullable ServiceBusAuthenticationResponse authentication,
        @Nullable ServiceBusBrokeredMessagePropertiesResponse brokeredMessageProperties,
        @Nullable Map<String,String> customMessageProperties,
        @Nullable String message,
        @Nullable String namespace,
        @Nullable String queueName,
        @Nullable String transportType) {
        this.authentication = authentication;
        this.brokeredMessageProperties = brokeredMessageProperties;
        this.customMessageProperties = customMessageProperties;
        this.message = message;
        this.namespace = namespace;
        this.queueName = queueName;
        this.transportType = transportType;
    }

    private ServiceBusQueueMessageResponse() {
        this.authentication = null;
        this.brokeredMessageProperties = null;
        this.customMessageProperties = Map.of();
        this.message = null;
        this.namespace = null;
        this.queueName = null;
        this.transportType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusQueueMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceBusAuthenticationResponse authentication;
        private @Nullable ServiceBusBrokeredMessagePropertiesResponse brokeredMessageProperties;
        private @Nullable Map<String,String> customMessageProperties;
        private @Nullable String message;
        private @Nullable String namespace;
        private @Nullable String queueName;
        private @Nullable String transportType;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusQueueMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.brokeredMessageProperties = defaults.brokeredMessageProperties;
    	      this.customMessageProperties = defaults.customMessageProperties;
    	      this.message = defaults.message;
    	      this.namespace = defaults.namespace;
    	      this.queueName = defaults.queueName;
    	      this.transportType = defaults.transportType;
        }

        public Builder setAuthentication(@Nullable ServiceBusAuthenticationResponse authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setBrokeredMessageProperties(@Nullable ServiceBusBrokeredMessagePropertiesResponse brokeredMessageProperties) {
            this.brokeredMessageProperties = brokeredMessageProperties;
            return this;
        }

        public Builder setCustomMessageProperties(@Nullable Map<String,String> customMessageProperties) {
            this.customMessageProperties = customMessageProperties;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setQueueName(@Nullable String queueName) {
            this.queueName = queueName;
            return this;
        }

        public Builder setTransportType(@Nullable String transportType) {
            this.transportType = transportType;
            return this;
        }

        public ServiceBusQueueMessageResponse build() {
            return new ServiceBusQueueMessageResponse(authentication, brokeredMessageProperties, customMessageProperties, message, namespace, queueName, transportType);
        }
    }
}
