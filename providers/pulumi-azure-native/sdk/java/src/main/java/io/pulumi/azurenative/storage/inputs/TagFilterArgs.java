// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Blob index tag based filtering for blob objects
 * 
 */
public final class TagFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagFilterArgs Empty = new TagFilterArgs();

    /**
     * This is the filter tag name, it can have 1 - 128 characters
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * This is the comparison operator which is used for object comparison and filtering. Only == (equality operator) is currently supported
     * 
     */
    @InputImport(name="op", required=true)
      private final Output<String> op;

    public Output<String> getOp() {
        return this.op;
    }

    /**
     * This is the filter tag value field used for tag based filtering, it can have 0 - 256 characters
     * 
     */
    @InputImport(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public TagFilterArgs(
        Output<String> name,
        Output<String> op,
        Output<String> value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.op = Objects.requireNonNull(op, "expected parameter 'op' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private TagFilterArgs() {
        this.name = Output.empty();
        this.op = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<String> op;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TagFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.op = defaults.op;
    	      this.value = defaults.value;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder op(Output<String> op) {
            this.op = Objects.requireNonNull(op);
            return this;
        }

        public Builder op(String op) {
            this.op = Output.of(Objects.requireNonNull(op));
            return this;
        }

        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }
        public TagFilterArgs build() {
            return new TagFilterArgs(name, op, value);
        }
    }
}
