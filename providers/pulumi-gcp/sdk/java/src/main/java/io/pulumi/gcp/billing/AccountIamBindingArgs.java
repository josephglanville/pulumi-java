// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.billing.inputs.AccountIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountIamBindingArgs Empty = new AccountIamBindingArgs();

    @Import(name="billingAccountId", required=true)
      private final Output<String> billingAccountId;

    public Output<String> getBillingAccountId() {
        return this.billingAccountId;
    }

    @Import(name="condition")
      private final @Nullable Output<AccountIamBindingConditionArgs> condition;

    public Output<AccountIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    @Import(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }

    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public AccountIamBindingArgs(
        Output<String> billingAccountId,
        @Nullable Output<AccountIamBindingConditionArgs> condition,
        Output<List<String>> members,
        Output<String> role) {
        this.billingAccountId = Objects.requireNonNull(billingAccountId, "expected parameter 'billingAccountId' to be non-null");
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private AccountIamBindingArgs() {
        this.billingAccountId = Codegen.empty();
        this.condition = Codegen.empty();
        this.members = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> billingAccountId;
        private @Nullable Output<AccountIamBindingConditionArgs> condition;
        private Output<List<String>> members;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder billingAccountId(Output<String> billingAccountId) {
            this.billingAccountId = Objects.requireNonNull(billingAccountId);
            return this;
        }
        public Builder billingAccountId(String billingAccountId) {
            this.billingAccountId = Output.of(Objects.requireNonNull(billingAccountId));
            return this;
        }
        public Builder condition(@Nullable Output<AccountIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable AccountIamBindingConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder members(Output<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(List<String> members) {
            this.members = Output.of(Objects.requireNonNull(members));
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }        public AccountIamBindingArgs build() {
            return new AccountIamBindingArgs(billingAccountId, condition, members, role);
        }
    }
}
