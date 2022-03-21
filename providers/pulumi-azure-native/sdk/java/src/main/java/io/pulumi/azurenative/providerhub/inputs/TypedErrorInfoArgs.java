// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TypedErrorInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final TypedErrorInfoArgs Empty = new TypedErrorInfoArgs();

    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public TypedErrorInfoArgs(Output<String> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TypedErrorInfoArgs() {
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypedErrorInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TypedErrorInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public TypedErrorInfoArgs build() {
            return new TypedErrorInfoArgs(type);
        }
    }
}
