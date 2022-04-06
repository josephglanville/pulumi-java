// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account.
     * 
     */
    @Import(name="email", required=true)
      private final Output<String> email;

    public Output<String> getEmail() {
        return this.email;
    }

    /**
     * If set to `ALLOW`, the new account enables IAM users to access account billing information if they have the required permissions. If set to `DENY`, then only the root user of the new account can access account billing information.
     * 
     */
    @Import(name="iamUserAccessToBilling")
      private final @Nullable Output<String> iamUserAccessToBilling;

    public Output<String> getIamUserAccessToBilling() {
        return this.iamUserAccessToBilling == null ? Output.empty() : this.iamUserAccessToBilling;
    }

    /**
     * A friendly name for the member account.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Parent Organizational Unit ID or Root ID for the account. Defaults to the Organization default Root ID. A configuration must be present for this argument to perform drift detection.
     * 
     */
    @Import(name="parentId")
      private final @Nullable Output<String> parentId;

    public Output<String> getParentId() {
        return this.parentId == null ? Output.empty() : this.parentId;
    }

    /**
     * The name of an IAM role that Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. The Organizations API provides no method for reading this information after account creation, so this provider cannot perform drift detection on its value and will always show a difference for a configured value after import unless [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) is used.
     * 
     */
    @Import(name="roleName")
      private final @Nullable Output<String> roleName;

    public Output<String> getRoleName() {
        return this.roleName == null ? Output.empty() : this.roleName;
    }

    /**
     * Key-value mapping of resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public AccountArgs(
        Output<String> email,
        @Nullable Output<String> iamUserAccessToBilling,
        @Nullable Output<String> name,
        @Nullable Output<String> parentId,
        @Nullable Output<String> roleName,
        @Nullable Output<Map<String,String>> tags) {
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.iamUserAccessToBilling = iamUserAccessToBilling;
        this.name = name;
        this.parentId = parentId;
        this.roleName = roleName;
        this.tags = tags;
    }

    private AccountArgs() {
        this.email = Output.empty();
        this.iamUserAccessToBilling = Output.empty();
        this.name = Output.empty();
        this.parentId = Output.empty();
        this.roleName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> email;
        private @Nullable Output<String> iamUserAccessToBilling;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parentId;
        private @Nullable Output<String> roleName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.iamUserAccessToBilling = defaults.iamUserAccessToBilling;
    	      this.name = defaults.name;
    	      this.parentId = defaults.parentId;
    	      this.roleName = defaults.roleName;
    	      this.tags = defaults.tags;
        }

        public Builder email(Output<String> email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder email(String email) {
            this.email = Output.of(Objects.requireNonNull(email));
            return this;
        }
        public Builder iamUserAccessToBilling(@Nullable Output<String> iamUserAccessToBilling) {
            this.iamUserAccessToBilling = iamUserAccessToBilling;
            return this;
        }
        public Builder iamUserAccessToBilling(@Nullable String iamUserAccessToBilling) {
            this.iamUserAccessToBilling = Output.ofNullable(iamUserAccessToBilling);
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
        public Builder parentId(@Nullable Output<String> parentId) {
            this.parentId = parentId;
            return this;
        }
        public Builder parentId(@Nullable String parentId) {
            this.parentId = Output.ofNullable(parentId);
            return this;
        }
        public Builder roleName(@Nullable Output<String> roleName) {
            this.roleName = roleName;
            return this;
        }
        public Builder roleName(@Nullable String roleName) {
            this.roleName = Output.ofNullable(roleName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public AccountArgs build() {
            return new AccountArgs(email, iamUserAccessToBilling, name, parentId, roleName, tags);
        }
    }
}