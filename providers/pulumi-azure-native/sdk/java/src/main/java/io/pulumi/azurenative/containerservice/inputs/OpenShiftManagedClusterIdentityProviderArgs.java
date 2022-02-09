// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.OpenShiftManagedClusterAADIdentityProviderArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OpenShiftManagedClusterIdentityProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenShiftManagedClusterIdentityProviderArgs Empty = new OpenShiftManagedClusterIdentityProviderArgs();

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="provider")
    private final @Nullable Input<OpenShiftManagedClusterAADIdentityProviderArgs> provider;

    public Input<OpenShiftManagedClusterAADIdentityProviderArgs> getProvider() {
        return this.provider == null ? Input.empty() : this.provider;
    }

    public OpenShiftManagedClusterIdentityProviderArgs(
        @Nullable Input<String> name,
        @Nullable Input<OpenShiftManagedClusterAADIdentityProviderArgs> provider) {
        this.name = name;
        this.provider = provider;
    }

    private OpenShiftManagedClusterIdentityProviderArgs() {
        this.name = Input.empty();
        this.provider = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterIdentityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<OpenShiftManagedClusterAADIdentityProviderArgs> provider;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterIdentityProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.provider = defaults.provider;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProvider(@Nullable Input<OpenShiftManagedClusterAADIdentityProviderArgs> provider) {
            this.provider = provider;
            return this;
        }

        public Builder setProvider(@Nullable OpenShiftManagedClusterAADIdentityProviderArgs provider) {
            this.provider = Input.ofNullable(provider);
            return this;
        }

        public OpenShiftManagedClusterIdentityProviderArgs build() {
            return new OpenShiftManagedClusterIdentityProviderArgs(name, provider);
        }
    }
}
