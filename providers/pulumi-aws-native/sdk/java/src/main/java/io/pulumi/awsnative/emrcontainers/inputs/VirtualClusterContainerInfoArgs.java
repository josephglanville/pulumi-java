// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.emrcontainers.inputs;

import io.pulumi.awsnative.emrcontainers.inputs.VirtualClusterEksInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class VirtualClusterContainerInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualClusterContainerInfoArgs Empty = new VirtualClusterContainerInfoArgs();

    @InputImport(name="eksInfo", required=true)
      private final Input<VirtualClusterEksInfoArgs> eksInfo;

    public Input<VirtualClusterEksInfoArgs> getEksInfo() {
        return this.eksInfo;
    }

    public VirtualClusterContainerInfoArgs(Input<VirtualClusterEksInfoArgs> eksInfo) {
        this.eksInfo = Objects.requireNonNull(eksInfo, "expected parameter 'eksInfo' to be non-null");
    }

    private VirtualClusterContainerInfoArgs() {
        this.eksInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualClusterContainerInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<VirtualClusterEksInfoArgs> eksInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualClusterContainerInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eksInfo = defaults.eksInfo;
        }

        public Builder setEksInfo(Input<VirtualClusterEksInfoArgs> eksInfo) {
            this.eksInfo = Objects.requireNonNull(eksInfo);
            return this;
        }

        public Builder setEksInfo(VirtualClusterEksInfoArgs eksInfo) {
            this.eksInfo = Input.of(Objects.requireNonNull(eksInfo));
            return this;
        }
        public VirtualClusterContainerInfoArgs build() {
            return new VirtualClusterContainerInfoArgs(eksInfo);
        }
    }
}
