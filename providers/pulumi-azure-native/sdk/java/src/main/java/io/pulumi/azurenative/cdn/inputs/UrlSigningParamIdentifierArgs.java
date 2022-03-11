// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.ParamIndicator;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines how to identify a parameter for a specific purpose e.g. expires
 * 
 */
public final class UrlSigningParamIdentifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final UrlSigningParamIdentifierArgs Empty = new UrlSigningParamIdentifierArgs();

    /**
     * Indicates the purpose of the parameter
     * 
     */
    @InputImport(name="paramIndicator", required=true)
      private final Output<Either<String,ParamIndicator>> paramIndicator;

    public Output<Either<String,ParamIndicator>> getParamIndicator() {
        return this.paramIndicator;
    }

    /**
     * Parameter name
     * 
     */
    @InputImport(name="paramName", required=true)
      private final Output<String> paramName;

    public Output<String> getParamName() {
        return this.paramName;
    }

    public UrlSigningParamIdentifierArgs(
        Output<Either<String,ParamIndicator>> paramIndicator,
        Output<String> paramName) {
        this.paramIndicator = Objects.requireNonNull(paramIndicator, "expected parameter 'paramIndicator' to be non-null");
        this.paramName = Objects.requireNonNull(paramName, "expected parameter 'paramName' to be non-null");
    }

    private UrlSigningParamIdentifierArgs() {
        this.paramIndicator = Output.empty();
        this.paramName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningParamIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,ParamIndicator>> paramIndicator;
        private Output<String> paramName;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningParamIdentifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paramIndicator = defaults.paramIndicator;
    	      this.paramName = defaults.paramName;
        }

        public Builder paramIndicator(Output<Either<String,ParamIndicator>> paramIndicator) {
            this.paramIndicator = Objects.requireNonNull(paramIndicator);
            return this;
        }

        public Builder paramIndicator(Either<String,ParamIndicator> paramIndicator) {
            this.paramIndicator = Output.of(Objects.requireNonNull(paramIndicator));
            return this;
        }

        public Builder paramName(Output<String> paramName) {
            this.paramName = Objects.requireNonNull(paramName);
            return this;
        }

        public Builder paramName(String paramName) {
            this.paramName = Output.of(Objects.requireNonNull(paramName));
            return this;
        }
        public UrlSigningParamIdentifierArgs build() {
            return new UrlSigningParamIdentifierArgs(paramIndicator, paramName);
        }
    }
}
