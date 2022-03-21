// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.LiveEventEndpointArgs;
import io.pulumi.azurenative.media.inputs.LiveEventPreviewAccessControlArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Live event preview settings.
 * 
 */
public final class LiveEventPreviewArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiveEventPreviewArgs Empty = new LiveEventPreviewArgs();

    /**
     * The access control for live event preview.
     * 
     */
    @Import(name="accessControl")
      private final @Nullable Output<LiveEventPreviewAccessControlArgs> accessControl;

    public Output<LiveEventPreviewAccessControlArgs> getAccessControl() {
        return this.accessControl == null ? Output.empty() : this.accessControl;
    }

    /**
     * An alternative media identifier associated with the streaming locator created for the preview. This value is specified at creation time and cannot be updated. The identifier can be used in the CustomLicenseAcquisitionUrlTemplate or the CustomKeyAcquisitionUrlTemplate of the StreamingPolicy specified in the StreamingPolicyName field.
     * 
     */
    @Import(name="alternativeMediaId")
      private final @Nullable Output<String> alternativeMediaId;

    public Output<String> getAlternativeMediaId() {
        return this.alternativeMediaId == null ? Output.empty() : this.alternativeMediaId;
    }

    /**
     * The endpoints for preview. Do not share the preview URL with the live event audience.
     * 
     */
    @Import(name="endpoints")
      private final @Nullable Output<List<LiveEventEndpointArgs>> endpoints;

    public Output<List<LiveEventEndpointArgs>> getEndpoints() {
        return this.endpoints == null ? Output.empty() : this.endpoints;
    }

    /**
     * The identifier of the preview locator in Guid format. Specifying this at creation time allows the caller to know the preview locator url before the event is created. If omitted, the service will generate a random identifier. This value cannot be updated once the live event is created.
     * 
     */
    @Import(name="previewLocator")
      private final @Nullable Output<String> previewLocator;

    public Output<String> getPreviewLocator() {
        return this.previewLocator == null ? Output.empty() : this.previewLocator;
    }

    /**
     * The name of streaming policy used for the live event preview. This value is specified at creation time and cannot be updated.
     * 
     */
    @Import(name="streamingPolicyName")
      private final @Nullable Output<String> streamingPolicyName;

    public Output<String> getStreamingPolicyName() {
        return this.streamingPolicyName == null ? Output.empty() : this.streamingPolicyName;
    }

    public LiveEventPreviewArgs(
        @Nullable Output<LiveEventPreviewAccessControlArgs> accessControl,
        @Nullable Output<String> alternativeMediaId,
        @Nullable Output<List<LiveEventEndpointArgs>> endpoints,
        @Nullable Output<String> previewLocator,
        @Nullable Output<String> streamingPolicyName) {
        this.accessControl = accessControl;
        this.alternativeMediaId = alternativeMediaId;
        this.endpoints = endpoints;
        this.previewLocator = previewLocator;
        this.streamingPolicyName = streamingPolicyName;
    }

    private LiveEventPreviewArgs() {
        this.accessControl = Output.empty();
        this.alternativeMediaId = Output.empty();
        this.endpoints = Output.empty();
        this.previewLocator = Output.empty();
        this.streamingPolicyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventPreviewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LiveEventPreviewAccessControlArgs> accessControl;
        private @Nullable Output<String> alternativeMediaId;
        private @Nullable Output<List<LiveEventEndpointArgs>> endpoints;
        private @Nullable Output<String> previewLocator;
        private @Nullable Output<String> streamingPolicyName;

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

        public Builder accessControl(@Nullable Output<LiveEventPreviewAccessControlArgs> accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public Builder accessControl(@Nullable LiveEventPreviewAccessControlArgs accessControl) {
            this.accessControl = Output.ofNullable(accessControl);
            return this;
        }
        public Builder alternativeMediaId(@Nullable Output<String> alternativeMediaId) {
            this.alternativeMediaId = alternativeMediaId;
            return this;
        }
        public Builder alternativeMediaId(@Nullable String alternativeMediaId) {
            this.alternativeMediaId = Output.ofNullable(alternativeMediaId);
            return this;
        }
        public Builder endpoints(@Nullable Output<List<LiveEventEndpointArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(@Nullable List<LiveEventEndpointArgs> endpoints) {
            this.endpoints = Output.ofNullable(endpoints);
            return this;
        }
        public Builder endpoints(LiveEventEndpointArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder previewLocator(@Nullable Output<String> previewLocator) {
            this.previewLocator = previewLocator;
            return this;
        }
        public Builder previewLocator(@Nullable String previewLocator) {
            this.previewLocator = Output.ofNullable(previewLocator);
            return this;
        }
        public Builder streamingPolicyName(@Nullable Output<String> streamingPolicyName) {
            this.streamingPolicyName = streamingPolicyName;
            return this;
        }
        public Builder streamingPolicyName(@Nullable String streamingPolicyName) {
            this.streamingPolicyName = Output.ofNullable(streamingPolicyName);
            return this;
        }        public LiveEventPreviewArgs build() {
            return new LiveEventPreviewArgs(accessControl, alternativeMediaId, endpoints, previewLocator, streamingPolicyName);
        }
    }
}
