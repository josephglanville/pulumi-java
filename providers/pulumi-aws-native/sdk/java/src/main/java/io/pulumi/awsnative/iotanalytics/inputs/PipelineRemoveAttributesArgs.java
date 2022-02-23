// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineRemoveAttributesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineRemoveAttributesArgs Empty = new PipelineRemoveAttributesArgs();

    @InputImport(name="attributes", required=true)
      private final Input<List<String>> attributes;

    public Input<List<String>> getAttributes() {
        return this.attributes;
    }

    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="next")
      private final @Nullable Input<String> next;

    public Input<String> getNext() {
        return this.next == null ? Input.empty() : this.next;
    }

    public PipelineRemoveAttributesArgs(
        Input<List<String>> attributes,
        Input<String> name,
        @Nullable Input<String> next) {
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.next = next;
    }

    private PipelineRemoveAttributesArgs() {
        this.attributes = Input.empty();
        this.name = Input.empty();
        this.next = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineRemoveAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> attributes;
        private Input<String> name;
        private @Nullable Input<String> next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineRemoveAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder setAttributes(Input<List<String>> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder setAttributes(List<String> attributes) {
            this.attributes = Input.of(Objects.requireNonNull(attributes));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setNext(@Nullable Input<String> next) {
            this.next = next;
            return this;
        }

        public Builder setNext(@Nullable String next) {
            this.next = Input.ofNullable(next);
            return this;
        }
        public PipelineRemoveAttributesArgs build() {
            return new PipelineRemoveAttributesArgs(attributes, name, next);
        }
    }
}
