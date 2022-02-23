// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final CredentialArgs Empty = new CredentialArgs();

    /**
     * The name of the automation account.
     * 
     */
    @InputImport(name="automationAccountName", required=true)
      private final Input<String> automationAccountName;

    public Input<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The parameters supplied to the create or update credential operation.
     * 
     */
    @InputImport(name="credentialName")
      private final @Nullable Input<String> credentialName;

    public Input<String> getCredentialName() {
        return this.credentialName == null ? Input.empty() : this.credentialName;
    }

    /**
     * Gets or sets the description of the credential.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Gets or sets the name of the credential.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Gets or sets the password of the credential.
     * 
     */
    @InputImport(name="password", required=true)
      private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the user name of the credential.
     * 
     */
    @InputImport(name="userName", required=true)
      private final Input<String> userName;

    public Input<String> getUserName() {
        return this.userName;
    }

    public CredentialArgs(
        Input<String> automationAccountName,
        @Nullable Input<String> credentialName,
        @Nullable Input<String> description,
        Input<String> name,
        Input<String> password,
        Input<String> resourceGroupName,
        Input<String> userName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.credentialName = credentialName;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private CredentialArgs() {
        this.automationAccountName = Input.empty();
        this.credentialName = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.password = Input.empty();
        this.resourceGroupName = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> automationAccountName;
        private @Nullable Input<String> credentialName;
        private @Nullable Input<String> description;
        private Input<String> name;
        private Input<String> password;
        private Input<String> resourceGroupName;
        private Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(CredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.credentialName = defaults.credentialName;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.userName = defaults.userName;
        }

        public Builder setAutomationAccountName(Input<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Input.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder setCredentialName(@Nullable Input<String> credentialName) {
            this.credentialName = credentialName;
            return this;
        }

        public Builder setCredentialName(@Nullable String credentialName) {
            this.credentialName = Input.ofNullable(credentialName);
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

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPassword(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setUserName(Input<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Input.of(Objects.requireNonNull(userName));
            return this;
        }
        public CredentialArgs build() {
            return new CredentialArgs(automationAccountName, credentialName, description, name, password, resourceGroupName, userName);
        }
    }
}
