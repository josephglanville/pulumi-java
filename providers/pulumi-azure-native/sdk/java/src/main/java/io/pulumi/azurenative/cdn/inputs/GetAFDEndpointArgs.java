// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAFDEndpointArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAFDEndpointArgs Empty = new GetAFDEndpointArgs();

    @InputImport(name="endpointName", required=true)
    private final String endpointName;

    public String getEndpointName() {
        return this.endpointName;
    }

    @InputImport(name="profileName", required=true)
    private final String profileName;

    public String getProfileName() {
        return this.profileName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetAFDEndpointArgs(
        String endpointName,
        String profileName,
        String resourceGroupName) {
        this.endpointName = Objects.requireNonNull(endpointName, "expected parameter 'endpointName' to be non-null");
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAFDEndpointArgs() {
        this.endpointName = null;
        this.profileName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAFDEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointName;
        private String profileName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAFDEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointName = defaults.endpointName;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setEndpointName(String endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetAFDEndpointArgs build() {
            return new GetAFDEndpointArgs(endpointName, profileName, resourceGroupName);
        }
    }
}
