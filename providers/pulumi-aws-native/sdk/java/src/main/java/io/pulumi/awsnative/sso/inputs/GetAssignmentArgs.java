// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso.inputs;

import io.pulumi.awsnative.sso.enums.AssignmentPrincipalType;
import io.pulumi.awsnative.sso.enums.AssignmentTargetType;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssignmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAssignmentArgs Empty = new GetAssignmentArgs();

    /**
     * The sso instance that the permission set is owned.
     * 
     */
    @Import(name="instanceArn", required=true)
      private final String instanceArn;

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * The permission set that the assignemt will be assigned
     * 
     */
    @Import(name="permissionSetArn", required=true)
      private final String permissionSetArn;

    public String getPermissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     * The assignee's identifier, user id/group id
     * 
     */
    @Import(name="principalId", required=true)
      private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * The assignee's type, user/group
     * 
     */
    @Import(name="principalType", required=true)
      private final AssignmentPrincipalType principalType;

    public AssignmentPrincipalType getPrincipalType() {
        return this.principalType;
    }

    /**
     * The account id to be provisioned.
     * 
     */
    @Import(name="targetId", required=true)
      private final String targetId;

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * The type of resource to be provsioned to, only aws account now
     * 
     */
    @Import(name="targetType", required=true)
      private final AssignmentTargetType targetType;

    public AssignmentTargetType getTargetType() {
        return this.targetType;
    }

    public GetAssignmentArgs(
        String instanceArn,
        String permissionSetArn,
        String principalId,
        AssignmentPrincipalType principalType,
        String targetId,
        AssignmentTargetType targetType) {
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
        this.permissionSetArn = Objects.requireNonNull(permissionSetArn, "expected parameter 'permissionSetArn' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.principalType = Objects.requireNonNull(principalType, "expected parameter 'principalType' to be non-null");
        this.targetId = Objects.requireNonNull(targetId, "expected parameter 'targetId' to be non-null");
        this.targetType = Objects.requireNonNull(targetType, "expected parameter 'targetType' to be non-null");
    }

    private GetAssignmentArgs() {
        this.instanceArn = null;
        this.permissionSetArn = null;
        this.principalId = null;
        this.principalType = null;
        this.targetId = null;
        this.targetType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceArn;
        private String permissionSetArn;
        private String principalId;
        private AssignmentPrincipalType principalType;
        private String targetId;
        private AssignmentTargetType targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceArn = defaults.instanceArn;
    	      this.permissionSetArn = defaults.permissionSetArn;
    	      this.principalId = defaults.principalId;
    	      this.principalType = defaults.principalType;
    	      this.targetId = defaults.targetId;
    	      this.targetType = defaults.targetType;
        }

        public Builder instanceArn(String instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }
        public Builder permissionSetArn(String permissionSetArn) {
            this.permissionSetArn = Objects.requireNonNull(permissionSetArn);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder principalType(AssignmentPrincipalType principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }
        public Builder targetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }
        public Builder targetType(AssignmentTargetType targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }        public GetAssignmentArgs build() {
            return new GetAssignmentArgs(instanceArn, permissionSetArn, principalId, principalType, targetId, targetType);
        }
    }
}
