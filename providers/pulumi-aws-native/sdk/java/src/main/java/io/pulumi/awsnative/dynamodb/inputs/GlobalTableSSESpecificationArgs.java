// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalTableSSESpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalTableSSESpecificationArgs Empty = new GlobalTableSSESpecificationArgs();

    @InputImport(name="sSEEnabled", required=true)
      private final Output<Boolean> sSEEnabled;

    public Output<Boolean> getSSEEnabled() {
        return this.sSEEnabled;
    }

    @InputImport(name="sSEType")
      private final @Nullable Output<String> sSEType;

    public Output<String> getSSEType() {
        return this.sSEType == null ? Output.empty() : this.sSEType;
    }

    public GlobalTableSSESpecificationArgs(
        Output<Boolean> sSEEnabled,
        @Nullable Output<String> sSEType) {
        this.sSEEnabled = Objects.requireNonNull(sSEEnabled, "expected parameter 'sSEEnabled' to be non-null");
        this.sSEType = sSEType;
    }

    private GlobalTableSSESpecificationArgs() {
        this.sSEEnabled = Output.empty();
        this.sSEType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableSSESpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> sSEEnabled;
        private @Nullable Output<String> sSEType;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableSSESpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sSEEnabled = defaults.sSEEnabled;
    	      this.sSEType = defaults.sSEType;
        }

        public Builder sSEEnabled(Output<Boolean> sSEEnabled) {
            this.sSEEnabled = Objects.requireNonNull(sSEEnabled);
            return this;
        }

        public Builder sSEEnabled(Boolean sSEEnabled) {
            this.sSEEnabled = Output.of(Objects.requireNonNull(sSEEnabled));
            return this;
        }

        public Builder sSEType(@Nullable Output<String> sSEType) {
            this.sSEType = sSEType;
            return this;
        }

        public Builder sSEType(@Nullable String sSEType) {
            this.sSEType = Output.ofNullable(sSEType);
            return this;
        }
        public GlobalTableSSESpecificationArgs build() {
            return new GlobalTableSSESpecificationArgs(sSEEnabled, sSEType);
        }
    }
}
