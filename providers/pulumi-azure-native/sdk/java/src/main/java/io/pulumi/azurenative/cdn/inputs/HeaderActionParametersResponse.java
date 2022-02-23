// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameters for the request header action.
 * 
 */
public final class HeaderActionParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final HeaderActionParametersResponse Empty = new HeaderActionParametersResponse();

    /**
     * Action to perform
     * 
     */
    @InputImport(name="headerAction", required=true)
      private final String headerAction;

    public String getHeaderAction() {
        return this.headerAction;
    }

    /**
     * Name of the header to modify
     * 
     */
    @InputImport(name="headerName", required=true)
      private final String headerName;

    public String getHeaderName() {
        return this.headerName;
    }

    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Value for the specified action
     * 
     */
    @InputImport(name="value")
      private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public HeaderActionParametersResponse(
        String headerAction,
        String headerName,
        String odataType,
        @Nullable String value) {
        this.headerAction = Objects.requireNonNull(headerAction, "expected parameter 'headerAction' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.value = value;
    }

    private HeaderActionParametersResponse() {
        this.headerAction = null;
        this.headerName = null;
        this.odataType = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HeaderActionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerAction;
        private String headerName;
        private String odataType;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(HeaderActionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerAction = defaults.headerAction;
    	      this.headerName = defaults.headerName;
    	      this.odataType = defaults.odataType;
    	      this.value = defaults.value;
        }

        public Builder setHeaderAction(String headerAction) {
            this.headerAction = Objects.requireNonNull(headerAction);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public HeaderActionParametersResponse build() {
            return new HeaderActionParametersResponse(headerAction, headerName, odataType, value);
        }
    }
}
