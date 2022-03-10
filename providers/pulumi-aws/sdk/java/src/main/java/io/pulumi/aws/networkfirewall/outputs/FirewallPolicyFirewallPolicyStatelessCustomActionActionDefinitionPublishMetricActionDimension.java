// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension {
    /**
     * The string value to use in the custom metric dimension.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension(@OutputCustomType.Parameter("value") String value) {
        this.value = value;
    }

    /**
     * The string value to use in the custom metric dimension.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension build() {
            return new FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension(value);
        }
    }
}
