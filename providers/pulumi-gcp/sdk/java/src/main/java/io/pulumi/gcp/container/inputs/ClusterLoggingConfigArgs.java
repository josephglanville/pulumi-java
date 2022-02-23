// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ClusterLoggingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterLoggingConfigArgs Empty = new ClusterLoggingConfigArgs();

    /**
     * The GKE components exposing logs. `SYSTEM_COMPONENTS` and in beta provider, both `SYSTEM_COMPONENTS` and `WORKLOADS` are supported.
     * 
     */
    @InputImport(name="enableComponents", required=true)
      private final Input<List<String>> enableComponents;

    public Input<List<String>> getEnableComponents() {
        return this.enableComponents;
    }

    public ClusterLoggingConfigArgs(Input<List<String>> enableComponents) {
        this.enableComponents = Objects.requireNonNull(enableComponents, "expected parameter 'enableComponents' to be non-null");
    }

    private ClusterLoggingConfigArgs() {
        this.enableComponents = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> enableComponents;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableComponents = defaults.enableComponents;
        }

        public Builder setEnableComponents(Input<List<String>> enableComponents) {
            this.enableComponents = Objects.requireNonNull(enableComponents);
            return this;
        }

        public Builder setEnableComponents(List<String> enableComponents) {
            this.enableComponents = Input.of(Objects.requireNonNull(enableComponents));
            return this;
        }
        public ClusterLoggingConfigArgs build() {
            return new ClusterLoggingConfigArgs(enableComponents);
        }
    }
}
