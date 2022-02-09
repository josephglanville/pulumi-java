// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.outputs;

import io.pulumi.azurenative.managednetwork.outputs.ResourceIdResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScopeResponse {
    private final @Nullable List<ResourceIdResponse> managementGroups;
    private final @Nullable List<ResourceIdResponse> subnets;
    private final @Nullable List<ResourceIdResponse> subscriptions;
    private final @Nullable List<ResourceIdResponse> virtualNetworks;

    @OutputCustomType.Constructor({"managementGroups","subnets","subscriptions","virtualNetworks"})
    private ScopeResponse(
        @Nullable List<ResourceIdResponse> managementGroups,
        @Nullable List<ResourceIdResponse> subnets,
        @Nullable List<ResourceIdResponse> subscriptions,
        @Nullable List<ResourceIdResponse> virtualNetworks) {
        this.managementGroups = managementGroups;
        this.subnets = subnets;
        this.subscriptions = subscriptions;
        this.virtualNetworks = virtualNetworks;
    }

    public List<ResourceIdResponse> getManagementGroups() {
        return this.managementGroups == null ? List.of() : this.managementGroups;
    }
    public List<ResourceIdResponse> getSubnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }
    public List<ResourceIdResponse> getSubscriptions() {
        return this.subscriptions == null ? List.of() : this.subscriptions;
    }
    public List<ResourceIdResponse> getVirtualNetworks() {
        return this.virtualNetworks == null ? List.of() : this.virtualNetworks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ResourceIdResponse> managementGroups;
        private @Nullable List<ResourceIdResponse> subnets;
        private @Nullable List<ResourceIdResponse> subscriptions;
        private @Nullable List<ResourceIdResponse> virtualNetworks;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementGroups = defaults.managementGroups;
    	      this.subnets = defaults.subnets;
    	      this.subscriptions = defaults.subscriptions;
    	      this.virtualNetworks = defaults.virtualNetworks;
        }

        public Builder setManagementGroups(@Nullable List<ResourceIdResponse> managementGroups) {
            this.managementGroups = managementGroups;
            return this;
        }

        public Builder setSubnets(@Nullable List<ResourceIdResponse> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder setSubscriptions(@Nullable List<ResourceIdResponse> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        public Builder setVirtualNetworks(@Nullable List<ResourceIdResponse> virtualNetworks) {
            this.virtualNetworks = virtualNetworks;
            return this;
        }

        public ScopeResponse build() {
            return new ScopeResponse(managementGroups, subnets, subscriptions, virtualNetworks);
        }
    }
}
