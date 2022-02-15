// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRulesEngineArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRulesEngineArgs Empty = new GetRulesEngineArgs();

    @InputImport(name="frontDoorName", required=true)
    private final String frontDoorName;

    public String getFrontDoorName() {
        return this.frontDoorName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="rulesEngineName", required=true)
    private final String rulesEngineName;

    public String getRulesEngineName() {
        return this.rulesEngineName;
    }

    public GetRulesEngineArgs(
        String frontDoorName,
        String resourceGroupName,
        String rulesEngineName) {
        this.frontDoorName = Objects.requireNonNull(frontDoorName, "expected parameter 'frontDoorName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rulesEngineName = Objects.requireNonNull(rulesEngineName, "expected parameter 'rulesEngineName' to be non-null");
    }

    private GetRulesEngineArgs() {
        this.frontDoorName = null;
        this.resourceGroupName = null;
        this.rulesEngineName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesEngineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String frontDoorName;
        private String resourceGroupName;
        private String rulesEngineName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRulesEngineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frontDoorName = defaults.frontDoorName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rulesEngineName = defaults.rulesEngineName;
        }

        public Builder setFrontDoorName(String frontDoorName) {
            this.frontDoorName = Objects.requireNonNull(frontDoorName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRulesEngineName(String rulesEngineName) {
            this.rulesEngineName = Objects.requireNonNull(rulesEngineName);
            return this;
        }

        public GetRulesEngineArgs build() {
            return new GetRulesEngineArgs(frontDoorName, resourceGroupName, rulesEngineName);
        }
    }
}