// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise;

import io.pulumi.awsnative.iotsitewise.inputs.GatewayCapabilitySummaryArgs;
import io.pulumi.awsnative.iotsitewise.inputs.GatewayPlatformArgs;
import io.pulumi.awsnative.iotsitewise.inputs.GatewayTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * A list of gateway capability summaries that each contain a namespace and status.
     * 
     */
    @InputImport(name="gatewayCapabilitySummaries")
      private final @Nullable Input<List<GatewayCapabilitySummaryArgs>> gatewayCapabilitySummaries;

    public Input<List<GatewayCapabilitySummaryArgs>> getGatewayCapabilitySummaries() {
        return this.gatewayCapabilitySummaries == null ? Input.empty() : this.gatewayCapabilitySummaries;
    }

    /**
     * A unique, friendly name for the gateway.
     * 
     */
    @InputImport(name="gatewayName")
      private final @Nullable Input<String> gatewayName;

    public Input<String> getGatewayName() {
        return this.gatewayName == null ? Input.empty() : this.gatewayName;
    }

    /**
     * The gateway's platform. You can only specify one platform in a gateway.
     * 
     */
    @InputImport(name="gatewayPlatform", required=true)
      private final Input<GatewayPlatformArgs> gatewayPlatform;

    public Input<GatewayPlatformArgs> getGatewayPlatform() {
        return this.gatewayPlatform;
    }

    /**
     * A list of key-value pairs that contain metadata for the gateway.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<GatewayTagArgs>> tags;

    public Input<List<GatewayTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public GatewayArgs(
        @Nullable Input<List<GatewayCapabilitySummaryArgs>> gatewayCapabilitySummaries,
        @Nullable Input<String> gatewayName,
        Input<GatewayPlatformArgs> gatewayPlatform,
        @Nullable Input<List<GatewayTagArgs>> tags) {
        this.gatewayCapabilitySummaries = gatewayCapabilitySummaries;
        this.gatewayName = gatewayName;
        this.gatewayPlatform = Objects.requireNonNull(gatewayPlatform, "expected parameter 'gatewayPlatform' to be non-null");
        this.tags = tags;
    }

    private GatewayArgs() {
        this.gatewayCapabilitySummaries = Input.empty();
        this.gatewayName = Input.empty();
        this.gatewayPlatform = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GatewayCapabilitySummaryArgs>> gatewayCapabilitySummaries;
        private @Nullable Input<String> gatewayName;
        private Input<GatewayPlatformArgs> gatewayPlatform;
        private @Nullable Input<List<GatewayTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayCapabilitySummaries = defaults.gatewayCapabilitySummaries;
    	      this.gatewayName = defaults.gatewayName;
    	      this.gatewayPlatform = defaults.gatewayPlatform;
    	      this.tags = defaults.tags;
        }

        public Builder setGatewayCapabilitySummaries(@Nullable Input<List<GatewayCapabilitySummaryArgs>> gatewayCapabilitySummaries) {
            this.gatewayCapabilitySummaries = gatewayCapabilitySummaries;
            return this;
        }

        public Builder setGatewayCapabilitySummaries(@Nullable List<GatewayCapabilitySummaryArgs> gatewayCapabilitySummaries) {
            this.gatewayCapabilitySummaries = Input.ofNullable(gatewayCapabilitySummaries);
            return this;
        }

        public Builder setGatewayName(@Nullable Input<String> gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }

        public Builder setGatewayName(@Nullable String gatewayName) {
            this.gatewayName = Input.ofNullable(gatewayName);
            return this;
        }

        public Builder setGatewayPlatform(Input<GatewayPlatformArgs> gatewayPlatform) {
            this.gatewayPlatform = Objects.requireNonNull(gatewayPlatform);
            return this;
        }

        public Builder setGatewayPlatform(GatewayPlatformArgs gatewayPlatform) {
            this.gatewayPlatform = Input.of(Objects.requireNonNull(gatewayPlatform));
            return this;
        }

        public Builder setTags(@Nullable Input<List<GatewayTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<GatewayTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public GatewayArgs build() {
            return new GatewayArgs(gatewayCapabilitySummaries, gatewayName, gatewayPlatform, tags);
        }
    }
}
