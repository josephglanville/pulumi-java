// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_beta.enums.ServerBindingType;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerBindingArgs Empty = new ServerBindingArgs();

    @Import(name="type")
      private final @Nullable Output<ServerBindingType> type;

    public Output<ServerBindingType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ServerBindingArgs(@Nullable Output<ServerBindingType> type) {
        this.type = type;
    }

    private ServerBindingArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServerBindingType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<ServerBindingType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable ServerBindingType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ServerBindingArgs build() {
            return new ServerBindingArgs(type);
        }
    }
}
