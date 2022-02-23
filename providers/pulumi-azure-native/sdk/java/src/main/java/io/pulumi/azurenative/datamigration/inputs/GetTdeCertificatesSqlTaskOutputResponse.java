// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Output of the task that gets TDE certificates in Base64 encoded format.
 * 
 */
public final class GetTdeCertificatesSqlTaskOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final GetTdeCertificatesSqlTaskOutputResponse Empty = new GetTdeCertificatesSqlTaskOutputResponse();

    /**
     * Mapping from certificate name to base 64 encoded format.
     * 
     */
    @InputImport(name="base64EncodedCertificates", required=true)
      private final Map<String,List<String>> base64EncodedCertificates;

    public Map<String,List<String>> getBase64EncodedCertificates() {
        return this.base64EncodedCertificates;
    }

    /**
     * Validation errors
     * 
     */
    @InputImport(name="validationErrors", required=true)
      private final List<ReportableExceptionResponse> validationErrors;

    public List<ReportableExceptionResponse> getValidationErrors() {
        return this.validationErrors;
    }

    public GetTdeCertificatesSqlTaskOutputResponse(
        Map<String,List<String>> base64EncodedCertificates,
        List<ReportableExceptionResponse> validationErrors) {
        this.base64EncodedCertificates = Objects.requireNonNull(base64EncodedCertificates, "expected parameter 'base64EncodedCertificates' to be non-null");
        this.validationErrors = Objects.requireNonNull(validationErrors, "expected parameter 'validationErrors' to be non-null");
    }

    private GetTdeCertificatesSqlTaskOutputResponse() {
        this.base64EncodedCertificates = Map.of();
        this.validationErrors = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTdeCertificatesSqlTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,List<String>> base64EncodedCertificates;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTdeCertificatesSqlTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base64EncodedCertificates = defaults.base64EncodedCertificates;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder setBase64EncodedCertificates(Map<String,List<String>> base64EncodedCertificates) {
            this.base64EncodedCertificates = Objects.requireNonNull(base64EncodedCertificates);
            return this;
        }

        public Builder setValidationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }
        public GetTdeCertificatesSqlTaskOutputResponse build() {
            return new GetTdeCertificatesSqlTaskOutputResponse(base64EncodedCertificates, validationErrors);
        }
    }
}
