// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNamespaceIpFilterRuleResult {
    /**
     * The IP Filter Action
     * 
     */
    private final @Nullable String action;
    /**
     * IP Filter name
     * 
     */
    private final @Nullable String filterName;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * IP Mask
     * 
     */
    private final @Nullable String ipMask;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetNamespaceIpFilterRuleResult(
        @CustomType.Parameter("action") @Nullable String action,
        @CustomType.Parameter("filterName") @Nullable String filterName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipMask") @Nullable String ipMask,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.action = action;
        this.filterName = filterName;
        this.id = id;
        this.ipMask = ipMask;
        this.name = name;
        this.type = type;
    }

    /**
     * The IP Filter Action
     * 
    */
    public Optional<String> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * IP Filter name
     * 
    */
    public Optional<String> getFilterName() {
        return Optional.ofNullable(this.filterName);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * IP Mask
     * 
    */
    public Optional<String> getIpMask() {
        return Optional.ofNullable(this.ipMask);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceIpFilterRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String filterName;
        private String id;
        private @Nullable String ipMask;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceIpFilterRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.filterName = defaults.filterName;
    	      this.id = defaults.id;
    	      this.ipMask = defaults.ipMask;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        public Builder filterName(@Nullable String filterName) {
            this.filterName = filterName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipMask(@Nullable String ipMask) {
            this.ipMask = ipMask;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetNamespaceIpFilterRuleResult build() {
            return new GetNamespaceIpFilterRuleResult(action, filterName, id, ipMask, name, type);
        }
    }
}
