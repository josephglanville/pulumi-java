// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.docker.inputs.ServiceModeReplicatedArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceModeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceModeArgs Empty = new ServiceModeArgs();

    @InputImport(name="global")
      private final @Nullable Output<Boolean> global;

    public Output<Boolean> getGlobal() {
        return this.global == null ? Output.empty() : this.global;
    }

    @InputImport(name="replicated")
      private final @Nullable Output<ServiceModeReplicatedArgs> replicated;

    public Output<ServiceModeReplicatedArgs> getReplicated() {
        return this.replicated == null ? Output.empty() : this.replicated;
    }

    public ServiceModeArgs(
        @Nullable Output<Boolean> global,
        @Nullable Output<ServiceModeReplicatedArgs> replicated) {
        this.global = global;
        this.replicated = replicated;
    }

    private ServiceModeArgs() {
        this.global = Output.empty();
        this.replicated = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceModeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> global;
        private @Nullable Output<ServiceModeReplicatedArgs> replicated;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceModeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.global = defaults.global;
    	      this.replicated = defaults.replicated;
        }

        public Builder global(@Nullable Output<Boolean> global) {
            this.global = global;
            return this;
        }

        public Builder global(@Nullable Boolean global) {
            this.global = Output.ofNullable(global);
            return this;
        }

        public Builder replicated(@Nullable Output<ServiceModeReplicatedArgs> replicated) {
            this.replicated = replicated;
            return this;
        }

        public Builder replicated(@Nullable ServiceModeReplicatedArgs replicated) {
            this.replicated = Output.ofNullable(replicated);
            return this;
        }
        public ServiceModeArgs build() {
            return new ServiceModeArgs(global, replicated);
        }
    }
}
