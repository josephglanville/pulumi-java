// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterAddonsConfigIstioConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterAddonsConfigIstioConfigGetArgs Empty = new ClusterAddonsConfigIstioConfigGetArgs();

    /**
     * The authentication type between services in Istio. Available options include `AUTH_MUTUAL_TLS`.
     * 
     */
    @Import(name="auth")
      private final @Nullable Output<String> auth;

    public Output<String> getAuth() {
        return this.auth == null ? Codegen.empty() : this.auth;
    }

    /**
     * The status of the Istio addon, which makes it easy to set up Istio for services in a
     * cluster. It is disabled by default. Set `disabled = false` to enable.
     * 
     */
    @Import(name="disabled", required=true)
      private final Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled;
    }

    public ClusterAddonsConfigIstioConfigGetArgs(
        @Nullable Output<String> auth,
        Output<Boolean> disabled) {
        this.auth = auth;
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
    }

    private ClusterAddonsConfigIstioConfigGetArgs() {
        this.auth = Codegen.empty();
        this.disabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAddonsConfigIstioConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> auth;
        private Output<Boolean> disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAddonsConfigIstioConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.disabled = defaults.disabled;
        }

        public Builder auth(@Nullable Output<String> auth) {
            this.auth = auth;
            return this;
        }
        public Builder auth(@Nullable String auth) {
            this.auth = Codegen.ofNullable(auth);
            return this;
        }
        public Builder disabled(Output<Boolean> disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public Builder disabled(Boolean disabled) {
            this.disabled = Output.of(Objects.requireNonNull(disabled));
            return this;
        }        public ClusterAddonsConfigIstioConfigGetArgs build() {
            return new ClusterAddonsConfigIstioConfigGetArgs(auth, disabled);
        }
    }
}
