// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1alpha1.enums.StreamState;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.BackfillAllStrategyArgs;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.BackfillNoneStrategyArgs;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.DestinationConfigArgs;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.SourceConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamArgs Empty = new StreamArgs();

    @InputImport(name="backfillAll")
    private final @Nullable Input<BackfillAllStrategyArgs> backfillAll;

    public Input<BackfillAllStrategyArgs> getBackfillAll() {
        return this.backfillAll == null ? Input.empty() : this.backfillAll;
    }

    @InputImport(name="backfillNone")
    private final @Nullable Input<BackfillNoneStrategyArgs> backfillNone;

    public Input<BackfillNoneStrategyArgs> getBackfillNone() {
        return this.backfillNone == null ? Input.empty() : this.backfillNone;
    }

    @InputImport(name="customerManagedEncryptionKey")
    private final @Nullable Input<String> customerManagedEncryptionKey;

    public Input<String> getCustomerManagedEncryptionKey() {
        return this.customerManagedEncryptionKey == null ? Input.empty() : this.customerManagedEncryptionKey;
    }

    @InputImport(name="destinationConfig", required=true)
    private final Input<DestinationConfigArgs> destinationConfig;

    public Input<DestinationConfigArgs> getDestinationConfig() {
        return this.destinationConfig;
    }

    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="force")
    private final @Nullable Input<String> force;

    public Input<String> getForce() {
        return this.force == null ? Input.empty() : this.force;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    @InputImport(name="sourceConfig", required=true)
    private final Input<SourceConfigArgs> sourceConfig;

    public Input<SourceConfigArgs> getSourceConfig() {
        return this.sourceConfig;
    }

    @InputImport(name="state")
    private final @Nullable Input<StreamState> state;

    public Input<StreamState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    @InputImport(name="streamId", required=true)
    private final Input<String> streamId;

    public Input<String> getStreamId() {
        return this.streamId;
    }

    @InputImport(name="validateOnly")
    private final @Nullable Input<String> validateOnly;

    public Input<String> getValidateOnly() {
        return this.validateOnly == null ? Input.empty() : this.validateOnly;
    }

    public StreamArgs(
        @Nullable Input<BackfillAllStrategyArgs> backfillAll,
        @Nullable Input<BackfillNoneStrategyArgs> backfillNone,
        @Nullable Input<String> customerManagedEncryptionKey,
        Input<DestinationConfigArgs> destinationConfig,
        Input<String> displayName,
        @Nullable Input<String> force,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        Input<SourceConfigArgs> sourceConfig,
        @Nullable Input<StreamState> state,
        Input<String> streamId,
        @Nullable Input<String> validateOnly) {
        this.backfillAll = backfillAll;
        this.backfillNone = backfillNone;
        this.customerManagedEncryptionKey = customerManagedEncryptionKey;
        this.destinationConfig = Objects.requireNonNull(destinationConfig, "expected parameter 'destinationConfig' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.force = force;
        this.labels = labels;
        this.location = location;
        this.project = project;
        this.requestId = requestId;
        this.sourceConfig = Objects.requireNonNull(sourceConfig, "expected parameter 'sourceConfig' to be non-null");
        this.state = state;
        this.streamId = Objects.requireNonNull(streamId, "expected parameter 'streamId' to be non-null");
        this.validateOnly = validateOnly;
    }

    private StreamArgs() {
        this.backfillAll = Input.empty();
        this.backfillNone = Input.empty();
        this.customerManagedEncryptionKey = Input.empty();
        this.destinationConfig = Input.empty();
        this.displayName = Input.empty();
        this.force = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.sourceConfig = Input.empty();
        this.state = Input.empty();
        this.streamId = Input.empty();
        this.validateOnly = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BackfillAllStrategyArgs> backfillAll;
        private @Nullable Input<BackfillNoneStrategyArgs> backfillNone;
        private @Nullable Input<String> customerManagedEncryptionKey;
        private Input<DestinationConfigArgs> destinationConfig;
        private Input<String> displayName;
        private @Nullable Input<String> force;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private Input<SourceConfigArgs> sourceConfig;
        private @Nullable Input<StreamState> state;
        private Input<String> streamId;
        private @Nullable Input<String> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backfillAll = defaults.backfillAll;
    	      this.backfillNone = defaults.backfillNone;
    	      this.customerManagedEncryptionKey = defaults.customerManagedEncryptionKey;
    	      this.destinationConfig = defaults.destinationConfig;
    	      this.displayName = defaults.displayName;
    	      this.force = defaults.force;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.sourceConfig = defaults.sourceConfig;
    	      this.state = defaults.state;
    	      this.streamId = defaults.streamId;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder setBackfillAll(@Nullable Input<BackfillAllStrategyArgs> backfillAll) {
            this.backfillAll = backfillAll;
            return this;
        }

        public Builder setBackfillAll(@Nullable BackfillAllStrategyArgs backfillAll) {
            this.backfillAll = Input.ofNullable(backfillAll);
            return this;
        }

        public Builder setBackfillNone(@Nullable Input<BackfillNoneStrategyArgs> backfillNone) {
            this.backfillNone = backfillNone;
            return this;
        }

        public Builder setBackfillNone(@Nullable BackfillNoneStrategyArgs backfillNone) {
            this.backfillNone = Input.ofNullable(backfillNone);
            return this;
        }

        public Builder setCustomerManagedEncryptionKey(@Nullable Input<String> customerManagedEncryptionKey) {
            this.customerManagedEncryptionKey = customerManagedEncryptionKey;
            return this;
        }

        public Builder setCustomerManagedEncryptionKey(@Nullable String customerManagedEncryptionKey) {
            this.customerManagedEncryptionKey = Input.ofNullable(customerManagedEncryptionKey);
            return this;
        }

        public Builder setDestinationConfig(Input<DestinationConfigArgs> destinationConfig) {
            this.destinationConfig = Objects.requireNonNull(destinationConfig);
            return this;
        }

        public Builder setDestinationConfig(DestinationConfigArgs destinationConfig) {
            this.destinationConfig = Input.of(Objects.requireNonNull(destinationConfig));
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setForce(@Nullable Input<String> force) {
            this.force = force;
            return this;
        }

        public Builder setForce(@Nullable String force) {
            this.force = Input.ofNullable(force);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setSourceConfig(Input<SourceConfigArgs> sourceConfig) {
            this.sourceConfig = Objects.requireNonNull(sourceConfig);
            return this;
        }

        public Builder setSourceConfig(SourceConfigArgs sourceConfig) {
            this.sourceConfig = Input.of(Objects.requireNonNull(sourceConfig));
            return this;
        }

        public Builder setState(@Nullable Input<StreamState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable StreamState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setStreamId(Input<String> streamId) {
            this.streamId = Objects.requireNonNull(streamId);
            return this;
        }

        public Builder setStreamId(String streamId) {
            this.streamId = Input.of(Objects.requireNonNull(streamId));
            return this;
        }

        public Builder setValidateOnly(@Nullable Input<String> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }

        public Builder setValidateOnly(@Nullable String validateOnly) {
            this.validateOnly = Input.ofNullable(validateOnly);
            return this;
        }

        public StreamArgs build() {
            return new StreamArgs(backfillAll, backfillNone, customerManagedEncryptionKey, destinationConfig, displayName, force, labels, location, project, requestId, sourceConfig, state, streamId, validateOnly);
        }
    }
}