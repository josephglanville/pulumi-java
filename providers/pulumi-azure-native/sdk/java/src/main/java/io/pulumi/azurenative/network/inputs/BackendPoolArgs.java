// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.BackendArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendPoolArgs Empty = new BackendPoolArgs();

    @InputImport(name="backends")
    private final @Nullable Input<List<BackendArgs>> backends;

    public Input<List<BackendArgs>> getBackends() {
        return this.backends == null ? Input.empty() : this.backends;
    }

    @InputImport(name="healthProbeSettings")
    private final @Nullable Input<SubResourceArgs> healthProbeSettings;

    public Input<SubResourceArgs> getHealthProbeSettings() {
        return this.healthProbeSettings == null ? Input.empty() : this.healthProbeSettings;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="loadBalancingSettings")
    private final @Nullable Input<SubResourceArgs> loadBalancingSettings;

    public Input<SubResourceArgs> getLoadBalancingSettings() {
        return this.loadBalancingSettings == null ? Input.empty() : this.loadBalancingSettings;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public BackendPoolArgs(
        @Nullable Input<List<BackendArgs>> backends,
        @Nullable Input<SubResourceArgs> healthProbeSettings,
        @Nullable Input<String> id,
        @Nullable Input<SubResourceArgs> loadBalancingSettings,
        @Nullable Input<String> name) {
        this.backends = backends;
        this.healthProbeSettings = healthProbeSettings;
        this.id = id;
        this.loadBalancingSettings = loadBalancingSettings;
        this.name = name;
    }

    private BackendPoolArgs() {
        this.backends = Input.empty();
        this.healthProbeSettings = Input.empty();
        this.id = Input.empty();
        this.loadBalancingSettings = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BackendArgs>> backends;
        private @Nullable Input<SubResourceArgs> healthProbeSettings;
        private @Nullable Input<String> id;
        private @Nullable Input<SubResourceArgs> loadBalancingSettings;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backends = defaults.backends;
    	      this.healthProbeSettings = defaults.healthProbeSettings;
    	      this.id = defaults.id;
    	      this.loadBalancingSettings = defaults.loadBalancingSettings;
    	      this.name = defaults.name;
        }

        public Builder setBackends(@Nullable Input<List<BackendArgs>> backends) {
            this.backends = backends;
            return this;
        }

        public Builder setBackends(@Nullable List<BackendArgs> backends) {
            this.backends = Input.ofNullable(backends);
            return this;
        }

        public Builder setHealthProbeSettings(@Nullable Input<SubResourceArgs> healthProbeSettings) {
            this.healthProbeSettings = healthProbeSettings;
            return this;
        }

        public Builder setHealthProbeSettings(@Nullable SubResourceArgs healthProbeSettings) {
            this.healthProbeSettings = Input.ofNullable(healthProbeSettings);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setLoadBalancingSettings(@Nullable Input<SubResourceArgs> loadBalancingSettings) {
            this.loadBalancingSettings = loadBalancingSettings;
            return this;
        }

        public Builder setLoadBalancingSettings(@Nullable SubResourceArgs loadBalancingSettings) {
            this.loadBalancingSettings = Input.ofNullable(loadBalancingSettings);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public BackendPoolArgs build() {
            return new BackendPoolArgs(backends, healthProbeSettings, id, loadBalancingSettings, name);
        }
    }
}
