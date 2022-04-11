// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.HeaderAction;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the parameters for the request header action.
 * 
 */
public final class HeaderActionParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final HeaderActionParametersArgs Empty = new HeaderActionParametersArgs();

    /**
     * Action to perform
     * 
     */
    @Import(name="headerAction", required=true)
      private final Output<Either<String,HeaderAction>> headerAction;

    public Output<Either<String,HeaderAction>> getHeaderAction() {
        return this.headerAction;
    }

    /**
     * Name of the header to modify
     * 
     */
    @Import(name="headerName", required=true)
      private final Output<String> headerName;

    public Output<String> getHeaderName() {
        return this.headerName;
    }

    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Value for the specified action
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public HeaderActionParametersArgs(
        Output<Either<String,HeaderAction>> headerAction,
        Output<String> headerName,
        Output<String> odataType,
        @Nullable Output<String> value) {
        this.headerAction = Objects.requireNonNull(headerAction, "expected parameter 'headerAction' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.value = value;
    }

    private HeaderActionParametersArgs() {
        this.headerAction = Codegen.empty();
        this.headerName = Codegen.empty();
        this.odataType = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HeaderActionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,HeaderAction>> headerAction;
        private Output<String> headerName;
        private Output<String> odataType;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(HeaderActionParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerAction = defaults.headerAction;
    	      this.headerName = defaults.headerName;
    	      this.odataType = defaults.odataType;
    	      this.value = defaults.value;
        }

        public Builder headerAction(Output<Either<String,HeaderAction>> headerAction) {
            this.headerAction = Objects.requireNonNull(headerAction);
            return this;
        }
        public Builder headerAction(Either<String,HeaderAction> headerAction) {
            this.headerAction = Output.of(Objects.requireNonNull(headerAction));
            return this;
        }
        public Builder headerName(Output<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public Builder headerName(String headerName) {
            this.headerName = Output.of(Objects.requireNonNull(headerName));
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public HeaderActionParametersArgs build() {
            return new HeaderActionParametersArgs(headerAction, headerName, odataType, value);
        }
    }
}
