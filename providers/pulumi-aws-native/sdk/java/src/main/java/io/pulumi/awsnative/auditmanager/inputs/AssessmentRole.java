// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager.inputs;

import io.pulumi.awsnative.auditmanager.enums.AssessmentRoleType;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The wrapper that contains AWS Audit Manager role information, such as the role type and IAM ARN.
 * 
 */
public final class AssessmentRole extends io.pulumi.resources.InvokeArgs {

    public static final AssessmentRole Empty = new AssessmentRole();

    @Import(name="roleArn")
      private final @Nullable String roleArn;

    public Optional<String> getRoleArn() {
        return this.roleArn == null ? Optional.empty() : Optional.ofNullable(this.roleArn);
    }

    @Import(name="roleType")
      private final @Nullable AssessmentRoleType roleType;

    public Optional<AssessmentRoleType> getRoleType() {
        return this.roleType == null ? Optional.empty() : Optional.ofNullable(this.roleType);
    }

    public AssessmentRole(
        @Nullable String roleArn,
        @Nullable AssessmentRoleType roleType) {
        this.roleArn = roleArn;
        this.roleType = roleType;
    }

    private AssessmentRole() {
        this.roleArn = null;
        this.roleType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentRole defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String roleArn;
        private @Nullable AssessmentRoleType roleType;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.roleType = defaults.roleType;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleType(@Nullable AssessmentRoleType roleType) {
            this.roleType = roleType;
            return this;
        }        public AssessmentRole build() {
            return new AssessmentRole(roleArn, roleType);
        }
    }
}
