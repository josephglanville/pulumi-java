// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * The account id that is used to generate the service
     * account email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression `a-z`
     * to comply with RFC1035. Changing this forces a new service account to be created.
     * 
     */
    @InputImport(name="accountId", required=true)
      private final Input<String> accountId;

    public Input<String> getAccountId() {
        return this.accountId;
    }

    /**
     * A text description of the service account.
     * Must be less than or equal to 256 UTF-8 bytes.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether a service account is disabled or not. Defaults to `false`. This field has no effect during creation.
     * Must be set after creation to disable a service account.
     * 
     */
    @InputImport(name="disabled")
      private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * The display name for the service account.
     * Can be updated without creating a new resource.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The ID of the project that the service account will be created in.
     * Defaults to the provider project configuration.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public AccountArgs(
        Input<String> accountId,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> disabled,
        @Nullable Input<String> displayName,
        @Nullable Input<String> project) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.description = description;
        this.disabled = disabled;
        this.displayName = displayName;
        this.project = project;
    }

    private AccountArgs() {
        this.accountId = Input.empty();
        this.description = Input.empty();
        this.disabled = Input.empty();
        this.displayName = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountId;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.project = defaults.project;
        }

        public Builder setAccountId(Input<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Input.of(Objects.requireNonNull(accountId));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public AccountArgs build() {
            return new AccountArgs(accountId, description, disabled, displayName, project);
        }
    }
}
