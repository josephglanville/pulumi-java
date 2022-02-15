// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRouteFilterRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRouteFilterRuleArgs Empty = new GetRouteFilterRuleArgs();

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="routeFilterName", required=true)
    private final String routeFilterName;

    public String getRouteFilterName() {
        return this.routeFilterName;
    }

    @InputImport(name="ruleName", required=true)
    private final String ruleName;

    public String getRuleName() {
        return this.ruleName;
    }

    public GetRouteFilterRuleArgs(
        String resourceGroupName,
        String routeFilterName,
        String ruleName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routeFilterName = Objects.requireNonNull(routeFilterName, "expected parameter 'routeFilterName' to be non-null");
        this.ruleName = Objects.requireNonNull(ruleName, "expected parameter 'ruleName' to be non-null");
    }

    private GetRouteFilterRuleArgs() {
        this.resourceGroupName = null;
        this.routeFilterName = null;
        this.ruleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteFilterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String routeFilterName;
        private String ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteFilterRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routeFilterName = defaults.routeFilterName;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRouteFilterName(String routeFilterName) {
            this.routeFilterName = Objects.requireNonNull(routeFilterName);
            return this;
        }

        public Builder setRuleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }

        public GetRouteFilterRuleArgs build() {
            return new GetRouteFilterRuleArgs(resourceGroupName, routeFilterName, ruleName);
        }
    }
}