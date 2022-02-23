// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComponentVersionComponentPlatformArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentVersionComponentPlatformArgs Empty = new ComponentVersionComponentPlatformArgs();

    @InputImport(name="attributes")
      private final @Nullable Input<Object> attributes;

    public Input<Object> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ComponentVersionComponentPlatformArgs(
        @Nullable Input<Object> attributes,
        @Nullable Input<String> name) {
        this.attributes = attributes;
        this.name = name;
    }

    private ComponentVersionComponentPlatformArgs() {
        this.attributes = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVersionComponentPlatformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> attributes;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVersionComponentPlatformArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.name = defaults.name;
        }

        public Builder setAttributes(@Nullable Input<Object> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributes(@Nullable Object attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public ComponentVersionComponentPlatformArgs build() {
            return new ComponentVersionComponentPlatformArgs(attributes, name);
        }
    }
}
