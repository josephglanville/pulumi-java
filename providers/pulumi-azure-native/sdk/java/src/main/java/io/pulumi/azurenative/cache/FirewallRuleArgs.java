// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallRuleArgs Empty = new FirewallRuleArgs();

    /**
     * The name of the Redis cache.
     * 
     */
    @InputImport(name="cacheName", required=true)
      private final Input<String> cacheName;

    public Input<String> getCacheName() {
        return this.cacheName;
    }

    /**
     * highest IP address included in the range
     * 
     */
    @InputImport(name="endIP", required=true)
      private final Input<String> endIP;

    public Input<String> getEndIP() {
        return this.endIP;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the firewall rule.
     * 
     */
    @InputImport(name="ruleName")
      private final @Nullable Input<String> ruleName;

    public Input<String> getRuleName() {
        return this.ruleName == null ? Input.empty() : this.ruleName;
    }

    /**
     * lowest IP address included in the range
     * 
     */
    @InputImport(name="startIP", required=true)
      private final Input<String> startIP;

    public Input<String> getStartIP() {
        return this.startIP;
    }

    public FirewallRuleArgs(
        Input<String> cacheName,
        Input<String> endIP,
        Input<String> resourceGroupName,
        @Nullable Input<String> ruleName,
        Input<String> startIP) {
        this.cacheName = Objects.requireNonNull(cacheName, "expected parameter 'cacheName' to be non-null");
        this.endIP = Objects.requireNonNull(endIP, "expected parameter 'endIP' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = ruleName;
        this.startIP = Objects.requireNonNull(startIP, "expected parameter 'startIP' to be non-null");
    }

    private FirewallRuleArgs() {
        this.cacheName = Input.empty();
        this.endIP = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleName = Input.empty();
        this.startIP = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cacheName;
        private Input<String> endIP;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> ruleName;
        private Input<String> startIP;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheName = defaults.cacheName;
    	      this.endIP = defaults.endIP;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
    	      this.startIP = defaults.startIP;
        }

        public Builder setCacheName(Input<String> cacheName) {
            this.cacheName = Objects.requireNonNull(cacheName);
            return this;
        }

        public Builder setCacheName(String cacheName) {
            this.cacheName = Input.of(Objects.requireNonNull(cacheName));
            return this;
        }

        public Builder setEndIP(Input<String> endIP) {
            this.endIP = Objects.requireNonNull(endIP);
            return this;
        }

        public Builder setEndIP(String endIP) {
            this.endIP = Input.of(Objects.requireNonNull(endIP));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRuleName(@Nullable Input<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public Builder setRuleName(@Nullable String ruleName) {
            this.ruleName = Input.ofNullable(ruleName);
            return this;
        }

        public Builder setStartIP(Input<String> startIP) {
            this.startIP = Objects.requireNonNull(startIP);
            return this;
        }

        public Builder setStartIP(String startIP) {
            this.startIP = Input.of(Objects.requireNonNull(startIP));
            return this;
        }
        public FirewallRuleArgs build() {
            return new FirewallRuleArgs(cacheName, endIP, resourceGroupName, ruleName, startIP);
        }
    }
}
