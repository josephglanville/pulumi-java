// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * Setting a parameter value.
 * 
 */
public final class GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse Empty = new GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse();

    /**
     * Display name of the parameter.
     * 
     */
    @Import(name="parameter", required=true)
      private final String parameter;

    public String getParameter() {
        return this.parameter;
    }

    /**
     * The new value of the parameter. A null value clears the parameter.
     * 
     */
    @Import(name="value", required=true)
      private final Object value;

    public Object getValue() {
        return this.value;
    }

    public GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse(
        String parameter,
        Object value) {
        this.parameter = Objects.requireNonNull(parameter, "expected parameter 'parameter' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse() {
        this.parameter = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameter;
        private Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameter = defaults.parameter;
    	      this.value = defaults.value;
        }

        public Builder parameter(String parameter) {
            this.parameter = Objects.requireNonNull(parameter);
            return this;
        }
        public Builder value(Object value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse build() {
            return new GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse(parameter, value);
        }
    }
}
