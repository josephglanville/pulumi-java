// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.enums.InfrastructureConfigurationInstanceMetadataOptionsHttpTokens;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The instance metadata option settings for the infrastructure configuration.
 * 
 */
public final class InfrastructureConfigurationInstanceMetadataOptions extends io.pulumi.resources.InvokeArgs {

    public static final InfrastructureConfigurationInstanceMetadataOptions Empty = new InfrastructureConfigurationInstanceMetadataOptions();

    /**
     * Limit the number of hops that an instance metadata request can traverse to reach its destination.
     * 
     */
    @Import(name="httpPutResponseHopLimit")
      private final @Nullable Integer httpPutResponseHopLimit;

    public Optional<Integer> getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit == null ? Optional.empty() : Optional.ofNullable(this.httpPutResponseHopLimit);
    }

    /**
     * Indicates whether a signed token header is required for instance metadata retrieval requests. The values affect the response as follows:
     * 
     */
    @Import(name="httpTokens")
      private final @Nullable InfrastructureConfigurationInstanceMetadataOptionsHttpTokens httpTokens;

    public Optional<InfrastructureConfigurationInstanceMetadataOptionsHttpTokens> getHttpTokens() {
        return this.httpTokens == null ? Optional.empty() : Optional.ofNullable(this.httpTokens);
    }

    public InfrastructureConfigurationInstanceMetadataOptions(
        @Nullable Integer httpPutResponseHopLimit,
        @Nullable InfrastructureConfigurationInstanceMetadataOptionsHttpTokens httpTokens) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        this.httpTokens = httpTokens;
    }

    private InfrastructureConfigurationInstanceMetadataOptions() {
        this.httpPutResponseHopLimit = null;
        this.httpTokens = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureConfigurationInstanceMetadataOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer httpPutResponseHopLimit;
        private @Nullable InfrastructureConfigurationInstanceMetadataOptionsHttpTokens httpTokens;

        public Builder() {
    	      // Empty
        }

        public Builder(InfrastructureConfigurationInstanceMetadataOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpPutResponseHopLimit = defaults.httpPutResponseHopLimit;
    	      this.httpTokens = defaults.httpTokens;
        }

        public Builder httpPutResponseHopLimit(@Nullable Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }
        public Builder httpTokens(@Nullable InfrastructureConfigurationInstanceMetadataOptionsHttpTokens httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }        public InfrastructureConfigurationInstanceMetadataOptions build() {
            return new InfrastructureConfigurationInstanceMetadataOptions(httpPutResponseHopLimit, httpTokens);
        }
    }
}
