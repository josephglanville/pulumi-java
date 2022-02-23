// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ApiProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiProfileResponse Empty = new ApiProfileResponse();

    /**
     * The API version.
     * 
     */
    @InputImport(name="apiVersion", required=true)
      private final String apiVersion;

    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The profile version.
     * 
     */
    @InputImport(name="profileVersion", required=true)
      private final String profileVersion;

    public String getProfileVersion() {
        return this.profileVersion;
    }

    public ApiProfileResponse(
        String apiVersion,
        String profileVersion) {
        this.apiVersion = Objects.requireNonNull(apiVersion, "expected parameter 'apiVersion' to be non-null");
        this.profileVersion = Objects.requireNonNull(profileVersion, "expected parameter 'profileVersion' to be non-null");
    }

    private ApiProfileResponse() {
        this.apiVersion = null;
        this.profileVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiVersion;
        private String profileVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.profileVersion = defaults.profileVersion;
        }

        public Builder setApiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }

        public Builder setProfileVersion(String profileVersion) {
            this.profileVersion = Objects.requireNonNull(profileVersion);
            return this;
        }
        public ApiProfileResponse build() {
            return new ApiProfileResponse(apiVersion, profileVersion);
        }
    }
}
