// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.FirewallPolicyLogAnalyticsWorkspaceArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyLogAnalyticsResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyLogAnalyticsResourcesArgs Empty = new FirewallPolicyLogAnalyticsResourcesArgs();

    @InputImport(name="defaultWorkspaceId")
    private final @Nullable Input<SubResourceArgs> defaultWorkspaceId;

    public Input<SubResourceArgs> getDefaultWorkspaceId() {
        return this.defaultWorkspaceId == null ? Input.empty() : this.defaultWorkspaceId;
    }

    @InputImport(name="workspaces")
    private final @Nullable Input<List<FirewallPolicyLogAnalyticsWorkspaceArgs>> workspaces;

    public Input<List<FirewallPolicyLogAnalyticsWorkspaceArgs>> getWorkspaces() {
        return this.workspaces == null ? Input.empty() : this.workspaces;
    }

    public FirewallPolicyLogAnalyticsResourcesArgs(
        @Nullable Input<SubResourceArgs> defaultWorkspaceId,
        @Nullable Input<List<FirewallPolicyLogAnalyticsWorkspaceArgs>> workspaces) {
        this.defaultWorkspaceId = defaultWorkspaceId;
        this.workspaces = workspaces;
    }

    private FirewallPolicyLogAnalyticsResourcesArgs() {
        this.defaultWorkspaceId = Input.empty();
        this.workspaces = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyLogAnalyticsResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SubResourceArgs> defaultWorkspaceId;
        private @Nullable Input<List<FirewallPolicyLogAnalyticsWorkspaceArgs>> workspaces;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyLogAnalyticsResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultWorkspaceId = defaults.defaultWorkspaceId;
    	      this.workspaces = defaults.workspaces;
        }

        public Builder setDefaultWorkspaceId(@Nullable Input<SubResourceArgs> defaultWorkspaceId) {
            this.defaultWorkspaceId = defaultWorkspaceId;
            return this;
        }

        public Builder setDefaultWorkspaceId(@Nullable SubResourceArgs defaultWorkspaceId) {
            this.defaultWorkspaceId = Input.ofNullable(defaultWorkspaceId);
            return this;
        }

        public Builder setWorkspaces(@Nullable Input<List<FirewallPolicyLogAnalyticsWorkspaceArgs>> workspaces) {
            this.workspaces = workspaces;
            return this;
        }

        public Builder setWorkspaces(@Nullable List<FirewallPolicyLogAnalyticsWorkspaceArgs> workspaces) {
            this.workspaces = Input.ofNullable(workspaces);
            return this;
        }

        public FirewallPolicyLogAnalyticsResourcesArgs build() {
            return new FirewallPolicyLogAnalyticsResourcesArgs(defaultWorkspaceId, workspaces);
        }
    }
}
