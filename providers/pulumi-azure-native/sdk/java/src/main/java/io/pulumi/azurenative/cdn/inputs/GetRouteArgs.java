// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRouteArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRouteArgs Empty = new GetRouteArgs();

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

    @InputImport(name="routeName", required=true)
    private final String routeName;

    public String getRouteName() {
        return this.routeName;
    }

    public GetRouteArgs(
        String endpointName,
        String profileName,
        String resourceGroupName,
        String routeName) {
        this.endpointName = Objects.requireNonNull(endpointName, "expected parameter 'endpointName' to be non-null");
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routeName = Objects.requireNonNull(routeName, "expected parameter 'routeName' to be non-null");
    }

    private GetRouteArgs() {
        this.endpointName = null;
        this.profileName = null;
        this.resourceGroupName = null;
        this.routeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointName;
        private String profileName;
        private String resourceGroupName;
        private String routeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointName = defaults.endpointName;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routeName = defaults.routeName;
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

        public Builder setRouteName(String routeName) {
            this.routeName = Objects.requireNonNull(routeName);
            return this;
        }

        public GetRouteArgs build() {
            return new GetRouteArgs(endpointName, profileName, resourceGroupName, routeName);
        }
    }
}
