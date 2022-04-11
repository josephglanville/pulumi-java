// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed Virtual Network Settings
 * 
 */
public final class ManagedVirtualNetworkSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedVirtualNetworkSettingsArgs Empty = new ManagedVirtualNetworkSettingsArgs();

    /**
     * Allowed Aad Tenant Ids For Linking
     * 
     */
    @Import(name="allowedAadTenantIdsForLinking")
      private final @Nullable Output<List<String>> allowedAadTenantIdsForLinking;

    public Output<List<String>> getAllowedAadTenantIdsForLinking() {
        return this.allowedAadTenantIdsForLinking == null ? Codegen.empty() : this.allowedAadTenantIdsForLinking;
    }

    /**
     * Linked Access Check On Target Resource
     * 
     */
    @Import(name="linkedAccessCheckOnTargetResource")
      private final @Nullable Output<Boolean> linkedAccessCheckOnTargetResource;

    public Output<Boolean> getLinkedAccessCheckOnTargetResource() {
        return this.linkedAccessCheckOnTargetResource == null ? Codegen.empty() : this.linkedAccessCheckOnTargetResource;
    }

    /**
     * Prevent Data Exfiltration
     * 
     */
    @Import(name="preventDataExfiltration")
      private final @Nullable Output<Boolean> preventDataExfiltration;

    public Output<Boolean> getPreventDataExfiltration() {
        return this.preventDataExfiltration == null ? Codegen.empty() : this.preventDataExfiltration;
    }

    public ManagedVirtualNetworkSettingsArgs(
        @Nullable Output<List<String>> allowedAadTenantIdsForLinking,
        @Nullable Output<Boolean> linkedAccessCheckOnTargetResource,
        @Nullable Output<Boolean> preventDataExfiltration) {
        this.allowedAadTenantIdsForLinking = allowedAadTenantIdsForLinking;
        this.linkedAccessCheckOnTargetResource = linkedAccessCheckOnTargetResource;
        this.preventDataExfiltration = preventDataExfiltration;
    }

    private ManagedVirtualNetworkSettingsArgs() {
        this.allowedAadTenantIdsForLinking = Codegen.empty();
        this.linkedAccessCheckOnTargetResource = Codegen.empty();
        this.preventDataExfiltration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedVirtualNetworkSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedAadTenantIdsForLinking;
        private @Nullable Output<Boolean> linkedAccessCheckOnTargetResource;
        private @Nullable Output<Boolean> preventDataExfiltration;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedVirtualNetworkSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAadTenantIdsForLinking = defaults.allowedAadTenantIdsForLinking;
    	      this.linkedAccessCheckOnTargetResource = defaults.linkedAccessCheckOnTargetResource;
    	      this.preventDataExfiltration = defaults.preventDataExfiltration;
        }

        public Builder allowedAadTenantIdsForLinking(@Nullable Output<List<String>> allowedAadTenantIdsForLinking) {
            this.allowedAadTenantIdsForLinking = allowedAadTenantIdsForLinking;
            return this;
        }
        public Builder allowedAadTenantIdsForLinking(@Nullable List<String> allowedAadTenantIdsForLinking) {
            this.allowedAadTenantIdsForLinking = Codegen.ofNullable(allowedAadTenantIdsForLinking);
            return this;
        }
        public Builder allowedAadTenantIdsForLinking(String... allowedAadTenantIdsForLinking) {
            return allowedAadTenantIdsForLinking(List.of(allowedAadTenantIdsForLinking));
        }
        public Builder linkedAccessCheckOnTargetResource(@Nullable Output<Boolean> linkedAccessCheckOnTargetResource) {
            this.linkedAccessCheckOnTargetResource = linkedAccessCheckOnTargetResource;
            return this;
        }
        public Builder linkedAccessCheckOnTargetResource(@Nullable Boolean linkedAccessCheckOnTargetResource) {
            this.linkedAccessCheckOnTargetResource = Codegen.ofNullable(linkedAccessCheckOnTargetResource);
            return this;
        }
        public Builder preventDataExfiltration(@Nullable Output<Boolean> preventDataExfiltration) {
            this.preventDataExfiltration = preventDataExfiltration;
            return this;
        }
        public Builder preventDataExfiltration(@Nullable Boolean preventDataExfiltration) {
            this.preventDataExfiltration = Codegen.ofNullable(preventDataExfiltration);
            return this;
        }        public ManagedVirtualNetworkSettingsArgs build() {
            return new ManagedVirtualNetworkSettingsArgs(allowedAadTenantIdsForLinking, linkedAccessCheckOnTargetResource, preventDataExfiltration);
        }
    }
}
