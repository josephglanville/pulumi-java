// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectLambdaAccessPointPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ObjectLambdaAccessPointPolicyState Empty = new ObjectLambdaAccessPointPolicyState();

    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Output.empty() : this.accountId;
    }

    /**
     * Indicates whether this access point currently has a policy that allows public access.
     * 
     */
    @Import(name="hasPublicAccessPolicy")
      private final @Nullable Output<Boolean> hasPublicAccessPolicy;

    public Output<Boolean> getHasPublicAccessPolicy() {
        return this.hasPublicAccessPolicy == null ? Output.empty() : this.hasPublicAccessPolicy;
    }

    /**
     * The name of the Object Lambda Access Point.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The Object Lambda Access Point resource policy document.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    public ObjectLambdaAccessPointPolicyState(
        @Nullable Output<String> accountId,
        @Nullable Output<Boolean> hasPublicAccessPolicy,
        @Nullable Output<String> name,
        @Nullable Output<String> policy) {
        this.accountId = accountId;
        this.hasPublicAccessPolicy = hasPublicAccessPolicy;
        this.name = name;
        this.policy = policy;
    }

    private ObjectLambdaAccessPointPolicyState() {
        this.accountId = Output.empty();
        this.hasPublicAccessPolicy = Output.empty();
        this.name = Output.empty();
        this.policy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<Boolean> hasPublicAccessPolicy;
        private @Nullable Output<String> name;
        private @Nullable Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectLambdaAccessPointPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.hasPublicAccessPolicy = defaults.hasPublicAccessPolicy;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Output.ofNullable(accountId);
            return this;
        }
        public Builder hasPublicAccessPolicy(@Nullable Output<Boolean> hasPublicAccessPolicy) {
            this.hasPublicAccessPolicy = hasPublicAccessPolicy;
            return this;
        }
        public Builder hasPublicAccessPolicy(@Nullable Boolean hasPublicAccessPolicy) {
            this.hasPublicAccessPolicy = Output.ofNullable(hasPublicAccessPolicy);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Output.ofNullable(policy);
            return this;
        }        public ObjectLambdaAccessPointPolicyState build() {
            return new ObjectLambdaAccessPointPolicyState(accountId, hasPublicAccessPolicy, name, policy);
        }
    }
}