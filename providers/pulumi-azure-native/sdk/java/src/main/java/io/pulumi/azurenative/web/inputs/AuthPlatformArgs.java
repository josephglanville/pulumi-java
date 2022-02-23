// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the platform of App Service Authentication/Authorization.
 * 
 */
public final class AuthPlatformArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthPlatformArgs Empty = new AuthPlatformArgs();

    /**
     * The path of the config file containing auth settings if they come from a file.
     * If the path is relative, base will the site's root directory.
     * 
     */
    @InputImport(name="configFilePath")
      private final @Nullable Input<String> configFilePath;

    public Input<String> getConfigFilePath() {
        return this.configFilePath == null ? Input.empty() : this.configFilePath;
    }

    /**
     * <code>true</code> if the Authentication / Authorization feature is enabled for the current app; otherwise, <code>false</code>.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The RuntimeVersion of the Authentication / Authorization feature in use for the current app.
     * The setting in this value can control the behavior of certain features in the Authentication / Authorization module.
     * 
     */
    @InputImport(name="runtimeVersion")
      private final @Nullable Input<String> runtimeVersion;

    public Input<String> getRuntimeVersion() {
        return this.runtimeVersion == null ? Input.empty() : this.runtimeVersion;
    }

    public AuthPlatformArgs(
        @Nullable Input<String> configFilePath,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> runtimeVersion) {
        this.configFilePath = configFilePath;
        this.enabled = enabled;
        this.runtimeVersion = runtimeVersion;
    }

    private AuthPlatformArgs() {
        this.configFilePath = Input.empty();
        this.enabled = Input.empty();
        this.runtimeVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthPlatformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configFilePath;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> runtimeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthPlatformArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configFilePath = defaults.configFilePath;
    	      this.enabled = defaults.enabled;
    	      this.runtimeVersion = defaults.runtimeVersion;
        }

        public Builder setConfigFilePath(@Nullable Input<String> configFilePath) {
            this.configFilePath = configFilePath;
            return this;
        }

        public Builder setConfigFilePath(@Nullable String configFilePath) {
            this.configFilePath = Input.ofNullable(configFilePath);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setRuntimeVersion(@Nullable Input<String> runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }

        public Builder setRuntimeVersion(@Nullable String runtimeVersion) {
            this.runtimeVersion = Input.ofNullable(runtimeVersion);
            return this;
        }
        public AuthPlatformArgs build() {
            return new AuthPlatformArgs(configFilePath, enabled, runtimeVersion);
        }
    }
}
