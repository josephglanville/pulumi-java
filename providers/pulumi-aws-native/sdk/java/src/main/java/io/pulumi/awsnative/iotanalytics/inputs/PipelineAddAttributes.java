// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineAddAttributes extends io.pulumi.resources.InvokeArgs {

    public static final PipelineAddAttributes Empty = new PipelineAddAttributes();

    @InputImport(name="attributes", required=true)
      private final Object attributes;

    public Object getAttributes() {
        return this.attributes;
    }

    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="next")
      private final @Nullable String next;

    public Optional<String> getNext() {
        return this.next == null ? Optional.empty() : Optional.ofNullable(this.next);
    }

    public PipelineAddAttributes(
        Object attributes,
        String name,
        @Nullable String next) {
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.next = next;
    }

    private PipelineAddAttributes() {
        this.attributes = null;
        this.name = null;
        this.next = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineAddAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object attributes;
        private String name;
        private @Nullable String next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineAddAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder setAttributes(Object attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNext(@Nullable String next) {
            this.next = next;
            return this;
        }
        public PipelineAddAttributes build() {
            return new PipelineAddAttributes(attributes, name, next);
        }
    }
}
