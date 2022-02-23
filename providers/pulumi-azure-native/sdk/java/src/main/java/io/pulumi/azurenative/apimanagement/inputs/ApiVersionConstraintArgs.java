// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Control Plane Apis version constraint for the API Management service.
 * 
 */
public final class ApiVersionConstraintArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiVersionConstraintArgs Empty = new ApiVersionConstraintArgs();

    /**
     * Limit control plane API calls to API Management service with version equal to or newer than this value.
     * 
     */
    @InputImport(name="minApiVersion")
      private final @Nullable Input<String> minApiVersion;

    public Input<String> getMinApiVersion() {
        return this.minApiVersion == null ? Input.empty() : this.minApiVersion;
    }

    public ApiVersionConstraintArgs(@Nullable Input<String> minApiVersion) {
        this.minApiVersion = minApiVersion;
    }

    private ApiVersionConstraintArgs() {
        this.minApiVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiVersionConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> minApiVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiVersionConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minApiVersion = defaults.minApiVersion;
        }

        public Builder setMinApiVersion(@Nullable Input<String> minApiVersion) {
            this.minApiVersion = minApiVersion;
            return this;
        }

        public Builder setMinApiVersion(@Nullable String minApiVersion) {
            this.minApiVersion = Input.ofNullable(minApiVersion);
            return this;
        }
        public ApiVersionConstraintArgs build() {
            return new ApiVersionConstraintArgs(minApiVersion);
        }
    }
}
