// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageBootDiskInitializeParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageBootDiskInitializeParamsArgs Empty = new InstanceFromMachineImageBootDiskInitializeParamsArgs();

    @InputImport(name="image")
      private final @Nullable Input<String> image;

    public Input<String> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    @InputImport(name="labels")
      private final @Nullable Input<Map<String,Object>> labels;

    public Input<Map<String,Object>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="size")
      private final @Nullable Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public InstanceFromMachineImageBootDiskInitializeParamsArgs(
        @Nullable Input<String> image,
        @Nullable Input<Map<String,Object>> labels,
        @Nullable Input<Integer> size,
        @Nullable Input<String> type) {
        this.image = image;
        this.labels = labels;
        this.size = size;
        this.type = type;
    }

    private InstanceFromMachineImageBootDiskInitializeParamsArgs() {
        this.image = Input.empty();
        this.labels = Input.empty();
        this.size = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageBootDiskInitializeParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> image;
        private @Nullable Input<Map<String,Object>> labels;
        private @Nullable Input<Integer> size;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageBootDiskInitializeParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.labels = defaults.labels;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder setImage(@Nullable Input<String> image) {
            this.image = image;
            return this;
        }

        public Builder setImage(@Nullable String image) {
            this.image = Input.ofNullable(image);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,Object>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,Object> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setSize(@Nullable Input<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable Integer size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public InstanceFromMachineImageBootDiskInitializeParamsArgs build() {
            return new InstanceFromMachineImageBootDiskInitializeParamsArgs(image, labels, size, type);
        }
    }
}
