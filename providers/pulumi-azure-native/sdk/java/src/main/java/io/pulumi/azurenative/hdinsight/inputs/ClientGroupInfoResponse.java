// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The information of AAD security group.
 * 
 */
public final class ClientGroupInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClientGroupInfoResponse Empty = new ClientGroupInfoResponse();

    /**
     * The AAD security group id.
     * 
     */
    @Import(name="groupId")
      private final @Nullable String groupId;

    public Optional<String> getGroupId() {
        return this.groupId == null ? Optional.empty() : Optional.ofNullable(this.groupId);
    }

    /**
     * The AAD security group name.
     * 
     */
    @Import(name="groupName")
      private final @Nullable String groupName;

    public Optional<String> getGroupName() {
        return this.groupName == null ? Optional.empty() : Optional.ofNullable(this.groupName);
    }

    public ClientGroupInfoResponse(
        @Nullable String groupId,
        @Nullable String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    private ClientGroupInfoResponse() {
        this.groupId = null;
        this.groupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientGroupInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String groupId;
        private @Nullable String groupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientGroupInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.groupName = defaults.groupName;
        }

        public Builder groupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }
        public Builder groupName(@Nullable String groupName) {
            this.groupName = groupName;
            return this;
        }        public ClientGroupInfoResponse build() {
            return new ClientGroupInfoResponse(groupId, groupName);
        }
    }
}
