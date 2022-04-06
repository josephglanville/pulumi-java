// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AccountAliasArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountAliasArgs Empty = new AccountAliasArgs();

    /**
     * The account alias
     * 
     */
    @Import(name="accountAlias", required=true)
      private final Output<String> accountAlias;

    public Output<String> getAccountAlias() {
        return this.accountAlias;
    }

    public AccountAliasArgs(Output<String> accountAlias) {
        this.accountAlias = Objects.requireNonNull(accountAlias, "expected parameter 'accountAlias' to be non-null");
    }

    private AccountAliasArgs() {
        this.accountAlias = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountAlias;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountAlias = defaults.accountAlias;
        }

        public Builder accountAlias(Output<String> accountAlias) {
            this.accountAlias = Objects.requireNonNull(accountAlias);
            return this;
        }
        public Builder accountAlias(String accountAlias) {
            this.accountAlias = Output.of(Objects.requireNonNull(accountAlias));
            return this;
        }        public AccountAliasArgs build() {
            return new AccountAliasArgs(accountAlias);
        }
    }
}