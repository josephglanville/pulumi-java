// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.inputs;

import io.pulumi.azurenative.digitaltwins.enums.AuthenticationType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceBusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceBusArgs Empty = new ServiceBusArgs();

    @InputImport(name="authenticationType")
    private final @Nullable Input<Either<String,AuthenticationType>> authenticationType;

    public Input<Either<String,AuthenticationType>> getAuthenticationType() {
        return this.authenticationType == null ? Input.empty() : this.authenticationType;
    }

    @InputImport(name="deadLetterSecret")
    private final @Nullable Input<String> deadLetterSecret;

    public Input<String> getDeadLetterSecret() {
        return this.deadLetterSecret == null ? Input.empty() : this.deadLetterSecret;
    }

    @InputImport(name="deadLetterUri")
    private final @Nullable Input<String> deadLetterUri;

    public Input<String> getDeadLetterUri() {
        return this.deadLetterUri == null ? Input.empty() : this.deadLetterUri;
    }

    @InputImport(name="endpointType", required=true)
    private final Input<String> endpointType;

    public Input<String> getEndpointType() {
        return this.endpointType;
    }

    @InputImport(name="endpointUri")
    private final @Nullable Input<String> endpointUri;

    public Input<String> getEndpointUri() {
        return this.endpointUri == null ? Input.empty() : this.endpointUri;
    }

    @InputImport(name="entityPath")
    private final @Nullable Input<String> entityPath;

    public Input<String> getEntityPath() {
        return this.entityPath == null ? Input.empty() : this.entityPath;
    }

    @InputImport(name="primaryConnectionString")
    private final @Nullable Input<String> primaryConnectionString;

    public Input<String> getPrimaryConnectionString() {
        return this.primaryConnectionString == null ? Input.empty() : this.primaryConnectionString;
    }

    @InputImport(name="secondaryConnectionString")
    private final @Nullable Input<String> secondaryConnectionString;

    public Input<String> getSecondaryConnectionString() {
        return this.secondaryConnectionString == null ? Input.empty() : this.secondaryConnectionString;
    }

    public ServiceBusArgs(
        @Nullable Input<Either<String,AuthenticationType>> authenticationType,
        @Nullable Input<String> deadLetterSecret,
        @Nullable Input<String> deadLetterUri,
        Input<String> endpointType,
        @Nullable Input<String> endpointUri,
        @Nullable Input<String> entityPath,
        @Nullable Input<String> primaryConnectionString,
        @Nullable Input<String> secondaryConnectionString) {
        this.authenticationType = authenticationType;
        this.deadLetterSecret = deadLetterSecret;
        this.deadLetterUri = deadLetterUri;
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.endpointUri = endpointUri;
        this.entityPath = entityPath;
        this.primaryConnectionString = primaryConnectionString;
        this.secondaryConnectionString = secondaryConnectionString;
    }

    private ServiceBusArgs() {
        this.authenticationType = Input.empty();
        this.deadLetterSecret = Input.empty();
        this.deadLetterUri = Input.empty();
        this.endpointType = Input.empty();
        this.endpointUri = Input.empty();
        this.entityPath = Input.empty();
        this.primaryConnectionString = Input.empty();
        this.secondaryConnectionString = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,AuthenticationType>> authenticationType;
        private @Nullable Input<String> deadLetterSecret;
        private @Nullable Input<String> deadLetterUri;
        private Input<String> endpointType;
        private @Nullable Input<String> endpointUri;
        private @Nullable Input<String> entityPath;
        private @Nullable Input<String> primaryConnectionString;
        private @Nullable Input<String> secondaryConnectionString;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.deadLetterSecret = defaults.deadLetterSecret;
    	      this.deadLetterUri = defaults.deadLetterUri;
    	      this.endpointType = defaults.endpointType;
    	      this.endpointUri = defaults.endpointUri;
    	      this.entityPath = defaults.entityPath;
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
        }

        public Builder setAuthenticationType(@Nullable Input<Either<String,AuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAuthenticationType(@Nullable Either<String,AuthenticationType> authenticationType) {
            this.authenticationType = Input.ofNullable(authenticationType);
            return this;
        }

        public Builder setDeadLetterSecret(@Nullable Input<String> deadLetterSecret) {
            this.deadLetterSecret = deadLetterSecret;
            return this;
        }

        public Builder setDeadLetterSecret(@Nullable String deadLetterSecret) {
            this.deadLetterSecret = Input.ofNullable(deadLetterSecret);
            return this;
        }

        public Builder setDeadLetterUri(@Nullable Input<String> deadLetterUri) {
            this.deadLetterUri = deadLetterUri;
            return this;
        }

        public Builder setDeadLetterUri(@Nullable String deadLetterUri) {
            this.deadLetterUri = Input.ofNullable(deadLetterUri);
            return this;
        }

        public Builder setEndpointType(Input<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Input.of(Objects.requireNonNull(endpointType));
            return this;
        }

        public Builder setEndpointUri(@Nullable Input<String> endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }

        public Builder setEndpointUri(@Nullable String endpointUri) {
            this.endpointUri = Input.ofNullable(endpointUri);
            return this;
        }

        public Builder setEntityPath(@Nullable Input<String> entityPath) {
            this.entityPath = entityPath;
            return this;
        }

        public Builder setEntityPath(@Nullable String entityPath) {
            this.entityPath = Input.ofNullable(entityPath);
            return this;
        }

        public Builder setPrimaryConnectionString(@Nullable Input<String> primaryConnectionString) {
            this.primaryConnectionString = primaryConnectionString;
            return this;
        }

        public Builder setPrimaryConnectionString(@Nullable String primaryConnectionString) {
            this.primaryConnectionString = Input.ofNullable(primaryConnectionString);
            return this;
        }

        public Builder setSecondaryConnectionString(@Nullable Input<String> secondaryConnectionString) {
            this.secondaryConnectionString = secondaryConnectionString;
            return this;
        }

        public Builder setSecondaryConnectionString(@Nullable String secondaryConnectionString) {
            this.secondaryConnectionString = Input.ofNullable(secondaryConnectionString);
            return this;
        }

        public ServiceBusArgs build() {
            return new ServiceBusArgs(authenticationType, deadLetterSecret, deadLetterUri, endpointType, endpointUri, entityPath, primaryConnectionString, secondaryConnectionString);
        }
    }
}
