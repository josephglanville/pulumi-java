// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssoadmin;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountAssignmentArgs Empty = new AccountAssignmentArgs();

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance.
     * 
     */
    @Import(name="instanceArn", required=true)
      private final Output<String> instanceArn;

    public Output<String> getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Permission Set that the admin wants to grant the principal access to.
     * 
     */
    @Import(name="permissionSetArn", required=true)
      private final Output<String> permissionSetArn;

    public Output<String> getPermissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     * An identifier for an object in SSO, such as a user or group. PrincipalIds are GUIDs (For example, `f81d4fae-7dec-11d0-a765-00a0c91e6bf6`).
     * 
     */
    @Import(name="principalId", required=true)
      private final Output<String> principalId;

    public Output<String> getPrincipalId() {
        return this.principalId;
    }

    /**
     * The entity type for which the assignment will be created. Valid values: `USER`, `GROUP`.
     * 
     */
    @Import(name="principalType", required=true)
      private final Output<String> principalType;

    public Output<String> getPrincipalType() {
        return this.principalType;
    }

    /**
     * An AWS account identifier, typically a 10-12 digit string.
     * 
     */
    @Import(name="targetId", required=true)
      private final Output<String> targetId;

    public Output<String> getTargetId() {
        return this.targetId;
    }

    /**
     * The entity type for which the assignment will be created. Valid values: `AWS_ACCOUNT`.
     * 
     */
    @Import(name="targetType")
      private final @Nullable Output<String> targetType;

    public Output<String> getTargetType() {
        return this.targetType == null ? Output.empty() : this.targetType;
    }

    public AccountAssignmentArgs(
        Output<String> instanceArn,
        Output<String> permissionSetArn,
        Output<String> principalId,
        Output<String> principalType,
        Output<String> targetId,
        @Nullable Output<String> targetType) {
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
        this.permissionSetArn = Objects.requireNonNull(permissionSetArn, "expected parameter 'permissionSetArn' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.principalType = Objects.requireNonNull(principalType, "expected parameter 'principalType' to be non-null");
        this.targetId = Objects.requireNonNull(targetId, "expected parameter 'targetId' to be non-null");
        this.targetType = targetType;
    }

    private AccountAssignmentArgs() {
        this.instanceArn = Output.empty();
        this.permissionSetArn = Output.empty();
        this.principalId = Output.empty();
        this.principalType = Output.empty();
        this.targetId = Output.empty();
        this.targetType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> instanceArn;
        private Output<String> permissionSetArn;
        private Output<String> principalId;
        private Output<String> principalType;
        private Output<String> targetId;
        private @Nullable Output<String> targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceArn = defaults.instanceArn;
    	      this.permissionSetArn = defaults.permissionSetArn;
    	      this.principalId = defaults.principalId;
    	      this.principalType = defaults.principalType;
    	      this.targetId = defaults.targetId;
    	      this.targetType = defaults.targetType;
        }

        public Builder instanceArn(Output<String> instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }
        public Builder instanceArn(String instanceArn) {
            this.instanceArn = Output.of(Objects.requireNonNull(instanceArn));
            return this;
        }
        public Builder permissionSetArn(Output<String> permissionSetArn) {
            this.permissionSetArn = Objects.requireNonNull(permissionSetArn);
            return this;
        }
        public Builder permissionSetArn(String permissionSetArn) {
            this.permissionSetArn = Output.of(Objects.requireNonNull(permissionSetArn));
            return this;
        }
        public Builder principalId(Output<String> principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Output.of(Objects.requireNonNull(principalId));
            return this;
        }
        public Builder principalType(Output<String> principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }
        public Builder principalType(String principalType) {
            this.principalType = Output.of(Objects.requireNonNull(principalType));
            return this;
        }
        public Builder targetId(Output<String> targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }
        public Builder targetId(String targetId) {
            this.targetId = Output.of(Objects.requireNonNull(targetId));
            return this;
        }
        public Builder targetType(@Nullable Output<String> targetType) {
            this.targetType = targetType;
            return this;
        }
        public Builder targetType(@Nullable String targetType) {
            this.targetType = Output.ofNullable(targetType);
            return this;
        }        public AccountAssignmentArgs build() {
            return new AccountAssignmentArgs(instanceArn, permissionSetArn, principalId, principalType, targetId, targetType);
        }
    }
}
