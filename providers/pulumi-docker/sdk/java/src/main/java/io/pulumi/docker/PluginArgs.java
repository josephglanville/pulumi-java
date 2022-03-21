// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.docker.inputs.PluginGrantPermissionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PluginArgs extends io.pulumi.resources.ResourceArgs {

    public static final PluginArgs Empty = new PluginArgs();

    /**
     * Docker Plugin alias
     * 
     */
    @Import(name="alias")
      private final @Nullable Output<String> alias;

    public Output<String> getAlias() {
        return this.alias == null ? Output.empty() : this.alias;
    }

    /**
     * HTTP client timeout to enable the plugin
     * 
     */
    @Import(name="enableTimeout")
      private final @Nullable Output<Integer> enableTimeout;

    public Output<Integer> getEnableTimeout() {
        return this.enableTimeout == null ? Output.empty() : this.enableTimeout;
    }

    /**
     * If `true` the plugin is enabled. Defaults to `true`
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The environment variables in the form of `KEY=VALUE`, e.g. `DEBUG=0`
     * 
     */
    @Import(name="envs")
      private final @Nullable Output<List<String>> envs;

    public Output<List<String>> getEnvs() {
        return this.envs == null ? Output.empty() : this.envs;
    }

    /**
     * If true, then the plugin is destroyed forcibly
     * 
     */
    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Output.empty() : this.forceDestroy;
    }

    /**
     * If true, then the plugin is disabled forcibly
     * 
     */
    @Import(name="forceDisable")
      private final @Nullable Output<Boolean> forceDisable;

    public Output<Boolean> getForceDisable() {
        return this.forceDisable == null ? Output.empty() : this.forceDisable;
    }

    /**
     * If true, grant all permissions necessary to run the plugin
     * 
     */
    @Import(name="grantAllPermissions")
      private final @Nullable Output<Boolean> grantAllPermissions;

    public Output<Boolean> getGrantAllPermissions() {
        return this.grantAllPermissions == null ? Output.empty() : this.grantAllPermissions;
    }

    /**
     * Grant specific permissions only
     * 
     */
    @Import(name="grantPermissions")
      private final @Nullable Output<List<PluginGrantPermissionArgs>> grantPermissions;

    public Output<List<PluginGrantPermissionArgs>> getGrantPermissions() {
        return this.grantPermissions == null ? Output.empty() : this.grantPermissions;
    }

    /**
     * Docker Plugin name
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public PluginArgs(
        @Nullable Output<String> alias,
        @Nullable Output<Integer> enableTimeout,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<String>> envs,
        @Nullable Output<Boolean> forceDestroy,
        @Nullable Output<Boolean> forceDisable,
        @Nullable Output<Boolean> grantAllPermissions,
        @Nullable Output<List<PluginGrantPermissionArgs>> grantPermissions,
        @Nullable Output<String> name) {
        this.alias = alias;
        this.enableTimeout = enableTimeout;
        this.enabled = enabled;
        this.envs = envs;
        this.forceDestroy = forceDestroy;
        this.forceDisable = forceDisable;
        this.grantAllPermissions = grantAllPermissions;
        this.grantPermissions = grantPermissions;
        this.name = name;
    }

    private PluginArgs() {
        this.alias = Output.empty();
        this.enableTimeout = Output.empty();
        this.enabled = Output.empty();
        this.envs = Output.empty();
        this.forceDestroy = Output.empty();
        this.forceDisable = Output.empty();
        this.grantAllPermissions = Output.empty();
        this.grantPermissions = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PluginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alias;
        private @Nullable Output<Integer> enableTimeout;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<String>> envs;
        private @Nullable Output<Boolean> forceDestroy;
        private @Nullable Output<Boolean> forceDisable;
        private @Nullable Output<Boolean> grantAllPermissions;
        private @Nullable Output<List<PluginGrantPermissionArgs>> grantPermissions;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PluginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.enableTimeout = defaults.enableTimeout;
    	      this.enabled = defaults.enabled;
    	      this.envs = defaults.envs;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.forceDisable = defaults.forceDisable;
    	      this.grantAllPermissions = defaults.grantAllPermissions;
    	      this.grantPermissions = defaults.grantPermissions;
    	      this.name = defaults.name;
        }

        public Builder alias(@Nullable Output<String> alias) {
            this.alias = alias;
            return this;
        }
        public Builder alias(@Nullable String alias) {
            this.alias = Output.ofNullable(alias);
            return this;
        }
        public Builder enableTimeout(@Nullable Output<Integer> enableTimeout) {
            this.enableTimeout = enableTimeout;
            return this;
        }
        public Builder enableTimeout(@Nullable Integer enableTimeout) {
            this.enableTimeout = Output.ofNullable(enableTimeout);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder envs(@Nullable Output<List<String>> envs) {
            this.envs = envs;
            return this;
        }
        public Builder envs(@Nullable List<String> envs) {
            this.envs = Output.ofNullable(envs);
            return this;
        }
        public Builder envs(String... envs) {
            return envs(List.of(envs));
        }
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }
        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Output.ofNullable(forceDestroy);
            return this;
        }
        public Builder forceDisable(@Nullable Output<Boolean> forceDisable) {
            this.forceDisable = forceDisable;
            return this;
        }
        public Builder forceDisable(@Nullable Boolean forceDisable) {
            this.forceDisable = Output.ofNullable(forceDisable);
            return this;
        }
        public Builder grantAllPermissions(@Nullable Output<Boolean> grantAllPermissions) {
            this.grantAllPermissions = grantAllPermissions;
            return this;
        }
        public Builder grantAllPermissions(@Nullable Boolean grantAllPermissions) {
            this.grantAllPermissions = Output.ofNullable(grantAllPermissions);
            return this;
        }
        public Builder grantPermissions(@Nullable Output<List<PluginGrantPermissionArgs>> grantPermissions) {
            this.grantPermissions = grantPermissions;
            return this;
        }
        public Builder grantPermissions(@Nullable List<PluginGrantPermissionArgs> grantPermissions) {
            this.grantPermissions = Output.ofNullable(grantPermissions);
            return this;
        }
        public Builder grantPermissions(PluginGrantPermissionArgs... grantPermissions) {
            return grantPermissions(List.of(grantPermissions));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public PluginArgs build() {
            return new PluginArgs(alias, enableTimeout, enabled, envs, forceDestroy, forceDisable, grantAllPermissions, grantPermissions, name);
        }
    }
}
