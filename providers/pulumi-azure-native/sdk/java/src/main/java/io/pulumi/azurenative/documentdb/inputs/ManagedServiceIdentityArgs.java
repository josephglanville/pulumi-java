// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.enums.ResourceIdentityType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identity for the resource.
 * 
 */
public final class ManagedServiceIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedServiceIdentityArgs Empty = new ManagedServiceIdentityArgs();

    /**
     * The type of identity used for the resource. The type 'SystemAssigned,UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any identities from the service.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<ResourceIdentityType> type;

    public Output<ResourceIdentityType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * The list of user identities associated with resource. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    @Import(name="userAssignedIdentities")
      private final @Nullable Output<Map<String,Object>> userAssignedIdentities;

    public Output<Map<String,Object>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Output.empty() : this.userAssignedIdentities;
    }

    public ManagedServiceIdentityArgs(
        @Nullable Output<ResourceIdentityType> type,
        @Nullable Output<Map<String,Object>> userAssignedIdentities) {
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private ManagedServiceIdentityArgs() {
        this.type = Output.empty();
        this.userAssignedIdentities = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedServiceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourceIdentityType> type;
        private @Nullable Output<Map<String,Object>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedServiceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder type(@Nullable Output<ResourceIdentityType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable ResourceIdentityType type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Output<Map<String,Object>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Map<String,Object> userAssignedIdentities) {
            this.userAssignedIdentities = Output.ofNullable(userAssignedIdentities);
            return this;
        }        public ManagedServiceIdentityArgs build() {
            return new ManagedServiceIdentityArgs(type, userAssignedIdentities);
        }
    }
}
