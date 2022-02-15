// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StudioComponentLicenseServiceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioComponentLicenseServiceConfigurationArgs Empty = new StudioComponentLicenseServiceConfigurationArgs();

    @InputImport(name="endpoint")
    private final @Nullable Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    public StudioComponentLicenseServiceConfigurationArgs(@Nullable Input<String> endpoint) {
        this.endpoint = endpoint;
    }

    private StudioComponentLicenseServiceConfigurationArgs() {
        this.endpoint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentLicenseServiceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentLicenseServiceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
        }

        public Builder setEndpoint(@Nullable Input<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public StudioComponentLicenseServiceConfigurationArgs build() {
            return new StudioComponentLicenseServiceConfigurationArgs(endpoint);
        }
    }
}