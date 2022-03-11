// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DisasterRecoveryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DisasterRecoveryConfigArgs Empty = new DisasterRecoveryConfigArgs();

    /**
     * The Disaster Recovery configuration name
     * 
     */
    @InputImport(name="alias")
      private final @Nullable Output<String> alias;

    public Output<String> getAlias() {
        return this.alias == null ? Output.empty() : this.alias;
    }

    /**
     * Alternate name specified when alias and namespace names are same.
     * 
     */
    @InputImport(name="alternateName")
      private final @Nullable Output<String> alternateName;

    public Output<String> getAlternateName() {
        return this.alternateName == null ? Output.empty() : this.alternateName;
    }

    /**
     * The Namespace name
     * 
     */
    @InputImport(name="namespaceName", required=true)
      private final Output<String> namespaceName;

    public Output<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
     */
    @InputImport(name="partnerNamespace")
      private final @Nullable Output<String> partnerNamespace;

    public Output<String> getPartnerNamespace() {
        return this.partnerNamespace == null ? Output.empty() : this.partnerNamespace;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public DisasterRecoveryConfigArgs(
        @Nullable Output<String> alias,
        @Nullable Output<String> alternateName,
        Output<String> namespaceName,
        @Nullable Output<String> partnerNamespace,
        Output<String> resourceGroupName) {
        this.alias = alias;
        this.alternateName = alternateName;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.partnerNamespace = partnerNamespace;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private DisasterRecoveryConfigArgs() {
        this.alias = Output.empty();
        this.alternateName = Output.empty();
        this.namespaceName = Output.empty();
        this.partnerNamespace = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DisasterRecoveryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alias;
        private @Nullable Output<String> alternateName;
        private Output<String> namespaceName;
        private @Nullable Output<String> partnerNamespace;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(DisasterRecoveryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.alternateName = defaults.alternateName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.partnerNamespace = defaults.partnerNamespace;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder alias(@Nullable Output<String> alias) {
            this.alias = alias;
            return this;
        }

        public Builder alias(@Nullable String alias) {
            this.alias = Output.ofNullable(alias);
            return this;
        }

        public Builder alternateName(@Nullable Output<String> alternateName) {
            this.alternateName = alternateName;
            return this;
        }

        public Builder alternateName(@Nullable String alternateName) {
            this.alternateName = Output.ofNullable(alternateName);
            return this;
        }

        public Builder namespaceName(Output<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Output.of(Objects.requireNonNull(namespaceName));
            return this;
        }

        public Builder partnerNamespace(@Nullable Output<String> partnerNamespace) {
            this.partnerNamespace = partnerNamespace;
            return this;
        }

        public Builder partnerNamespace(@Nullable String partnerNamespace) {
            this.partnerNamespace = Output.ofNullable(partnerNamespace);
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
        public DisasterRecoveryConfigArgs build() {
            return new DisasterRecoveryConfigArgs(alias, alternateName, namespaceName, partnerNamespace, resourceGroupName);
        }
    }
}
