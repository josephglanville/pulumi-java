// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces.outputs;

import io.pulumi.awsnative.refactorspaces.outputs.EnvironmentTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEnvironmentResult {
    private final @Nullable String arn;
    private final @Nullable String environmentIdentifier;
    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    private final @Nullable List<EnvironmentTag> tags;
    private final @Nullable String transitGatewayId;

    @CustomType.Constructor
    private GetEnvironmentResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("environmentIdentifier") @Nullable String environmentIdentifier,
        @CustomType.Parameter("tags") @Nullable List<EnvironmentTag> tags,
        @CustomType.Parameter("transitGatewayId") @Nullable String transitGatewayId) {
        this.arn = arn;
        this.environmentIdentifier = environmentIdentifier;
        this.tags = tags;
        this.transitGatewayId = transitGatewayId;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getEnvironmentIdentifier() {
        return Optional.ofNullable(this.environmentIdentifier);
    }
    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
    */
    public List<EnvironmentTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<String> getTransitGatewayId() {
        return Optional.ofNullable(this.transitGatewayId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String environmentIdentifier;
        private @Nullable List<EnvironmentTag> tags;
        private @Nullable String transitGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.environmentIdentifier = defaults.environmentIdentifier;
    	      this.tags = defaults.tags;
    	      this.transitGatewayId = defaults.transitGatewayId;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder environmentIdentifier(@Nullable String environmentIdentifier) {
            this.environmentIdentifier = environmentIdentifier;
            return this;
        }
        public Builder tags(@Nullable List<EnvironmentTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(EnvironmentTag... tags) {
            return tags(List.of(tags));
        }
        public Builder transitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(arn, environmentIdentifier, tags, transitGatewayId);
        }
    }
}
