// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceBusQueueOutputDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceBusQueueOutputDataSourceArgs Empty = new ServiceBusQueueOutputDataSourceArgs();

    @InputImport(name="propertyColumns")
    private final @Nullable Input<List<String>> propertyColumns;

    public Input<List<String>> getPropertyColumns() {
        return this.propertyColumns == null ? Input.empty() : this.propertyColumns;
    }

    @InputImport(name="queueName")
    private final @Nullable Input<String> queueName;

    public Input<String> getQueueName() {
        return this.queueName == null ? Input.empty() : this.queueName;
    }

    @InputImport(name="serviceBusNamespace")
    private final @Nullable Input<String> serviceBusNamespace;

    public Input<String> getServiceBusNamespace() {
        return this.serviceBusNamespace == null ? Input.empty() : this.serviceBusNamespace;
    }

    @InputImport(name="sharedAccessPolicyKey")
    private final @Nullable Input<String> sharedAccessPolicyKey;

    public Input<String> getSharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey == null ? Input.empty() : this.sharedAccessPolicyKey;
    }

    @InputImport(name="sharedAccessPolicyName")
    private final @Nullable Input<String> sharedAccessPolicyName;

    public Input<String> getSharedAccessPolicyName() {
        return this.sharedAccessPolicyName == null ? Input.empty() : this.sharedAccessPolicyName;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ServiceBusQueueOutputDataSourceArgs(
        @Nullable Input<List<String>> propertyColumns,
        @Nullable Input<String> queueName,
        @Nullable Input<String> serviceBusNamespace,
        @Nullable Input<String> sharedAccessPolicyKey,
        @Nullable Input<String> sharedAccessPolicyName,
        Input<String> type) {
        this.propertyColumns = propertyColumns;
        this.queueName = queueName;
        this.serviceBusNamespace = serviceBusNamespace;
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServiceBusQueueOutputDataSourceArgs() {
        this.propertyColumns = Input.empty();
        this.queueName = Input.empty();
        this.serviceBusNamespace = Input.empty();
        this.sharedAccessPolicyKey = Input.empty();
        this.sharedAccessPolicyName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusQueueOutputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> propertyColumns;
        private @Nullable Input<String> queueName;
        private @Nullable Input<String> serviceBusNamespace;
        private @Nullable Input<String> sharedAccessPolicyKey;
        private @Nullable Input<String> sharedAccessPolicyName;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusQueueOutputDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propertyColumns = defaults.propertyColumns;
    	      this.queueName = defaults.queueName;
    	      this.serviceBusNamespace = defaults.serviceBusNamespace;
    	      this.sharedAccessPolicyKey = defaults.sharedAccessPolicyKey;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.type = defaults.type;
        }

        public Builder setPropertyColumns(@Nullable Input<List<String>> propertyColumns) {
            this.propertyColumns = propertyColumns;
            return this;
        }

        public Builder setPropertyColumns(@Nullable List<String> propertyColumns) {
            this.propertyColumns = Input.ofNullable(propertyColumns);
            return this;
        }

        public Builder setQueueName(@Nullable Input<String> queueName) {
            this.queueName = queueName;
            return this;
        }

        public Builder setQueueName(@Nullable String queueName) {
            this.queueName = Input.ofNullable(queueName);
            return this;
        }

        public Builder setServiceBusNamespace(@Nullable Input<String> serviceBusNamespace) {
            this.serviceBusNamespace = serviceBusNamespace;
            return this;
        }

        public Builder setServiceBusNamespace(@Nullable String serviceBusNamespace) {
            this.serviceBusNamespace = Input.ofNullable(serviceBusNamespace);
            return this;
        }

        public Builder setSharedAccessPolicyKey(@Nullable Input<String> sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        public Builder setSharedAccessPolicyKey(@Nullable String sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = Input.ofNullable(sharedAccessPolicyKey);
            return this;
        }

        public Builder setSharedAccessPolicyName(@Nullable Input<String> sharedAccessPolicyName) {
            this.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        public Builder setSharedAccessPolicyName(@Nullable String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = Input.ofNullable(sharedAccessPolicyName);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ServiceBusQueueOutputDataSourceArgs build() {
            return new ServiceBusQueueOutputDataSourceArgs(propertyColumns, queueName, serviceBusNamespace, sharedAccessPolicyKey, sharedAccessPolicyName, type);
        }
    }
}
