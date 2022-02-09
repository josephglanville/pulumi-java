// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.FlowAccessControlConfigurationPolicyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowAccessControlConfigurationResponse {
    private final @Nullable FlowAccessControlConfigurationPolicyResponse actions;
    private final @Nullable FlowAccessControlConfigurationPolicyResponse contents;
    private final @Nullable FlowAccessControlConfigurationPolicyResponse triggers;
    private final @Nullable FlowAccessControlConfigurationPolicyResponse workflowManagement;

    @OutputCustomType.Constructor({"actions","contents","triggers","workflowManagement"})
    private FlowAccessControlConfigurationResponse(
        @Nullable FlowAccessControlConfigurationPolicyResponse actions,
        @Nullable FlowAccessControlConfigurationPolicyResponse contents,
        @Nullable FlowAccessControlConfigurationPolicyResponse triggers,
        @Nullable FlowAccessControlConfigurationPolicyResponse workflowManagement) {
        this.actions = actions;
        this.contents = contents;
        this.triggers = triggers;
        this.workflowManagement = workflowManagement;
    }

    public Optional<FlowAccessControlConfigurationPolicyResponse> getActions() {
        return Optional.ofNullable(this.actions);
    }
    public Optional<FlowAccessControlConfigurationPolicyResponse> getContents() {
        return Optional.ofNullable(this.contents);
    }
    public Optional<FlowAccessControlConfigurationPolicyResponse> getTriggers() {
        return Optional.ofNullable(this.triggers);
    }
    public Optional<FlowAccessControlConfigurationPolicyResponse> getWorkflowManagement() {
        return Optional.ofNullable(this.workflowManagement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowAccessControlConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowAccessControlConfigurationPolicyResponse actions;
        private @Nullable FlowAccessControlConfigurationPolicyResponse contents;
        private @Nullable FlowAccessControlConfigurationPolicyResponse triggers;
        private @Nullable FlowAccessControlConfigurationPolicyResponse workflowManagement;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowAccessControlConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.contents = defaults.contents;
    	      this.triggers = defaults.triggers;
    	      this.workflowManagement = defaults.workflowManagement;
        }

        public Builder setActions(@Nullable FlowAccessControlConfigurationPolicyResponse actions) {
            this.actions = actions;
            return this;
        }

        public Builder setContents(@Nullable FlowAccessControlConfigurationPolicyResponse contents) {
            this.contents = contents;
            return this;
        }

        public Builder setTriggers(@Nullable FlowAccessControlConfigurationPolicyResponse triggers) {
            this.triggers = triggers;
            return this;
        }

        public Builder setWorkflowManagement(@Nullable FlowAccessControlConfigurationPolicyResponse workflowManagement) {
            this.workflowManagement = workflowManagement;
            return this;
        }

        public FlowAccessControlConfigurationResponse build() {
            return new FlowAccessControlConfigurationResponse(actions, contents, triggers, workflowManagement);
        }
    }
}
