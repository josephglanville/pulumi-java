// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketIAMMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketIAMMemberArgs Empty = new BucketIAMMemberArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<BucketIAMMemberConditionArgs> condition;

    public Output<BucketIAMMemberConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    @Import(name="member", required=true)
      private final Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.storage.BucketIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public BucketIAMMemberArgs(
        Output<String> bucket,
        @Nullable Output<BucketIAMMemberConditionArgs> condition,
        Output<String> member,
        Output<String> role) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private BucketIAMMemberArgs() {
        this.bucket = Output.empty();
        this.condition = Output.empty();
        this.member = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIAMMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<BucketIAMMemberConditionArgs> condition;
        private Output<String> member;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIAMMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public Builder condition(@Nullable Output<BucketIAMMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable BucketIAMMemberConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }
        public Builder member(Output<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }
        public Builder member(String member) {
            this.member = Output.of(Objects.requireNonNull(member));
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }        public BucketIAMMemberArgs build() {
            return new BucketIAMMemberArgs(bucket, condition, member, role);
        }
    }
}
