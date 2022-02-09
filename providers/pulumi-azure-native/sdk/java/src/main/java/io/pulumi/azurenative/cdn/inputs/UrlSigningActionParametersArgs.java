// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.Algorithm;
import io.pulumi.azurenative.cdn.inputs.UrlSigningParamIdentifierArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UrlSigningActionParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final UrlSigningActionParametersArgs Empty = new UrlSigningActionParametersArgs();

    @InputImport(name="algorithm")
    private final @Nullable Input<Either<String,Algorithm>> algorithm;

    public Input<Either<String,Algorithm>> getAlgorithm() {
        return this.algorithm == null ? Input.empty() : this.algorithm;
    }

    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    @InputImport(name="parameterNameOverride")
    private final @Nullable Input<List<UrlSigningParamIdentifierArgs>> parameterNameOverride;

    public Input<List<UrlSigningParamIdentifierArgs>> getParameterNameOverride() {
        return this.parameterNameOverride == null ? Input.empty() : this.parameterNameOverride;
    }

    public UrlSigningActionParametersArgs(
        @Nullable Input<Either<String,Algorithm>> algorithm,
        Input<String> odataType,
        @Nullable Input<List<UrlSigningParamIdentifierArgs>> parameterNameOverride) {
        this.algorithm = algorithm;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.parameterNameOverride = parameterNameOverride;
    }

    private UrlSigningActionParametersArgs() {
        this.algorithm = Input.empty();
        this.odataType = Input.empty();
        this.parameterNameOverride = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningActionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,Algorithm>> algorithm;
        private Input<String> odataType;
        private @Nullable Input<List<UrlSigningParamIdentifierArgs>> parameterNameOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningActionParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.odataType = defaults.odataType;
    	      this.parameterNameOverride = defaults.parameterNameOverride;
        }

        public Builder setAlgorithm(@Nullable Input<Either<String,Algorithm>> algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder setAlgorithm(@Nullable Either<String,Algorithm> algorithm) {
            this.algorithm = Input.ofNullable(algorithm);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setParameterNameOverride(@Nullable Input<List<UrlSigningParamIdentifierArgs>> parameterNameOverride) {
            this.parameterNameOverride = parameterNameOverride;
            return this;
        }

        public Builder setParameterNameOverride(@Nullable List<UrlSigningParamIdentifierArgs> parameterNameOverride) {
            this.parameterNameOverride = Input.ofNullable(parameterNameOverride);
            return this;
        }

        public UrlSigningActionParametersArgs build() {
            return new UrlSigningActionParametersArgs(algorithm, odataType, parameterNameOverride);
        }
    }
}
