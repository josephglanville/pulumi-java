// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
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
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Output.empty() : this.instanceType;
    }

    /**
     * The primary azure vnet Id.
     * 
     */
    @InputImport(name="primaryNetworkId")
      private final @Nullable Output<String> primaryNetworkId;

    public Output<String> getPrimaryNetworkId() {
        return this.primaryNetworkId == null ? Output.empty() : this.primaryNetworkId;
    }

    public AzureToAzureCreateNetworkMappingInputArgs(
        @Nullable Output<String> instanceType,
        @Nullable Output<String> primaryNetworkId) {
        this.instanceType = instanceType;
        this.primaryNetworkId = primaryNetworkId;
    }

    private AzureToAzureCreateNetworkMappingInputArgs() {
        this.instanceType = Output.empty();
        this.primaryNetworkId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureToAzureCreateNetworkMappingInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceType;
        private @Nullable Output<String> primaryNetworkId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureToAzureCreateNetworkMappingInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.primaryNetworkId = defaults.primaryNetworkId;
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Output.ofNullable(instanceType);
            return this;
        }

        public Builder primaryNetworkId(@Nullable Output<String> primaryNetworkId) {
            this.primaryNetworkId = primaryNetworkId;
            return this;
        }

        public Builder primaryNetworkId(@Nullable String primaryNetworkId) {
            this.primaryNetworkId = Output.ofNullable(primaryNetworkId);
            return this;
        }
        public AzureToAzureCreateNetworkMappingInputArgs build() {
            return new AzureToAzureCreateNetworkMappingInputArgs(instanceType, primaryNetworkId);
        }
    }
}
