// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DirectoryConfigServiceAccountCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DirectoryConfigServiceAccountCredentialsArgs Empty = new DirectoryConfigServiceAccountCredentialsArgs();

    /**
     * User name of the account. This account must have the following privileges: create computer objects, join computers to the domain, and change/reset the password on descendant computer objects for the organizational units specified.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Password for the account.
     * 
     */
    @Import(name="accountPassword", required=true)
      private final Output<String> accountPassword;

    public Output<String> getAccountPassword() {
        return this.accountPassword;
    }

    public DirectoryConfigServiceAccountCredentialsArgs(
        Output<String> accountName,
        Output<String> accountPassword) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.accountPassword = Objects.requireNonNull(accountPassword, "expected parameter 'accountPassword' to be non-null");
    }

    private DirectoryConfigServiceAccountCredentialsArgs() {
        this.accountName = Output.empty();
        this.accountPassword = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectoryConfigServiceAccountCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private Output<String> accountPassword;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectoryConfigServiceAccountCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.accountPassword = defaults.accountPassword;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder accountPassword(Output<String> accountPassword) {
            this.accountPassword = Objects.requireNonNull(accountPassword);
            return this;
        }
        public Builder accountPassword(String accountPassword) {
            this.accountPassword = Output.of(Objects.requireNonNull(accountPassword));
            return this;
        }        public DirectoryConfigServiceAccountCredentialsArgs build() {
            return new DirectoryConfigServiceAccountCredentialsArgs(accountName, accountPassword);
        }
    }
}