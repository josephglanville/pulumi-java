// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FormParameterResponse;
import java.util.List;
import java.util.Objects;


/**
 * A form is a data model that groups related parameters that can be collected from the user. The process in which the agent prompts the user and collects parameter values from the user is called form filling. A form can be added to a page. When form filling is done, the filled parameters will be written to the session.
 * 
 */
public final class GoogleCloudDialogflowCxV3FormResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3FormResponse Empty = new GoogleCloudDialogflowCxV3FormResponse();

    /**
     * Parameters to collect from the user.
     * 
     */
    @Import(name="parameters", required=true)
      private final List<GoogleCloudDialogflowCxV3FormParameterResponse> parameters;

    public List<GoogleCloudDialogflowCxV3FormParameterResponse> getParameters() {
        return this.parameters;
    }

    public GoogleCloudDialogflowCxV3FormResponse(List<GoogleCloudDialogflowCxV3FormParameterResponse> parameters) {
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private GoogleCloudDialogflowCxV3FormResponse() {
        this.parameters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FormResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3FormParameterResponse> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FormResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
        }

        public Builder parameters(List<GoogleCloudDialogflowCxV3FormParameterResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(GoogleCloudDialogflowCxV3FormParameterResponse... parameters) {
            return parameters(List.of(parameters));
        }        public GoogleCloudDialogflowCxV3FormResponse build() {
            return new GoogleCloudDialogflowCxV3FormResponse(parameters);
        }
    }
}
