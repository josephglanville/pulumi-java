// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RunAsAccountResponse {
    private final @Nullable String accountId;
    private final @Nullable String accountName;

    @OutputCustomType.Constructor({"accountId","accountName"})
    private RunAsAccountResponse(
        @Nullable String accountId,
        @Nullable String accountName) {
        this.accountId = accountId;
        this.accountName = accountName;
    }

    public Optional<String> getAccountId() {
        return Optional.ofNullable(this.accountId);
    }
    public Optional<String> getAccountName() {
        return Optional.ofNullable(this.accountName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunAsAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountId;
        private @Nullable String accountName;

        public Builder() {
    	      // Empty
        }

        public Builder(RunAsAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.accountName = defaults.accountName;
        }

        public Builder setAccountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setAccountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }

        public RunAsAccountResponse build() {
            return new RunAsAccountResponse(accountId, accountName);
        }
    }
}
