// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessReviewScopeResponse extends io.pulumi.resources.InvokeArgs {

    public static final AccessReviewScopeResponse Empty = new AccessReviewScopeResponse();

    @InputImport(name="assignmentState", required=true)
    private final String assignmentState;

    public String getAssignmentState() {
        return this.assignmentState;
    }

    @InputImport(name="expandNestedMemberships")
    private final @Nullable Boolean expandNestedMemberships;

    public Optional<Boolean> getExpandNestedMemberships() {
        return this.expandNestedMemberships == null ? Optional.empty() : Optional.ofNullable(this.expandNestedMemberships);
    }

    @InputImport(name="inactiveDuration")
    private final @Nullable String inactiveDuration;

    public Optional<String> getInactiveDuration() {
        return this.inactiveDuration == null ? Optional.empty() : Optional.ofNullable(this.inactiveDuration);
    }

    @InputImport(name="principalType", required=true)
    private final String principalType;

    public String getPrincipalType() {
        return this.principalType;
    }

    @InputImport(name="resourceId", required=true)
    private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    @InputImport(name="roleDefinitionId", required=true)
    private final String roleDefinitionId;

    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    public AccessReviewScopeResponse(
        String assignmentState,
        @Nullable Boolean expandNestedMemberships,
        @Nullable String inactiveDuration,
        String principalType,
        String resourceId,
        String roleDefinitionId) {
        this.assignmentState = Objects.requireNonNull(assignmentState, "expected parameter 'assignmentState' to be non-null");
        this.expandNestedMemberships = expandNestedMemberships;
        this.inactiveDuration = inactiveDuration;
        this.principalType = Objects.requireNonNull(principalType, "expected parameter 'principalType' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId, "expected parameter 'roleDefinitionId' to be non-null");
    }

    private AccessReviewScopeResponse() {
        this.assignmentState = null;
        this.expandNestedMemberships = null;
        this.inactiveDuration = null;
        this.principalType = null;
        this.resourceId = null;
        this.roleDefinitionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessReviewScopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assignmentState;
        private @Nullable Boolean expandNestedMemberships;
        private @Nullable String inactiveDuration;
        private String principalType;
        private String resourceId;
        private String roleDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessReviewScopeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignmentState = defaults.assignmentState;
    	      this.expandNestedMemberships = defaults.expandNestedMemberships;
    	      this.inactiveDuration = defaults.inactiveDuration;
    	      this.principalType = defaults.principalType;
    	      this.resourceId = defaults.resourceId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
        }

        public Builder setAssignmentState(String assignmentState) {
            this.assignmentState = Objects.requireNonNull(assignmentState);
            return this;
        }

        public Builder setExpandNestedMemberships(@Nullable Boolean expandNestedMemberships) {
            this.expandNestedMemberships = expandNestedMemberships;
            return this;
        }

        public Builder setInactiveDuration(@Nullable String inactiveDuration) {
            this.inactiveDuration = inactiveDuration;
            return this;
        }

        public Builder setPrincipalType(String principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setRoleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }

        public AccessReviewScopeResponse build() {
            return new AccessReviewScopeResponse(assignmentState, expandNestedMemberships, inactiveDuration, principalType, resourceId, roleDefinitionId);
        }
    }
}
