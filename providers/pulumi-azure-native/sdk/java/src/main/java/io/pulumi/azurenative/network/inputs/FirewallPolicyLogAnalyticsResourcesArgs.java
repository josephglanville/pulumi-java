// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.FirewallPolicyLogAnalyticsWorkspaceArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Log Analytics Resources for Firewall Policy Insights.
 * 
 */
public final class FirewallPolicyLogAnalyticsResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyLogAnalyticsResourcesArgs Empty = new FirewallPolicyLogAnalyticsResourcesArgs();

    /**
     * The default workspace Id for Firewall Policy Insights.
     * 
     */
    @Import(name="defaultWorkspaceId")
      private final @Nullable Output<SubResourceArgs> defaultWorkspaceId;

    public Output<SubResourceArgs> getDefaultWorkspaceId() {
        return this.defaultWorkspaceId == null ? Output.empty() : this.defaultWorkspaceId;
    }

    /**
     * List of workspaces for Firewall Policy Insights.
     * 
     */
    @Import(name="workspaces")
      private final @Nullable Output<List<FirewallPolicyLogAnalyticsWorkspaceArgs>> workspaces;

    public Output<List<FirewallPolicyLogAnalyticsWorkspaceArgs>> getWorkspaces() {
        return this.workspaces == null ? Output.empty() : this.workspaces;
    }

    public FirewallPolicyLogAnalyticsResourcesArgs(
        @Nullable Output<SubResourceArgs> defaultWorkspaceId,
        @Nullable Output<List<FirewallPolicyLogAnalyticsWorkspaceArgs>> workspaces) {
        this.defaultWorkspaceId = defaultWorkspaceId;
        this.workspaces = workspaces;
    }

    private FirewallPolicyLogAnalyticsResourcesArgs() {
        this.defaultWorkspaceId = Output.empty();
        this.workspaces = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyLogAnalyticsResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SubResourceArgs> defaultWorkspaceId;
        private @Nullable Output<List<FirewallPolicyLogAnalyticsWorkspaceArgs>> workspaces;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyLogAnalyticsResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultWorkspaceId = defaults.defaultWorkspaceId;
    	      this.workspaces = defaults.workspaces;
        }

        public Builder defaultWorkspaceId(@Nullable Output<SubResourceArgs> defaultWorkspaceId) {
            this.defaultWorkspaceId = defaultWorkspaceId;
            return this;
        }
        public Builder defaultWorkspaceId(@Nullable SubResourceArgs defaultWorkspaceId) {
            this.defaultWorkspaceId = Output.ofNullable(defaultWorkspaceId);
            return this;
        }
        public Builder workspaces(@Nullable Output<List<FirewallPolicyLogAnalyticsWorkspaceArgs>> workspaces) {
            this.workspaces = workspaces;
            return this;
        }
        public Builder workspaces(@Nullable List<FirewallPolicyLogAnalyticsWorkspaceArgs> workspaces) {
            this.workspaces = Output.ofNullable(workspaces);
            return this;
        }
        public Builder workspaces(FirewallPolicyLogAnalyticsWorkspaceArgs... workspaces) {
            return workspaces(List.of(workspaces));
        }        public FirewallPolicyLogAnalyticsResourcesArgs build() {
            return new FirewallPolicyLogAnalyticsResourcesArgs(defaultWorkspaceId, workspaces);
        }
    }
}
