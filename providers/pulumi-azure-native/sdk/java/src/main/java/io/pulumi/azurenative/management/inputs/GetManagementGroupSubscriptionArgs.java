// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetManagementGroupSubscriptionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetManagementGroupSubscriptionArgs Empty = new GetManagementGroupSubscriptionArgs();

    /**
     * Management Group ID.
     * 
     */
    @Import(name="groupId", required=true)
      private final String groupId;

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Subscription ID.
     * 
     */
    @Import(name="subscriptionId")
      private final @Nullable String subscriptionId;

    public Optional<String> getSubscriptionId() {
        return this.subscriptionId == null ? Optional.empty() : Optional.ofNullable(this.subscriptionId);
    }

    public GetManagementGroupSubscriptionArgs(
        String groupId,
        @Nullable String subscriptionId) {
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
        this.subscriptionId = subscriptionId;
    }

    private GetManagementGroupSubscriptionArgs() {
        this.groupId = null;
        this.subscriptionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagementGroupSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupId;
        private @Nullable String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagementGroupSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }        public GetManagementGroupSubscriptionArgs build() {
            return new GetManagementGroupSubscriptionArgs(groupId, subscriptionId);
        }
    }
}
