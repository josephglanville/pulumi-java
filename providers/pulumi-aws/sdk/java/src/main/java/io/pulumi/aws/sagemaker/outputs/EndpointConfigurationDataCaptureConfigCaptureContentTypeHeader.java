// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader {
    /**
     * The CSV content type headers to capture.
     * 
     */
    private final @Nullable List<String> csvContentTypes;
    /**
     * The JSON content type headers to capture.
     * 
     */
    private final @Nullable List<String> jsonContentTypes;

    @CustomType.Constructor
    private EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader(
        @CustomType.Parameter("csvContentTypes") @Nullable List<String> csvContentTypes,
        @CustomType.Parameter("jsonContentTypes") @Nullable List<String> jsonContentTypes) {
        this.csvContentTypes = csvContentTypes;
        this.jsonContentTypes = jsonContentTypes;
    }

    /**
     * The CSV content type headers to capture.
     * 
    */
    public List<String> getCsvContentTypes() {
        return this.csvContentTypes == null ? List.of() : this.csvContentTypes;
    }
    /**
     * The JSON content type headers to capture.
     * 
    */
    public List<String> getJsonContentTypes() {
        return this.jsonContentTypes == null ? List.of() : this.jsonContentTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> csvContentTypes;
        private @Nullable List<String> jsonContentTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csvContentTypes = defaults.csvContentTypes;
    	      this.jsonContentTypes = defaults.jsonContentTypes;
        }

        public Builder csvContentTypes(@Nullable List<String> csvContentTypes) {
            this.csvContentTypes = csvContentTypes;
            return this;
        }
        public Builder csvContentTypes(String... csvContentTypes) {
            return csvContentTypes(List.of(csvContentTypes));
        }
        public Builder jsonContentTypes(@Nullable List<String> jsonContentTypes) {
            this.jsonContentTypes = jsonContentTypes;
            return this;
        }
        public Builder jsonContentTypes(String... jsonContentTypes) {
            return jsonContentTypes(List.of(jsonContentTypes));
        }        public EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader build() {
            return new EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader(csvContentTypes, jsonContentTypes);
        }
    }
}