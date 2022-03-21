// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrafficMirrorTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrafficMirrorTargetArgs Empty = new TrafficMirrorTargetArgs();

    /**
     * A description of the traffic mirror session.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The network interface ID that is associated with the target.
     * 
     */
    @Import(name="networkInterfaceId")
      private final @Nullable Output<String> networkInterfaceId;

    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId == null ? Output.empty() : this.networkInterfaceId;
    }

    /**
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     * 
     */
    @Import(name="networkLoadBalancerArn")
      private final @Nullable Output<String> networkLoadBalancerArn;

    public Output<String> getNetworkLoadBalancerArn() {
        return this.networkLoadBalancerArn == null ? Output.empty() : this.networkLoadBalancerArn;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public TrafficMirrorTargetArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> networkInterfaceId,
        @Nullable Output<String> networkLoadBalancerArn,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.networkInterfaceId = networkInterfaceId;
        this.networkLoadBalancerArn = networkLoadBalancerArn;
        this.tags = tags;
    }

    private TrafficMirrorTargetArgs() {
        this.description = Output.empty();
        this.networkInterfaceId = Output.empty();
        this.networkLoadBalancerArn = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficMirrorTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> networkInterfaceId;
        private @Nullable Output<String> networkLoadBalancerArn;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficMirrorTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.networkLoadBalancerArn = defaults.networkLoadBalancerArn;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder networkInterfaceId(@Nullable Output<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public Builder networkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = Output.ofNullable(networkInterfaceId);
            return this;
        }
        public Builder networkLoadBalancerArn(@Nullable Output<String> networkLoadBalancerArn) {
            this.networkLoadBalancerArn = networkLoadBalancerArn;
            return this;
        }
        public Builder networkLoadBalancerArn(@Nullable String networkLoadBalancerArn) {
            this.networkLoadBalancerArn = Output.ofNullable(networkLoadBalancerArn);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public TrafficMirrorTargetArgs build() {
            return new TrafficMirrorTargetArgs(description, networkInterfaceId, networkLoadBalancerArn, tags);
        }
    }
}
