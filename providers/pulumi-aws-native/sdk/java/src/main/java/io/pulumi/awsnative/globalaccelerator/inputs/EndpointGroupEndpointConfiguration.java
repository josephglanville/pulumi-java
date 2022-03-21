// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration for a given endpoint
 * 
 */
public final class EndpointGroupEndpointConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final EndpointGroupEndpointConfiguration Empty = new EndpointGroupEndpointConfiguration();

    /**
     * true if client ip should be preserved
     * 
     */
    @Import(name="clientIPPreservationEnabled")
      private final @Nullable Boolean clientIPPreservationEnabled;

    public Optional<Boolean> getClientIPPreservationEnabled() {
        return this.clientIPPreservationEnabled == null ? Optional.empty() : Optional.ofNullable(this.clientIPPreservationEnabled);
    }

    /**
     * Id of the endpoint. For Network/Application Load Balancer this value is the ARN.  For EIP, this value is the allocation ID.  For EC2 instances, this is the EC2 instance ID
     * 
     */
    @Import(name="endpointId", required=true)
      private final String endpointId;

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * The weight for the endpoint.
     * 
     */
    @Import(name="weight")
      private final @Nullable Integer weight;

    public Optional<Integer> getWeight() {
        return this.weight == null ? Optional.empty() : Optional.ofNullable(this.weight);
    }

    public EndpointGroupEndpointConfiguration(
        @Nullable Boolean clientIPPreservationEnabled,
        String endpointId,
        @Nullable Integer weight) {
        this.clientIPPreservationEnabled = clientIPPreservationEnabled;
        this.endpointId = Objects.requireNonNull(endpointId, "expected parameter 'endpointId' to be non-null");
        this.weight = weight;
    }

    private EndpointGroupEndpointConfiguration() {
        this.clientIPPreservationEnabled = null;
        this.endpointId = null;
        this.weight = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGroupEndpointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean clientIPPreservationEnabled;
        private String endpointId;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointGroupEndpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientIPPreservationEnabled = defaults.clientIPPreservationEnabled;
    	      this.endpointId = defaults.endpointId;
    	      this.weight = defaults.weight;
        }

        public Builder clientIPPreservationEnabled(@Nullable Boolean clientIPPreservationEnabled) {
            this.clientIPPreservationEnabled = clientIPPreservationEnabled;
            return this;
        }
        public Builder endpointId(String endpointId) {
            this.endpointId = Objects.requireNonNull(endpointId);
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public EndpointGroupEndpointConfiguration build() {
            return new EndpointGroupEndpointConfiguration(clientIPPreservationEnabled, endpointId, weight);
        }
    }
}
