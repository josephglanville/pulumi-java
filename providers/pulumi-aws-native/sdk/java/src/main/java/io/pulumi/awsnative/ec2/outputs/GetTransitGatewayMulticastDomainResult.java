// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.OptionsProperties;
import io.pulumi.awsnative.ec2.outputs.TransitGatewayMulticastDomainTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTransitGatewayMulticastDomainResult {
    /**
     * The time the transit gateway multicast domain was created.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * The options for the transit gateway multicast domain.
     * 
     */
    private final @Nullable OptionsProperties options;
    /**
     * The state of the transit gateway multicast domain.
     * 
     */
    private final @Nullable String state;
    /**
     * The tags for the transit gateway multicast domain.
     * 
     */
    private final @Nullable List<TransitGatewayMulticastDomainTag> tags;
    /**
     * The Amazon Resource Name (ARN) of the transit gateway multicast domain.
     * 
     */
    private final @Nullable String transitGatewayMulticastDomainArn;
    /**
     * The ID of the transit gateway multicast domain.
     * 
     */
    private final @Nullable String transitGatewayMulticastDomainId;

    @CustomType.Constructor
    private GetTransitGatewayMulticastDomainResult(
        @CustomType.Parameter("creationTime") @Nullable String creationTime,
        @CustomType.Parameter("options") @Nullable OptionsProperties options,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("tags") @Nullable List<TransitGatewayMulticastDomainTag> tags,
        @CustomType.Parameter("transitGatewayMulticastDomainArn") @Nullable String transitGatewayMulticastDomainArn,
        @CustomType.Parameter("transitGatewayMulticastDomainId") @Nullable String transitGatewayMulticastDomainId) {
        this.creationTime = creationTime;
        this.options = options;
        this.state = state;
        this.tags = tags;
        this.transitGatewayMulticastDomainArn = transitGatewayMulticastDomainArn;
        this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
    }

    /**
     * The time the transit gateway multicast domain was created.
     * 
    */
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * The options for the transit gateway multicast domain.
     * 
    */
    public Optional<OptionsProperties> getOptions() {
        return Optional.ofNullable(this.options);
    }
    /**
     * The state of the transit gateway multicast domain.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * The tags for the transit gateway multicast domain.
     * 
    */
    public List<TransitGatewayMulticastDomainTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The Amazon Resource Name (ARN) of the transit gateway multicast domain.
     * 
    */
    public Optional<String> getTransitGatewayMulticastDomainArn() {
        return Optional.ofNullable(this.transitGatewayMulticastDomainArn);
    }
    /**
     * The ID of the transit gateway multicast domain.
     * 
    */
    public Optional<String> getTransitGatewayMulticastDomainId() {
        return Optional.ofNullable(this.transitGatewayMulticastDomainId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayMulticastDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable OptionsProperties options;
        private @Nullable String state;
        private @Nullable List<TransitGatewayMulticastDomainTag> tags;
        private @Nullable String transitGatewayMulticastDomainArn;
        private @Nullable String transitGatewayMulticastDomainId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayMulticastDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.options = defaults.options;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.transitGatewayMulticastDomainArn = defaults.transitGatewayMulticastDomainArn;
    	      this.transitGatewayMulticastDomainId = defaults.transitGatewayMulticastDomainId;
        }

        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder options(@Nullable OptionsProperties options) {
            this.options = options;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder tags(@Nullable List<TransitGatewayMulticastDomainTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(TransitGatewayMulticastDomainTag... tags) {
            return tags(List.of(tags));
        }
        public Builder transitGatewayMulticastDomainArn(@Nullable String transitGatewayMulticastDomainArn) {
            this.transitGatewayMulticastDomainArn = transitGatewayMulticastDomainArn;
            return this;
        }
        public Builder transitGatewayMulticastDomainId(@Nullable String transitGatewayMulticastDomainId) {
            this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
            return this;
        }        public GetTransitGatewayMulticastDomainResult build() {
            return new GetTransitGatewayMulticastDomainResult(creationTime, options, state, tags, transitGatewayMulticastDomainArn, transitGatewayMulticastDomainId);
        }
    }
}
