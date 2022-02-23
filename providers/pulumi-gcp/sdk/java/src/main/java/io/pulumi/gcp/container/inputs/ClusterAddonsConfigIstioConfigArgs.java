// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterAddonsConfigIstioConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterAddonsConfigIstioConfigArgs Empty = new ClusterAddonsConfigIstioConfigArgs();

    /**
     * The authentication type between services in Istio. Available options include `AUTH_MUTUAL_TLS`.
     * 
     */
    @InputImport(name="auth")
      private final @Nullable Input<String> auth;

    public Input<String> getAuth() {
        return this.auth == null ? Input.empty() : this.auth;
    }

    /**
     * The status of the Istio addon, which makes it easy to set up Istio for services in a
     * cluster. It is disabled by default. Set `disabled = false` to enable.
     * 
     */
    @InputImport(name="disabled", required=true)
      private final Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled;
    }

    public ClusterAddonsConfigIstioConfigArgs(
        @Nullable Input<String> auth,
        Input<Boolean> disabled) {
        this.auth = auth;
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
    }

    private ClusterAddonsConfigIstioConfigArgs() {
        this.auth = Input.empty();
        this.disabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAddonsConfigIstioConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> auth;
        private Input<Boolean> disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAddonsConfigIstioConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.disabled = defaults.disabled;
        }

        public Builder setAuth(@Nullable Input<String> auth) {
            this.auth = auth;
            return this;
        }

        public Builder setAuth(@Nullable String auth) {
            this.auth = Input.ofNullable(auth);
            return this;
        }

        public Builder setDisabled(Input<Boolean> disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Input.of(Objects.requireNonNull(disabled));
            return this;
        }
        public ClusterAddonsConfigIstioConfigArgs build() {
            return new ClusterAddonsConfigIstioConfigArgs(auth, disabled);
        }
    }
}
