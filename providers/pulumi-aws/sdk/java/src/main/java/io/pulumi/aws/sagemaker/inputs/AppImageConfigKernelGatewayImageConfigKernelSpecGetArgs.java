// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs Empty = new AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs();

    /**
     * The display name of the kernel.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The name of the kernel.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs(
        @Nullable Output<String> displayName,
        Output<String> name) {
        this.displayName = displayName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs() {
        this.displayName = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs build() {
            return new AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs(displayName, name);
        }
    }
}