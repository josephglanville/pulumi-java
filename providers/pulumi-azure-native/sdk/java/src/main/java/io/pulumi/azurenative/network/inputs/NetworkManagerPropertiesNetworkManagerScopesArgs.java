// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Scope of Network Manager.
 * 
 */
public final class NetworkManagerPropertiesNetworkManagerScopesArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkManagerPropertiesNetworkManagerScopesArgs Empty = new NetworkManagerPropertiesNetworkManagerScopesArgs();

    /**
     * List of management groups.
     * 
     */
    @Import(name="managementGroups")
      private final @Nullable Output<List<String>> managementGroups;

    public Output<List<String>> getManagementGroups() {
        return this.managementGroups == null ? Output.empty() : this.managementGroups;
    }

    /**
     * List of subscriptions.
     * 
     */
    @Import(name="subscriptions")
      private final @Nullable Output<List<String>> subscriptions;

    public Output<List<String>> getSubscriptions() {
        return this.subscriptions == null ? Output.empty() : this.subscriptions;
    }

    public NetworkManagerPropertiesNetworkManagerScopesArgs(
        @Nullable Output<List<String>> managementGroups,
        @Nullable Output<List<String>> subscriptions) {
        this.managementGroups = managementGroups;
        this.subscriptions = subscriptions;
    }

    private NetworkManagerPropertiesNetworkManagerScopesArgs() {
        this.managementGroups = Output.empty();
        this.subscriptions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkManagerPropertiesNetworkManagerScopesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> managementGroups;
        private @Nullable Output<List<String>> subscriptions;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkManagerPropertiesNetworkManagerScopesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementGroups = defaults.managementGroups;
    	      this.subscriptions = defaults.subscriptions;
        }

        public Builder managementGroups(@Nullable Output<List<String>> managementGroups) {
            this.managementGroups = managementGroups;
            return this;
        }
        public Builder managementGroups(@Nullable List<String> managementGroups) {
            this.managementGroups = Output.ofNullable(managementGroups);
            return this;
        }
        public Builder managementGroups(String... managementGroups) {
            return managementGroups(List.of(managementGroups));
        }
        public Builder subscriptions(@Nullable Output<List<String>> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }
        public Builder subscriptions(@Nullable List<String> subscriptions) {
            this.subscriptions = Output.ofNullable(subscriptions);
            return this;
        }
        public Builder subscriptions(String... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }        public NetworkManagerPropertiesNetworkManagerScopesArgs build() {
            return new NetworkManagerPropertiesNetworkManagerScopesArgs(managementGroups, subscriptions);
        }
    }
}
