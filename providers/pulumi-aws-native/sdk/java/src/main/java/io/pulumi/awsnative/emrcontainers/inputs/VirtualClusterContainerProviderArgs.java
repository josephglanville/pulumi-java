// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.emrcontainers.inputs;

import io.pulumi.awsnative.emrcontainers.inputs.VirtualClusterContainerInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VirtualClusterContainerProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualClusterContainerProviderArgs Empty = new VirtualClusterContainerProviderArgs();

    /**
     * The ID of the container cluster
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    @InputImport(name="info", required=true)
      private final Input<VirtualClusterContainerInfoArgs> info;

    public Input<VirtualClusterContainerInfoArgs> getInfo() {
        return this.info;
    }

    /**
     * The type of the container provider
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public VirtualClusterContainerProviderArgs(
        Input<String> id,
        Input<VirtualClusterContainerInfoArgs> info,
        Input<String> type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.info = Objects.requireNonNull(info, "expected parameter 'info' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private VirtualClusterContainerProviderArgs() {
        this.id = Input.empty();
        this.info = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualClusterContainerProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> id;
        private Input<VirtualClusterContainerInfoArgs> info;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualClusterContainerProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.info = defaults.info;
    	      this.type = defaults.type;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setInfo(Input<VirtualClusterContainerInfoArgs> info) {
            this.info = Objects.requireNonNull(info);
            return this;
        }

        public Builder setInfo(VirtualClusterContainerInfoArgs info) {
            this.info = Input.of(Objects.requireNonNull(info));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public VirtualClusterContainerProviderArgs build() {
            return new VirtualClusterContainerProviderArgs(id, info, type);
        }
    }
}
