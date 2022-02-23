// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IP Rule to be applied as part of Network Rule Set
 * 
 */
public final class NetworkRuleSetIpRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkRuleSetIpRuleResponse Empty = new NetworkRuleSetIpRuleResponse();

    /**
     * IP Filter Action
     * 
     */
    @InputImport(name="action")
      private final @Nullable String action;

    public Optional<String> getAction() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * Name of the IP filter rule.
     * 
     */
    @InputImport(name="filterName", required=true)
      private final String filterName;

    public String getFilterName() {
        return this.filterName;
    }

    /**
     * A string that contains the IP address range in CIDR notation for the rule.
     * 
     */
    @InputImport(name="ipMask", required=true)
      private final String ipMask;

    public String getIpMask() {
        return this.ipMask;
    }

    public NetworkRuleSetIpRuleResponse(
        @Nullable String action,
        String filterName,
        String ipMask) {
        this.action = action == null ? "Allow" : action;
        this.filterName = Objects.requireNonNull(filterName, "expected parameter 'filterName' to be non-null");
        this.ipMask = Objects.requireNonNull(ipMask, "expected parameter 'ipMask' to be non-null");
    }

    private NetworkRuleSetIpRuleResponse() {
        this.action = null;
        this.filterName = null;
        this.ipMask = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetIpRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private String filterName;
        private String ipMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetIpRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.filterName = defaults.filterName;
    	      this.ipMask = defaults.ipMask;
        }

        public Builder setAction(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder setFilterName(String filterName) {
            this.filterName = Objects.requireNonNull(filterName);
            return this;
        }

        public Builder setIpMask(String ipMask) {
            this.ipMask = Objects.requireNonNull(ipMask);
            return this;
        }
        public NetworkRuleSetIpRuleResponse build() {
            return new NetworkRuleSetIpRuleResponse(action, filterName, ipMask);
        }
    }
}
