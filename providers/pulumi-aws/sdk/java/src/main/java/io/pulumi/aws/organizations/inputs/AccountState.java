// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountState extends io.pulumi.resources.ResourceArgs {

    public static final AccountState Empty = new AccountState();

    /**
     * The ARN for this account.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account.
     * 
     */
    @InputImport(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Output.empty() : this.email;
    }

    /**
     * If set to `ALLOW`, the new account enables IAM users to access account billing information if they have the required permissions. If set to `DENY`, then only the root user of the new account can access account billing information.
     * 
     */
    @InputImport(name="iamUserAccessToBilling")
      private final @Nullable Output<String> iamUserAccessToBilling;

    public Output<String> getIamUserAccessToBilling() {
        return this.iamUserAccessToBilling == null ? Output.empty() : this.iamUserAccessToBilling;
    }

    @InputImport(name="joinedMethod")
      private final @Nullable Output<String> joinedMethod;

    public Output<String> getJoinedMethod() {
        return this.joinedMethod == null ? Output.empty() : this.joinedMethod;
    }

    @InputImport(name="joinedTimestamp")
      private final @Nullable Output<String> joinedTimestamp;

    public Output<String> getJoinedTimestamp() {
        return this.joinedTimestamp == null ? Output.empty() : this.joinedTimestamp;
    }

    /**
     * A friendly name for the member account.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Parent Organizational Unit ID or Root ID for the account. Defaults to the Organization default Root ID. A configuration must be present for this argument to perform drift detection.
     * 
     */
    @InputImport(name="parentId")
      private final @Nullable Output<String> parentId;

    public Output<String> getParentId() {
        return this.parentId == null ? Output.empty() : this.parentId;
    }

    /**
     * The name of an IAM role that Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. The Organizations API provides no method for reading this information after account creation, so this provider cannot perform drift detection on its value and will always show a difference for a configured value after import unless [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) is used.
     * 
     */
    @InputImport(name="roleName")
      private final @Nullable Output<String> roleName;

    public Output<String> getRoleName() {
        return this.roleName == null ? Output.empty() : this.roleName;
    }

    @InputImport(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * Key-value mapping of resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public AccountState(
        @Nullable Output<String> arn,
        @Nullable Output<String> email,
        @Nullable Output<String> iamUserAccessToBilling,
        @Nullable Output<String> joinedMethod,
        @Nullable Output<String> joinedTimestamp,
        @Nullable Output<String> name,
        @Nullable Output<String> parentId,
        @Nullable Output<String> roleName,
        @Nullable Output<String> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.email = email;
        this.iamUserAccessToBilling = iamUserAccessToBilling;
        this.joinedMethod = joinedMethod;
        this.joinedTimestamp = joinedTimestamp;
        this.name = name;
        this.parentId = parentId;
        this.roleName = roleName;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private AccountState() {
        this.arn = Output.empty();
        this.email = Output.empty();
        this.iamUserAccessToBilling = Output.empty();
        this.joinedMethod = Output.empty();
        this.joinedTimestamp = Output.empty();
        this.name = Output.empty();
        this.parentId = Output.empty();
        this.roleName = Output.empty();
        this.status = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> email;
        private @Nullable Output<String> iamUserAccessToBilling;
        private @Nullable Output<String> joinedMethod;
        private @Nullable Output<String> joinedTimestamp;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parentId;
        private @Nullable Output<String> roleName;
        private @Nullable Output<String> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.email = defaults.email;
    	      this.iamUserAccessToBilling = defaults.iamUserAccessToBilling;
    	      this.joinedMethod = defaults.joinedMethod;
    	      this.joinedTimestamp = defaults.joinedTimestamp;
    	      this.name = defaults.name;
    	      this.parentId = defaults.parentId;
    	      this.roleName = defaults.roleName;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(@Nullable String email) {
            this.email = Output.ofNullable(email);
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

        public Builder joinedMethod(@Nullable Output<String> joinedMethod) {
            this.joinedMethod = joinedMethod;
            return this;
        }

        public Builder joinedMethod(@Nullable String joinedMethod) {
            this.joinedMethod = Output.ofNullable(joinedMethod);
            return this;
        }

        public Builder joinedTimestamp(@Nullable Output<String> joinedTimestamp) {
            this.joinedTimestamp = joinedTimestamp;
            return this;
        }

        public Builder joinedTimestamp(@Nullable String joinedTimestamp) {
            this.joinedTimestamp = Output.ofNullable(joinedTimestamp);
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

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public AccountState build() {
            return new AccountState(arn, email, iamUserAccessToBilling, joinedMethod, joinedTimestamp, name, parentId, roleName, status, tags, tagsAll);
        }
    }
}
