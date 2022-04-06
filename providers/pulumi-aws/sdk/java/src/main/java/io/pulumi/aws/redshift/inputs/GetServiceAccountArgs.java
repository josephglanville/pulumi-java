// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceAccountArgs Empty = new GetServiceAccountArgs();

    /**
     * Name of the region whose AWS Redshift account ID is desired.
     * Defaults to the region from the AWS provider configuration.
     * 
     */
    @Import(name="region")
      private final @Nullable String region;

    public Optional<String> getRegion() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    public GetServiceAccountArgs(@Nullable String region) {
        this.region = region;
    }

    private GetServiceAccountArgs() {
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
        }

        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }        public GetServiceAccountArgs build() {
            return new GetServiceAccountArgs(region);
        }
    }
}