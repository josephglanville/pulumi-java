// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerAccountResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerAccountResponse Empty = new ContainerAccountResponse();

    @InputImport(name="accountName")
    private final @Nullable String accountName;

    public Optional<String> getAccountName() {
        return this.accountName == null ? Optional.empty() : Optional.ofNullable(this.accountName);
    }

    @InputImport(name="password")
    private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    @InputImport(name="spn")
    private final @Nullable String spn;

    public Optional<String> getSpn() {
        return this.spn == null ? Optional.empty() : Optional.ofNullable(this.spn);
    }

    public ContainerAccountResponse(
        @Nullable String accountName,
        @Nullable String password,
        @Nullable String spn) {
        this.accountName = accountName;
        this.password = password;
        this.spn = spn;
    }

    private ContainerAccountResponse() {
        this.accountName = null;
        this.password = null;
        this.spn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountName;
        private @Nullable String password;
        private @Nullable String spn;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.password = defaults.password;
    	      this.spn = defaults.spn;
        }

        public Builder setAccountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setSpn(@Nullable String spn) {
            this.spn = spn;
            return this;
        }

        public ContainerAccountResponse build() {
            return new ContainerAccountResponse(accountName, password, spn);
        }
    }
}
