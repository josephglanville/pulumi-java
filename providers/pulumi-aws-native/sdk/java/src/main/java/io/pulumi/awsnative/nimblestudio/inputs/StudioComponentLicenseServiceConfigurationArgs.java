// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The configuration for a license service that is associated with a studio resource.</p>
 * 
 */
public final class StudioComponentLicenseServiceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioComponentLicenseServiceConfigurationArgs Empty = new StudioComponentLicenseServiceConfigurationArgs();

    /**
     * <p>The endpoint of the license service that is accessed by the studio component resource.</p>
     * 
     */
    @InputImport(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
    }

    public StudioComponentLicenseServiceConfigurationArgs(@Nullable Output<String> endpoint) {
        this.endpoint = endpoint;
    }

    private StudioComponentLicenseServiceConfigurationArgs() {
        this.endpoint = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentLicenseServiceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentLicenseServiceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
            return this;
        }
        public StudioComponentLicenseServiceConfigurationArgs build() {
            return new StudioComponentLicenseServiceConfigurationArgs(endpoint);
        }
    }
}
