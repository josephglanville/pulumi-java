// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Autoscaling.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAutoScalingConfigurationsAutoScalingConfigurationPolicyRuleAction {
    /**
     * @return The type of action to take.
     * 
     */
    private final String type;
    private final Integer value;

    @CustomType.Constructor
    private GetAutoScalingConfigurationsAutoScalingConfigurationPolicyRuleAction(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") Integer value) {
        this.type = type;
        this.value = value;
    }

    /**
     * @return The type of action to take.
     * 
     */
    public String type() {
        return this.type;
    }
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutoScalingConfigurationsAutoScalingConfigurationPolicyRuleAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutoScalingConfigurationsAutoScalingConfigurationPolicyRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetAutoScalingConfigurationsAutoScalingConfigurationPolicyRuleAction build() {
            return new GetAutoScalingConfigurationsAutoScalingConfigurationPolicyRuleAction(type, value);
        }
    }
}
