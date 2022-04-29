// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LoadBalancer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerRoutingPolicyRuleAction {
    /**
     * @return (Updatable) Name of the backend set the listener will forward the traffic to.  Example: `backendSetForImages`
     * 
     */
    private final @Nullable String backendSetName;
    /**
     * @return (Updatable) A unique name for the routing policy rule. Avoid entering confidential information.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private LoadBalancerRoutingPolicyRuleAction(
        @CustomType.Parameter("backendSetName") @Nullable String backendSetName,
        @CustomType.Parameter("name") String name) {
        this.backendSetName = backendSetName;
        this.name = name;
    }

    /**
     * @return (Updatable) Name of the backend set the listener will forward the traffic to.  Example: `backendSetForImages`
     * 
     */
    public Optional<String> backendSetName() {
        return Optional.ofNullable(this.backendSetName);
    }
    /**
     * @return (Updatable) A unique name for the routing policy rule. Avoid entering confidential information.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerRoutingPolicyRuleAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backendSetName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerRoutingPolicyRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendSetName = defaults.backendSetName;
    	      this.name = defaults.name;
        }

        public Builder backendSetName(@Nullable String backendSetName) {
            this.backendSetName = backendSetName;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public LoadBalancerRoutingPolicyRuleAction build() {
            return new LoadBalancerRoutingPolicyRuleAction(backendSetName, name);
        }
    }
}
