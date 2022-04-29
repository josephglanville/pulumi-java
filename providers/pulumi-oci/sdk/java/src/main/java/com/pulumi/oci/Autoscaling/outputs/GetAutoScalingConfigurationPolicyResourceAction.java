// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Autoscaling.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAutoScalingConfigurationPolicyResourceAction {
    /**
     * @return The action to take when autoscaling is triggered.
     * 
     */
    private final String action;
    /**
     * @return The type of resource action.
     * 
     */
    private final String actionType;

    @CustomType.Constructor
    private GetAutoScalingConfigurationPolicyResourceAction(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("actionType") String actionType) {
        this.action = action;
        this.actionType = actionType;
    }

    /**
     * @return The action to take when autoscaling is triggered.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return The type of resource action.
     * 
     */
    public String actionType() {
        return this.actionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutoScalingConfigurationPolicyResourceAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String actionType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutoScalingConfigurationPolicyResourceAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.actionType = defaults.actionType;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder actionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }        public GetAutoScalingConfigurationPolicyResourceAction build() {
            return new GetAutoScalingConfigurationPolicyResourceAction(action, actionType);
        }
    }
}
