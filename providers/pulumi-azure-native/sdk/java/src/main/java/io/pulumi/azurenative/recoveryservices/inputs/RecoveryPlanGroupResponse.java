// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanActionResponse;
import io.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanProtectedItemResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Recovery plan group details.
 * 
 */
public final class RecoveryPlanGroupResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecoveryPlanGroupResponse Empty = new RecoveryPlanGroupResponse();

    /**
     * The end group actions.
     * 
     */
    @Import(name="endGroupActions")
      private final @Nullable List<RecoveryPlanActionResponse> endGroupActions;

    public List<RecoveryPlanActionResponse> getEndGroupActions() {
        return this.endGroupActions == null ? List.of() : this.endGroupActions;
    }

    /**
     * The group type.
     * 
     */
    @Import(name="groupType", required=true)
      private final String groupType;

    public String getGroupType() {
        return this.groupType;
    }

    /**
     * The list of protected items.
     * 
     */
    @Import(name="replicationProtectedItems")
      private final @Nullable List<RecoveryPlanProtectedItemResponse> replicationProtectedItems;

    public List<RecoveryPlanProtectedItemResponse> getReplicationProtectedItems() {
        return this.replicationProtectedItems == null ? List.of() : this.replicationProtectedItems;
    }

    /**
     * The start group actions.
     * 
     */
    @Import(name="startGroupActions")
      private final @Nullable List<RecoveryPlanActionResponse> startGroupActions;

    public List<RecoveryPlanActionResponse> getStartGroupActions() {
        return this.startGroupActions == null ? List.of() : this.startGroupActions;
    }

    public RecoveryPlanGroupResponse(
        @Nullable List<RecoveryPlanActionResponse> endGroupActions,
        String groupType,
        @Nullable List<RecoveryPlanProtectedItemResponse> replicationProtectedItems,
        @Nullable List<RecoveryPlanActionResponse> startGroupActions) {
        this.endGroupActions = endGroupActions;
        this.groupType = Objects.requireNonNull(groupType, "expected parameter 'groupType' to be non-null");
        this.replicationProtectedItems = replicationProtectedItems;
        this.startGroupActions = startGroupActions;
    }

    private RecoveryPlanGroupResponse() {
        this.endGroupActions = List.of();
        this.groupType = null;
        this.replicationProtectedItems = List.of();
        this.startGroupActions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RecoveryPlanActionResponse> endGroupActions;
        private String groupType;
        private @Nullable List<RecoveryPlanProtectedItemResponse> replicationProtectedItems;
        private @Nullable List<RecoveryPlanActionResponse> startGroupActions;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endGroupActions = defaults.endGroupActions;
    	      this.groupType = defaults.groupType;
    	      this.replicationProtectedItems = defaults.replicationProtectedItems;
    	      this.startGroupActions = defaults.startGroupActions;
        }

        public Builder endGroupActions(@Nullable List<RecoveryPlanActionResponse> endGroupActions) {
            this.endGroupActions = endGroupActions;
            return this;
        }
        public Builder endGroupActions(RecoveryPlanActionResponse... endGroupActions) {
            return endGroupActions(List.of(endGroupActions));
        }
        public Builder groupType(String groupType) {
            this.groupType = Objects.requireNonNull(groupType);
            return this;
        }
        public Builder replicationProtectedItems(@Nullable List<RecoveryPlanProtectedItemResponse> replicationProtectedItems) {
            this.replicationProtectedItems = replicationProtectedItems;
            return this;
        }
        public Builder replicationProtectedItems(RecoveryPlanProtectedItemResponse... replicationProtectedItems) {
            return replicationProtectedItems(List.of(replicationProtectedItems));
        }
        public Builder startGroupActions(@Nullable List<RecoveryPlanActionResponse> startGroupActions) {
            this.startGroupActions = startGroupActions;
            return this;
        }
        public Builder startGroupActions(RecoveryPlanActionResponse... startGroupActions) {
            return startGroupActions(List.of(startGroupActions));
        }        public RecoveryPlanGroupResponse build() {
            return new RecoveryPlanGroupResponse(endGroupActions, groupType, replicationProtectedItems, startGroupActions);
        }
    }
}
