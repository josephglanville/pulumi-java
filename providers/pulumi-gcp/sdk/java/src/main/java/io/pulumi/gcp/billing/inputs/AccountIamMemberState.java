// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.billing.inputs.AccountIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final AccountIamMemberState Empty = new AccountIamMemberState();

    @InputImport(name="billingAccountId")
      private final @Nullable Input<String> billingAccountId;

    public Input<String> getBillingAccountId() {
        return this.billingAccountId == null ? Input.empty() : this.billingAccountId;
    }

    @InputImport(name="condition")
      private final @Nullable Input<AccountIamMemberConditionGetArgs> condition;

    public Input<AccountIamMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="member")
      private final @Nullable Input<String> member;

    public Input<String> getMember() {
        return this.member == null ? Input.empty() : this.member;
    }

    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public AccountIamMemberState(
        @Nullable Input<String> billingAccountId,
        @Nullable Input<AccountIamMemberConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<String> member,
        @Nullable Input<String> role) {
        this.billingAccountId = billingAccountId;
        this.condition = condition;
        this.etag = etag;
        this.member = member;
        this.role = role;
    }

    private AccountIamMemberState() {
        this.billingAccountId = Input.empty();
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.member = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> billingAccountId;
        private @Nullable Input<AccountIamMemberConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> member;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder setBillingAccountId(@Nullable Input<String> billingAccountId) {
            this.billingAccountId = billingAccountId;
            return this;
        }

        public Builder setBillingAccountId(@Nullable String billingAccountId) {
            this.billingAccountId = Input.ofNullable(billingAccountId);
            return this;
        }

        public Builder setCondition(@Nullable Input<AccountIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable AccountIamMemberConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setMember(@Nullable Input<String> member) {
            this.member = member;
            return this;
        }

        public Builder setMember(@Nullable String member) {
            this.member = Input.ofNullable(member);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }
        public AccountIamMemberState build() {
            return new AccountIamMemberState(billingAccountId, condition, etag, member, role);
        }
    }
}
