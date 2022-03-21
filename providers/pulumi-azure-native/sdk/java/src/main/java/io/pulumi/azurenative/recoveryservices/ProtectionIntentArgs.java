// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.recoveryservices.inputs.AzureRecoveryServiceVaultProtectionIntentArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureResourceProtectionIntentArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureWorkloadAutoProtectionIntentArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureWorkloadSQLAutoProtectionIntentArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProtectionIntentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProtectionIntentArgs Empty = new ProtectionIntentArgs();

    /**
     * Optional ETag.
     * 
     */
    @Import(name="eTag")
      private final @Nullable Output<String> eTag;

    public Output<String> getETag() {
        return this.eTag == null ? Output.empty() : this.eTag;
    }

    /**
     * Fabric name associated with the backup item.
     * 
     */
    @Import(name="fabricName", required=true)
      private final Output<String> fabricName;

    public Output<String> getFabricName() {
        return this.fabricName;
    }

    /**
     * Intent object name.
     * 
     */
    @Import(name="intentObjectName")
      private final @Nullable Output<String> intentObjectName;

    public Output<String> getIntentObjectName() {
        return this.intentObjectName == null ? Output.empty() : this.intentObjectName;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * ProtectionIntentResource properties
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Object> properties;

    public Output<Object> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="vaultName", required=true)
      private final Output<String> vaultName;

    public Output<String> getVaultName() {
        return this.vaultName;
    }

    public ProtectionIntentArgs(
        @Nullable Output<String> eTag,
        Output<String> fabricName,
        @Nullable Output<String> intentObjectName,
        @Nullable Output<String> location,
        @Nullable Output<Object> properties,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        Output<String> vaultName) {
        this.eTag = eTag;
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.intentObjectName = intentObjectName;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private ProtectionIntentArgs() {
        this.eTag = Output.empty();
        this.fabricName = Output.empty();
        this.intentObjectName = Output.empty();
        this.location = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
        this.vaultName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectionIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eTag;
        private Output<String> fabricName;
        private @Nullable Output<String> intentObjectName;
        private @Nullable Output<String> location;
        private @Nullable Output<Object> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtectionIntentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.fabricName = defaults.fabricName;
    	      this.intentObjectName = defaults.intentObjectName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder eTag(@Nullable Output<String> eTag) {
            this.eTag = eTag;
            return this;
        }
        public Builder eTag(@Nullable String eTag) {
            this.eTag = Output.ofNullable(eTag);
            return this;
        }
        public Builder fabricName(Output<String> fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }
        public Builder fabricName(String fabricName) {
            this.fabricName = Output.of(Objects.requireNonNull(fabricName));
            return this;
        }
        public Builder intentObjectName(@Nullable Output<String> intentObjectName) {
            this.intentObjectName = intentObjectName;
            return this;
        }
        public Builder intentObjectName(@Nullable String intentObjectName) {
            this.intentObjectName = Output.ofNullable(intentObjectName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder properties(@Nullable Output<Object> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Object properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder vaultName(Output<String> vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }
        public Builder vaultName(String vaultName) {
            this.vaultName = Output.of(Objects.requireNonNull(vaultName));
            return this;
        }        public ProtectionIntentArgs build() {
            return new ProtectionIntentArgs(eTag, fabricName, intentObjectName, location, properties, resourceGroupName, tags, vaultName);
        }
    }
}
