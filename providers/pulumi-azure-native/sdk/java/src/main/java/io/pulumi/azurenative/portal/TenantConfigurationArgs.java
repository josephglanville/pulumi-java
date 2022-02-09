// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TenantConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TenantConfigurationArgs Empty = new TenantConfigurationArgs();

    @InputImport(name="configurationName")
    private final @Nullable Input<String> configurationName;

    public Input<String> getConfigurationName() {
        return this.configurationName == null ? Input.empty() : this.configurationName;
    }

    @InputImport(name="enforcePrivateMarkdownStorage")
    private final @Nullable Input<Boolean> enforcePrivateMarkdownStorage;

    public Input<Boolean> getEnforcePrivateMarkdownStorage() {
        return this.enforcePrivateMarkdownStorage == null ? Input.empty() : this.enforcePrivateMarkdownStorage;
    }

    public TenantConfigurationArgs(
        @Nullable Input<String> configurationName,
        @Nullable Input<Boolean> enforcePrivateMarkdownStorage) {
        this.configurationName = configurationName;
        this.enforcePrivateMarkdownStorage = enforcePrivateMarkdownStorage;
    }

    private TenantConfigurationArgs() {
        this.configurationName = Input.empty();
        this.enforcePrivateMarkdownStorage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configurationName;
        private @Nullable Input<Boolean> enforcePrivateMarkdownStorage;

        public Builder() {
    	      // Empty
        }

        public Builder(TenantConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.enforcePrivateMarkdownStorage = defaults.enforcePrivateMarkdownStorage;
        }

        public Builder setConfigurationName(@Nullable Input<String> configurationName) {
            this.configurationName = configurationName;
            return this;
        }

        public Builder setConfigurationName(@Nullable String configurationName) {
            this.configurationName = Input.ofNullable(configurationName);
            return this;
        }

        public Builder setEnforcePrivateMarkdownStorage(@Nullable Input<Boolean> enforcePrivateMarkdownStorage) {
            this.enforcePrivateMarkdownStorage = enforcePrivateMarkdownStorage;
            return this;
        }

        public Builder setEnforcePrivateMarkdownStorage(@Nullable Boolean enforcePrivateMarkdownStorage) {
            this.enforcePrivateMarkdownStorage = Input.ofNullable(enforcePrivateMarkdownStorage);
            return this;
        }

        public TenantConfigurationArgs build() {
            return new TenantConfigurationArgs(configurationName, enforcePrivateMarkdownStorage);
        }
    }
}
