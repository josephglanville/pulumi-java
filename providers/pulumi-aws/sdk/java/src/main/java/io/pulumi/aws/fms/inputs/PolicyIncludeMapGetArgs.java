// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyIncludeMapGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyIncludeMapGetArgs Empty = new PolicyIncludeMapGetArgs();

    /**
     * A list of AWS Organization member Accounts that you want to include for this AWS FMS Policy.
     * 
     */
    @Import(name="accounts")
      private final @Nullable Output<List<String>> accounts;

    public Output<List<String>> getAccounts() {
        return this.accounts == null ? Codegen.empty() : this.accounts;
    }

    /**
     * A list of AWS Organizational Units that you want to include for this AWS FMS Policy. Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its child OUs, including any child OUs and accounts that are added at a later time.
     * 
     */
    @Import(name="orgunits")
      private final @Nullable Output<List<String>> orgunits;

    public Output<List<String>> getOrgunits() {
        return this.orgunits == null ? Codegen.empty() : this.orgunits;
    }

    public PolicyIncludeMapGetArgs(
        @Nullable Output<List<String>> accounts,
        @Nullable Output<List<String>> orgunits) {
        this.accounts = accounts;
        this.orgunits = orgunits;
    }

    private PolicyIncludeMapGetArgs() {
        this.accounts = Codegen.empty();
        this.orgunits = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyIncludeMapGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> accounts;
        private @Nullable Output<List<String>> orgunits;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyIncludeMapGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.orgunits = defaults.orgunits;
        }

        public Builder accounts(@Nullable Output<List<String>> accounts) {
            this.accounts = accounts;
            return this;
        }
        public Builder accounts(@Nullable List<String> accounts) {
            this.accounts = Codegen.ofNullable(accounts);
            return this;
        }
        public Builder accounts(String... accounts) {
            return accounts(List.of(accounts));
        }
        public Builder orgunits(@Nullable Output<List<String>> orgunits) {
            this.orgunits = orgunits;
            return this;
        }
        public Builder orgunits(@Nullable List<String> orgunits) {
            this.orgunits = Codegen.ofNullable(orgunits);
            return this;
        }
        public Builder orgunits(String... orgunits) {
            return orgunits(List.of(orgunits));
        }        public PolicyIncludeMapGetArgs build() {
            return new PolicyIncludeMapGetArgs(accounts, orgunits);
        }
    }
}
