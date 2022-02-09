// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetManagerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetManagerArgs Empty = new GetManagerArgs();

    @InputImport(name="managerName", required=true)
    private final String managerName;

    public String getManagerName() {
        return this.managerName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetManagerArgs(
        String managerName,
        String resourceGroupName) {
        this.managerName = Objects.requireNonNull(managerName, "expected parameter 'managerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetManagerArgs() {
        this.managerName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managerName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managerName = defaults.managerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setManagerName(String managerName) {
            this.managerName = Objects.requireNonNull(managerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetManagerArgs build() {
            return new GetManagerArgs(managerName, resourceGroupName);
        }
    }
}
