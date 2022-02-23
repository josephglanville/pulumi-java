// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineMathArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineMathArgs Empty = new PipelineMathArgs();

    @InputImport(name="attribute", required=true)
      private final Input<String> attribute;

    public Input<String> getAttribute() {
        return this.attribute;
    }

    @InputImport(name="math", required=true)
      private final Input<String> math;

    public Input<String> getMath() {
        return this.math;
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

    public PipelineMathArgs(
        Input<String> attribute,
        Input<String> math,
        Input<String> name,
        @Nullable Input<String> next) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.math = Objects.requireNonNull(math, "expected parameter 'math' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.next = next;
    }

    private PipelineMathArgs() {
        this.attribute = Input.empty();
        this.math = Input.empty();
        this.name = Input.empty();
        this.next = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineMathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> attribute;
        private Input<String> math;
        private Input<String> name;
        private @Nullable Input<String> next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineMathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.math = defaults.math;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder setAttribute(Input<String> attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder setAttribute(String attribute) {
            this.attribute = Input.of(Objects.requireNonNull(attribute));
            return this;
        }

        public Builder setMath(Input<String> math) {
            this.math = Objects.requireNonNull(math);
            return this;
        }

        public Builder setMath(String math) {
            this.math = Input.of(Objects.requireNonNull(math));
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
        public PipelineMathArgs build() {
            return new PipelineMathArgs(attribute, math, name, next);
        }
    }
}
