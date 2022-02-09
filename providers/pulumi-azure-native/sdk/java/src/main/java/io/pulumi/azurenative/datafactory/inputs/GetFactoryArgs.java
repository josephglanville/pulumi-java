// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFactoryArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFactoryArgs Empty = new GetFactoryArgs();

    @InputImport(name="factoryName", required=true)
    private final String factoryName;

    public String getFactoryName() {
        return this.factoryName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetFactoryArgs(
        String factoryName,
        String resourceGroupName) {
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetFactoryArgs() {
        this.factoryName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFactoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String factoryName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFactoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factoryName = defaults.factoryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setFactoryName(String factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetFactoryArgs build() {
            return new GetFactoryArgs(factoryName, resourceGroupName);
        }
    }
}
