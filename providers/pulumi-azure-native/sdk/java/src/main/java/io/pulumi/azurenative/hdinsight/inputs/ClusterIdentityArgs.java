// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.enums.ResourceIdentityType;
import io.pulumi.azurenative.hdinsight.inputs.ClusterIdentityUserAssignedIdentitiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identity for the cluster.
 * 
 */
public final class ClusterIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterIdentityArgs Empty = new ClusterIdentityArgs();

    /**
     * The type of identity used for the cluster. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user assigned identities.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<ResourceIdentityType> type;

    public Input<ResourceIdentityType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The list of user identities associated with the cluster. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    @InputImport(name="userAssignedIdentities")
      private final @Nullable Input<Map<String,ClusterIdentityUserAssignedIdentitiesArgs>> userAssignedIdentities;

    public Input<Map<String,ClusterIdentityUserAssignedIdentitiesArgs>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Input.empty() : this.userAssignedIdentities;
    }

    public ClusterIdentityArgs(
        @Nullable Input<ResourceIdentityType> type,
        @Nullable Input<Map<String,ClusterIdentityUserAssignedIdentitiesArgs>> userAssignedIdentities) {
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private ClusterIdentityArgs() {
        this.type = Input.empty();
        this.userAssignedIdentities = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourceIdentityType> type;
        private @Nullable Input<Map<String,ClusterIdentityUserAssignedIdentitiesArgs>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setType(@Nullable Input<ResourceIdentityType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable ResourceIdentityType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Input<Map<String,ClusterIdentityUserAssignedIdentitiesArgs>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,ClusterIdentityUserAssignedIdentitiesArgs> userAssignedIdentities) {
            this.userAssignedIdentities = Input.ofNullable(userAssignedIdentities);
            return this;
        }
        public ClusterIdentityArgs build() {
            return new ClusterIdentityArgs(type, userAssignedIdentities);
        }
    }
}
