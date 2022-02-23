// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs;

import com.google.gson.JsonElement;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.CustomResourceSubresourceScaleArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CustomResourceSubresources defines the status and scale subresources for CustomResources.
 * 
 */
public final class CustomResourceSubresourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceSubresourcesArgs Empty = new CustomResourceSubresourcesArgs();

    /**
     * scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
     * 
     */
    @InputImport(name="scale")
      private final @Nullable Input<CustomResourceSubresourceScaleArgs> scale;

    public Input<CustomResourceSubresourceScaleArgs> getScale() {
        return this.scale == null ? Input.empty() : this.scale;
    }

    /**
     * status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<JsonElement> status;

    public Input<JsonElement> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public CustomResourceSubresourcesArgs(
        @Nullable Input<CustomResourceSubresourceScaleArgs> scale,
        @Nullable Input<JsonElement> status) {
        this.scale = scale;
        this.status = status;
    }

    private CustomResourceSubresourcesArgs() {
        this.scale = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceSubresourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CustomResourceSubresourceScaleArgs> scale;
        private @Nullable Input<JsonElement> status;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceSubresourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scale = defaults.scale;
    	      this.status = defaults.status;
        }

        public Builder setScale(@Nullable Input<CustomResourceSubresourceScaleArgs> scale) {
            this.scale = scale;
            return this;
        }

        public Builder setScale(@Nullable CustomResourceSubresourceScaleArgs scale) {
            this.scale = Input.ofNullable(scale);
            return this;
        }

        public Builder setStatus(@Nullable Input<JsonElement> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable JsonElement status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public CustomResourceSubresourcesArgs build() {
            return new CustomResourceSubresourcesArgs(scale, status);
        }
    }
}
