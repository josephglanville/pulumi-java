// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.GetBuildRunBuildRunSourceTriggerInfoAction;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBuildRunBuildRunSourceTriggerInfo {
    /**
     * @return The list of actions that are to be performed for this Trigger
     * 
     */
    private final List<GetBuildRunBuildRunSourceTriggerInfoAction> actions;
    /**
     * @return Build run display name, which can be renamed and is not necessarily unique. Avoid entering confidential information.
     * 
     */
    private final String displayName;

    @CustomType.Constructor
    private GetBuildRunBuildRunSourceTriggerInfo(
        @CustomType.Parameter("actions") List<GetBuildRunBuildRunSourceTriggerInfoAction> actions,
        @CustomType.Parameter("displayName") String displayName) {
        this.actions = actions;
        this.displayName = displayName;
    }

    /**
     * @return The list of actions that are to be performed for this Trigger
     * 
     */
    public List<GetBuildRunBuildRunSourceTriggerInfoAction> actions() {
        return this.actions;
    }
    /**
     * @return Build run display name, which can be renamed and is not necessarily unique. Avoid entering confidential information.
     * 
     */
    public String displayName() {
        return this.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBuildRunBuildRunSourceTriggerInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetBuildRunBuildRunSourceTriggerInfoAction> actions;
        private String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBuildRunBuildRunSourceTriggerInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.displayName = defaults.displayName;
        }

        public Builder actions(List<GetBuildRunBuildRunSourceTriggerInfoAction> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(GetBuildRunBuildRunSourceTriggerInfoAction... actions) {
            return actions(List.of(actions));
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }        public GetBuildRunBuildRunSourceTriggerInfo build() {
            return new GetBuildRunBuildRunSourceTriggerInfo(actions, displayName);
        }
    }
}
