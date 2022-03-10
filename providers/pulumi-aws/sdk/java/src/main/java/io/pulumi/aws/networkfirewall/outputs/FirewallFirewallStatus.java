// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.aws.networkfirewall.outputs.FirewallFirewallStatusSyncState;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallFirewallStatus {
    /**
     * Set of subnets configured for use by the firewall.
     * 
     */
    private final @Nullable List<FirewallFirewallStatusSyncState> syncStates;

    @OutputCustomType.Constructor
    private FirewallFirewallStatus(@OutputCustomType.Parameter("syncStates") @Nullable List<FirewallFirewallStatusSyncState> syncStates) {
        this.syncStates = syncStates;
    }

    /**
     * Set of subnets configured for use by the firewall.
     * 
    */
    public List<FirewallFirewallStatusSyncState> getSyncStates() {
        return this.syncStates == null ? List.of() : this.syncStates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallFirewallStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FirewallFirewallStatusSyncState> syncStates;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallFirewallStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.syncStates = defaults.syncStates;
        }

        public Builder setSyncStates(@Nullable List<FirewallFirewallStatusSyncState> syncStates) {
            this.syncStates = syncStates;
            return this;
        }
        public FirewallFirewallStatus build() {
            return new FirewallFirewallStatus(syncStates);
        }
    }
}
