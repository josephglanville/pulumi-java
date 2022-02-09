// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TagFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final TagFilterResponse Empty = new TagFilterResponse();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="op", required=true)
    private final String op;

    public String getOp() {
        return this.op;
    }

    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    public TagFilterResponse(
        String name,
        String op,
        String value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.op = Objects.requireNonNull(op, "expected parameter 'op' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private TagFilterResponse() {
        this.name = null;
        this.op = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String op;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TagFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.op = defaults.op;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOp(String op) {
            this.op = Objects.requireNonNull(op);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public TagFilterResponse build() {
            return new TagFilterResponse(name, op, value);
        }
    }
}
