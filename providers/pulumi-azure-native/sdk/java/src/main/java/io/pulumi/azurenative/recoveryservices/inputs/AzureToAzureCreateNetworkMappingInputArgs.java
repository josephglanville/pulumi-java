// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Create network mappings input properties/behavior specific to Azure to Azure Network mapping.
 * 
 */
public final class AzureToAzureCreateNetworkMappingInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureToAzureCreateNetworkMappingInputArgs Empty = new AzureToAzureCreateNetworkMappingInputArgs();

    /**
     * The instance type.
     * Expected value is 'AzureToAzure'.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * The primary azure vnet Id.
     * 
     */
    @InputImport(name="primaryNetworkId")
      private final @Nullable Input<String> primaryNetworkId;

    public Input<String> getPrimaryNetworkId() {
        return this.primaryNetworkId == null ? Input.empty() : this.primaryNetworkId;
    }

    public AzureToAzureCreateNetworkMappingInputArgs(
        @Nullable Input<String> instanceType,
        @Nullable Input<String> primaryNetworkId) {
        this.instanceType = instanceType;
        this.primaryNetworkId = primaryNetworkId;
    }

    private AzureToAzureCreateNetworkMappingInputArgs() {
        this.instanceType = Input.empty();
        this.primaryNetworkId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureToAzureCreateNetworkMappingInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instanceType;
        private @Nullable Input<String> primaryNetworkId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureToAzureCreateNetworkMappingInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.primaryNetworkId = defaults.primaryNetworkId;
        }

        public Builder setInstanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder setPrimaryNetworkId(@Nullable Input<String> primaryNetworkId) {
            this.primaryNetworkId = primaryNetworkId;
            return this;
        }

        public Builder setPrimaryNetworkId(@Nullable String primaryNetworkId) {
            this.primaryNetworkId = Input.ofNullable(primaryNetworkId);
            return this;
        }
        public AzureToAzureCreateNetworkMappingInputArgs build() {
            return new AzureToAzureCreateNetworkMappingInputArgs(instanceType, primaryNetworkId);
        }
    }
}
