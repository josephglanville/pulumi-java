// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.LiveEventEndpointArgs;
import io.pulumi.azurenative.media.inputs.LiveEventPreviewAccessControlArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiveEventPreviewArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiveEventPreviewArgs Empty = new LiveEventPreviewArgs();

    @InputImport(name="accessControl")
    private final @Nullable Input<LiveEventPreviewAccessControlArgs> accessControl;

    public Input<LiveEventPreviewAccessControlArgs> getAccessControl() {
        return this.accessControl == null ? Input.empty() : this.accessControl;
    }

    @InputImport(name="alternativeMediaId")
    private final @Nullable Input<String> alternativeMediaId;

    public Input<String> getAlternativeMediaId() {
        return this.alternativeMediaId == null ? Input.empty() : this.alternativeMediaId;
    }

    @InputImport(name="endpoints")
    private final @Nullable Input<List<LiveEventEndpointArgs>> endpoints;

    public Input<List<LiveEventEndpointArgs>> getEndpoints() {
        return this.endpoints == null ? Input.empty() : this.endpoints;
    }

    @InputImport(name="previewLocator")
    private final @Nullable Input<String> previewLocator;

    public Input<String> getPreviewLocator() {
        return this.previewLocator == null ? Input.empty() : this.previewLocator;
    }

    @InputImport(name="streamingPolicyName")
    private final @Nullable Input<String> streamingPolicyName;

    public Input<String> getStreamingPolicyName() {
        return this.streamingPolicyName == null ? Input.empty() : this.streamingPolicyName;
    }

    public LiveEventPreviewArgs(
        @Nullable Input<LiveEventPreviewAccessControlArgs> accessControl,
        @Nullable Input<String> alternativeMediaId,
        @Nullable Input<List<LiveEventEndpointArgs>> endpoints,
        @Nullable Input<String> previewLocator,
        @Nullable Input<String> streamingPolicyName) {
        this.accessControl = accessControl;
        this.alternativeMediaId = alternativeMediaId;
        this.endpoints = endpoints;
        this.previewLocator = previewLocator;
        this.streamingPolicyName = streamingPolicyName;
    }

    private LiveEventPreviewArgs() {
        this.accessControl = Input.empty();
        this.alternativeMediaId = Input.empty();
        this.endpoints = Input.empty();
        this.previewLocator = Input.empty();
        this.streamingPolicyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventPreviewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LiveEventPreviewAccessControlArgs> accessControl;
        private @Nullable Input<String> alternativeMediaId;
        private @Nullable Input<List<LiveEventEndpointArgs>> endpoints;
        private @Nullable Input<String> previewLocator;
        private @Nullable Input<String> streamingPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventPreviewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControl = defaults.accessControl;
    	      this.alternativeMediaId = defaults.alternativeMediaId;
    	      this.endpoints = defaults.endpoints;
    	      this.previewLocator = defaults.previewLocator;
    	      this.streamingPolicyName = defaults.streamingPolicyName;
        }

        public Builder setAccessControl(@Nullable Input<LiveEventPreviewAccessControlArgs> accessControl) {
            this.accessControl = accessControl;
            return this;
        }

        public Builder setAccessControl(@Nullable LiveEventPreviewAccessControlArgs accessControl) {
            this.accessControl = Input.ofNullable(accessControl);
            return this;
        }

        public Builder setAlternativeMediaId(@Nullable Input<String> alternativeMediaId) {
            this.alternativeMediaId = alternativeMediaId;
            return this;
        }

        public Builder setAlternativeMediaId(@Nullable String alternativeMediaId) {
            this.alternativeMediaId = Input.ofNullable(alternativeMediaId);
            return this;
        }

        public Builder setEndpoints(@Nullable Input<List<LiveEventEndpointArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setEndpoints(@Nullable List<LiveEventEndpointArgs> endpoints) {
            this.endpoints = Input.ofNullable(endpoints);
            return this;
        }

        public Builder setPreviewLocator(@Nullable Input<String> previewLocator) {
            this.previewLocator = previewLocator;
            return this;
        }

        public Builder setPreviewLocator(@Nullable String previewLocator) {
            this.previewLocator = Input.ofNullable(previewLocator);
            return this;
        }

        public Builder setStreamingPolicyName(@Nullable Input<String> streamingPolicyName) {
            this.streamingPolicyName = streamingPolicyName;
            return this;
        }

        public Builder setStreamingPolicyName(@Nullable String streamingPolicyName) {
            this.streamingPolicyName = Input.ofNullable(streamingPolicyName);
            return this;
        }

        public LiveEventPreviewArgs build() {
            return new LiveEventPreviewArgs(accessControl, alternativeMediaId, endpoints, previewLocator, streamingPolicyName);
        }
    }
}
