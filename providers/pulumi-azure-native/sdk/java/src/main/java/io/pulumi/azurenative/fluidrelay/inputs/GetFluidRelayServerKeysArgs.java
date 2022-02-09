// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.fluidrelay.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFluidRelayServerKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFluidRelayServerKeysArgs Empty = new GetFluidRelayServerKeysArgs();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="resourceGroup", required=true)
    private final String resourceGroup;

    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public GetFluidRelayServerKeysArgs(
        String name,
        String resourceGroup) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
    }

    private GetFluidRelayServerKeysArgs() {
        this.name = null;
        this.resourceGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFluidRelayServerKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String resourceGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFluidRelayServerKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceGroup = defaults.resourceGroup;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public GetFluidRelayServerKeysArgs build() {
            return new GetFluidRelayServerKeysArgs(name, resourceGroup);
        }
    }
}
