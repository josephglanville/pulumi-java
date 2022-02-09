// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.inputs.HttpRequestResponse;
import io.pulumi.azurenative.scheduler.inputs.JobErrorActionResponse;
import io.pulumi.azurenative.scheduler.inputs.RetryPolicyResponse;
import io.pulumi.azurenative.scheduler.inputs.ServiceBusQueueMessageResponse;
import io.pulumi.azurenative.scheduler.inputs.ServiceBusTopicMessageResponse;
import io.pulumi.azurenative.scheduler.inputs.StorageQueueMessageResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobActionResponse Empty = new JobActionResponse();

    @InputImport(name="errorAction")
    private final @Nullable JobErrorActionResponse errorAction;

    public Optional<JobErrorActionResponse> getErrorAction() {
        return this.errorAction == null ? Optional.empty() : Optional.ofNullable(this.errorAction);
    }

    @InputImport(name="queueMessage")
    private final @Nullable StorageQueueMessageResponse queueMessage;

    public Optional<StorageQueueMessageResponse> getQueueMessage() {
        return this.queueMessage == null ? Optional.empty() : Optional.ofNullable(this.queueMessage);
    }

    @InputImport(name="request")
    private final @Nullable HttpRequestResponse request;

    public Optional<HttpRequestResponse> getRequest() {
        return this.request == null ? Optional.empty() : Optional.ofNullable(this.request);
    }

    @InputImport(name="retryPolicy")
    private final @Nullable RetryPolicyResponse retryPolicy;

    public Optional<RetryPolicyResponse> getRetryPolicy() {
        return this.retryPolicy == null ? Optional.empty() : Optional.ofNullable(this.retryPolicy);
    }

    @InputImport(name="serviceBusQueueMessage")
    private final @Nullable ServiceBusQueueMessageResponse serviceBusQueueMessage;

    public Optional<ServiceBusQueueMessageResponse> getServiceBusQueueMessage() {
        return this.serviceBusQueueMessage == null ? Optional.empty() : Optional.ofNullable(this.serviceBusQueueMessage);
    }

    @InputImport(name="serviceBusTopicMessage")
    private final @Nullable ServiceBusTopicMessageResponse serviceBusTopicMessage;

    public Optional<ServiceBusTopicMessageResponse> getServiceBusTopicMessage() {
        return this.serviceBusTopicMessage == null ? Optional.empty() : Optional.ofNullable(this.serviceBusTopicMessage);
    }

    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public JobActionResponse(
        @Nullable JobErrorActionResponse errorAction,
        @Nullable StorageQueueMessageResponse queueMessage,
        @Nullable HttpRequestResponse request,
        @Nullable RetryPolicyResponse retryPolicy,
        @Nullable ServiceBusQueueMessageResponse serviceBusQueueMessage,
        @Nullable ServiceBusTopicMessageResponse serviceBusTopicMessage,
        @Nullable String type) {
        this.errorAction = errorAction;
        this.queueMessage = queueMessage;
        this.request = request;
        this.retryPolicy = retryPolicy;
        this.serviceBusQueueMessage = serviceBusQueueMessage;
        this.serviceBusTopicMessage = serviceBusTopicMessage;
        this.type = type;
    }

    private JobActionResponse() {
        this.errorAction = null;
        this.queueMessage = null;
        this.request = null;
        this.retryPolicy = null;
        this.serviceBusQueueMessage = null;
        this.serviceBusTopicMessage = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobErrorActionResponse errorAction;
        private @Nullable StorageQueueMessageResponse queueMessage;
        private @Nullable HttpRequestResponse request;
        private @Nullable RetryPolicyResponse retryPolicy;
        private @Nullable ServiceBusQueueMessageResponse serviceBusQueueMessage;
        private @Nullable ServiceBusTopicMessageResponse serviceBusTopicMessage;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorAction = defaults.errorAction;
    	      this.queueMessage = defaults.queueMessage;
    	      this.request = defaults.request;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.serviceBusQueueMessage = defaults.serviceBusQueueMessage;
    	      this.serviceBusTopicMessage = defaults.serviceBusTopicMessage;
    	      this.type = defaults.type;
        }

        public Builder setErrorAction(@Nullable JobErrorActionResponse errorAction) {
            this.errorAction = errorAction;
            return this;
        }

        public Builder setQueueMessage(@Nullable StorageQueueMessageResponse queueMessage) {
            this.queueMessage = queueMessage;
            return this;
        }

        public Builder setRequest(@Nullable HttpRequestResponse request) {
            this.request = request;
            return this;
        }

        public Builder setRetryPolicy(@Nullable RetryPolicyResponse retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder setServiceBusQueueMessage(@Nullable ServiceBusQueueMessageResponse serviceBusQueueMessage) {
            this.serviceBusQueueMessage = serviceBusQueueMessage;
            return this;
        }

        public Builder setServiceBusTopicMessage(@Nullable ServiceBusTopicMessageResponse serviceBusTopicMessage) {
            this.serviceBusTopicMessage = serviceBusTopicMessage;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public JobActionResponse build() {
            return new JobActionResponse(errorAction, queueMessage, request, retryPolicy, serviceBusQueueMessage, serviceBusTopicMessage, type);
        }
    }
}
