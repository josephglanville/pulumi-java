// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointGroupEndpointConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointGroupEndpointConfigurationArgs Empty = new EndpointGroupEndpointConfigurationArgs();

    /**
     * Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint. See the [AWS documentation](https://docs.aws.amazon.com/global-accelerator/latest/dg/preserve-client-ip-address.html) for more details. The default value is `false`.
     * **Note:** When client IP address preservation is enabled, the Global Accelerator service creates an EC2 Security Group in the VPC named `GlobalAccelerator` that must be deleted (potentially outside of the provider) before the VPC will successfully delete. If this EC2 Security Group is not deleted, the provider will retry the VPC deletion for a few minutes before reporting a `DependencyViolation` error. This cannot be resolved by re-running the provider.
     * 
     */
    @Import(name="clientIpPreservationEnabled")
      private final @Nullable Output<Boolean> clientIpPreservationEnabled;

    public Output<Boolean> getClientIpPreservationEnabled() {
        return this.clientIpPreservationEnabled == null ? Output.empty() : this.clientIpPreservationEnabled;
    }

    /**
     * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID.
     * 
     */
    @Import(name="endpointId")
      private final @Nullable Output<String> endpointId;

    public Output<String> getEndpointId() {
        return this.endpointId == null ? Output.empty() : this.endpointId;
    }

    /**
     * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator to route traffic based on proportions that you specify.
     * 
     */
    @Import(name="weight")
      private final @Nullable Output<Integer> weight;

    public Output<Integer> getWeight() {
        return this.weight == null ? Output.empty() : this.weight;
    }

    public EndpointGroupEndpointConfigurationArgs(
        @Nullable Output<Boolean> clientIpPreservationEnabled,
        @Nullable Output<String> endpointId,
        @Nullable Output<Integer> weight) {
        this.clientIpPreservationEnabled = clientIpPreservationEnabled;
        this.endpointId = endpointId;
        this.weight = weight;
    }

    private EndpointGroupEndpointConfigurationArgs() {
        this.clientIpPreservationEnabled = Output.empty();
        this.endpointId = Output.empty();
        this.weight = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGroupEndpointConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> clientIpPreservationEnabled;
        private @Nullable Output<String> endpointId;
        private @Nullable Output<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointGroupEndpointConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientIpPreservationEnabled = defaults.clientIpPreservationEnabled;
    	      this.endpointId = defaults.endpointId;
    	      this.weight = defaults.weight;
        }

        public Builder clientIpPreservationEnabled(@Nullable Output<Boolean> clientIpPreservationEnabled) {
            this.clientIpPreservationEnabled = clientIpPreservationEnabled;
            return this;
        }
        public Builder clientIpPreservationEnabled(@Nullable Boolean clientIpPreservationEnabled) {
            this.clientIpPreservationEnabled = Output.ofNullable(clientIpPreservationEnabled);
            return this;
        }
        public Builder endpointId(@Nullable Output<String> endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public Builder endpointId(@Nullable String endpointId) {
            this.endpointId = Output.ofNullable(endpointId);
            return this;
        }
        public Builder weight(@Nullable Output<Integer> weight) {
            this.weight = weight;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = Output.ofNullable(weight);
            return this;
        }        public EndpointGroupEndpointConfigurationArgs build() {
            return new EndpointGroupEndpointConfigurationArgs(clientIpPreservationEnabled, endpointId, weight);
        }
    }
}
