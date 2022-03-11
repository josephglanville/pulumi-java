// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FunctionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionConfigArgs Empty = new FunctionConfigArgs();

    @InputImport(name="comment", required=true)
      private final Output<String> comment;

    public Output<String> getComment() {
        return this.comment;
    }

    @InputImport(name="runtime", required=true)
      private final Output<String> runtime;

    public Output<String> getRuntime() {
        return this.runtime;
    }

    public FunctionConfigArgs(
        Output<String> comment,
        Output<String> runtime) {
        this.comment = Objects.requireNonNull(comment, "expected parameter 'comment' to be non-null");
        this.runtime = Objects.requireNonNull(runtime, "expected parameter 'runtime' to be non-null");
    }

    private FunctionConfigArgs() {
        this.comment = Output.empty();
        this.runtime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> comment;
        private Output<String> runtime;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.runtime = defaults.runtime;
        }

        public Builder comment(Output<String> comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }

        public Builder comment(String comment) {
            this.comment = Output.of(Objects.requireNonNull(comment));
            return this;
        }

        public Builder runtime(Output<String> runtime) {
            this.runtime = Objects.requireNonNull(runtime);
            return this;
        }

        public Builder runtime(String runtime) {
            this.runtime = Output.of(Objects.requireNonNull(runtime));
            return this;
        }
        public FunctionConfigArgs build() {
            return new FunctionConfigArgs(comment, runtime);
        }
    }
}
