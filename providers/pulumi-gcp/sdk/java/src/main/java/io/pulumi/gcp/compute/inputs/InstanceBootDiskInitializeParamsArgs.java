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


public final class InstanceBootDiskInitializeParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceBootDiskInitializeParamsArgs Empty = new InstanceBootDiskInitializeParamsArgs();

    /**
     * The image from which to initialize this disk. This can be
     * one of: the image's `self_link`, `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`. If referred by family, the
     * images names must include the family name. If they don't, use the
     * [gcp.compute.Image data source](https://www.terraform.io/docs/providers/google/d/compute_image.html).
     * For instance, the image `centos-6-v20180104` includes its family name `centos-6`.
     * These images can be referred by family name here.
     * 
     */
    @InputImport(name="image")
      private final @Nullable Input<String> image;

    public Input<String> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    /**
     * A map of key/value label pairs to assign to the instance.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,Object>> labels;

    public Input<Map<String,Object>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The size of the image in gigabytes. If not specified, it
     * will inherit the size of its base image.
     * 
     */
    @InputImport(name="size")
      private final @Nullable Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public InstanceBootDiskInitializeParamsArgs(
        @Nullable Input<String> image,
        @Nullable Input<Map<String,Object>> labels,
        @Nullable Input<Integer> size,
        @Nullable Input<String> type) {
        this.image = image;
        this.labels = labels;
        this.size = size;
        this.type = type;
    }

    private InstanceBootDiskInitializeParamsArgs() {
        this.image = Input.empty();
        this.labels = Input.empty();
        this.size = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceBootDiskInitializeParamsArgs defaults) {
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

        public Builder(InstanceBootDiskInitializeParamsArgs defaults) {
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
        public InstanceBootDiskInitializeParamsArgs build() {
            return new InstanceBootDiskInitializeParamsArgs(image, labels, size, type);
        }
    }
}
