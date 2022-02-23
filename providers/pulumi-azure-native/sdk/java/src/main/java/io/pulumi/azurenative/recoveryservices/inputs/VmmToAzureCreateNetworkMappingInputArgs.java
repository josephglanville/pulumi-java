// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Create network mappings input properties/behavior specific to Vmm to Azure Network mapping.
 * 
 */
public final class VmmToAzureCreateNetworkMappingInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmmToAzureCreateNetworkMappingInputArgs Empty = new VmmToAzureCreateNetworkMappingInputArgs();

    /**
     * The instance type.
     * Expected value is 'VmmToAzure'.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    public VmmToAzureCreateNetworkMappingInputArgs(@Nullable Input<String> instanceType) {
        this.instanceType = instanceType;
    }

    private VmmToAzureCreateNetworkMappingInputArgs() {
        this.instanceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmmToAzureCreateNetworkMappingInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instanceType;

        public Builder() {
    	      // Empty
        }

        public Builder(VmmToAzureCreateNetworkMappingInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
        }

        public Builder setInstanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }
        public VmmToAzureCreateNetworkMappingInputArgs build() {
            return new VmmToAzureCreateNetworkMappingInputArgs(instanceType);
        }
    }
}
