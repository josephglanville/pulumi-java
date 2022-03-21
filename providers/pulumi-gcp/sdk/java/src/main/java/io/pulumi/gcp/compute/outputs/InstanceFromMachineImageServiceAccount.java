// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceFromMachineImageServiceAccount {
    private final @Nullable String email;
    private final List<String> scopes;

    @CustomType.Constructor
    private InstanceFromMachineImageServiceAccount(
        @CustomType.Parameter("email") @Nullable String email,
        @CustomType.Parameter("scopes") List<String> scopes) {
        this.email = email;
        this.scopes = scopes;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(this.email);
    }
    public List<String> getScopes() {
        return this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageServiceAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String email;
        private List<String> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageServiceAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scopes = defaults.scopes;
        }

        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        public Builder scopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }        public InstanceFromMachineImageServiceAccount build() {
            return new InstanceFromMachineImageServiceAccount(email, scopes);
        }
    }
}
