// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectLambdaAccessPointPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectLambdaAccessPointPolicyArgs Empty = new ObjectLambdaAccessPointPolicyArgs();

    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * The name of the Object Lambda Access Point.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The Object Lambda Access Point resource policy document.
     * 
     */
    @Import(name="policy", required=true)
      private final Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy;
    }

    public ObjectLambdaAccessPointPolicyArgs(
        @Nullable Output<String> accountId,
        @Nullable Output<String> name,
        Output<String> policy) {
        this.accountId = accountId;
        this.name = name;
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
    }

    private ObjectLambdaAccessPointPolicyArgs() {
        this.accountId = Codegen.empty();
        this.name = Codegen.empty();
        this.policy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> name;
        private Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectLambdaAccessPointPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder policy(Output<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Output.of(Objects.requireNonNull(policy));
            return this;
        }        public ObjectLambdaAccessPointPolicyArgs build() {
            return new ObjectLambdaAccessPointPolicyArgs(accountId, name, policy);
        }
    }
}
