// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.ParameterContractResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Operation request/response representation details.
 * 
 */
public final class RepresentationContractResponse extends io.pulumi.resources.InvokeArgs {

    public static final RepresentationContractResponse Empty = new RepresentationContractResponse();

    /**
     * Specifies a registered or custom content type for this representation, e.g. application/xml.
     * 
     */
    @InputImport(name="contentType", required=true)
      private final String contentType;

    public String getContentType() {
        return this.contentType;
    }

    /**
     * Collection of form parameters. Required if 'contentType' value is either 'application/x-www-form-urlencoded' or 'multipart/form-data'..
     * 
     */
    @InputImport(name="formParameters")
      private final @Nullable List<ParameterContractResponse> formParameters;

    public List<ParameterContractResponse> getFormParameters() {
        return this.formParameters == null ? List.of() : this.formParameters;
    }

    /**
     * An example of the representation.
     * 
     */
    @InputImport(name="sample")
      private final @Nullable String sample;

    public Optional<String> getSample() {
        return this.sample == null ? Optional.empty() : Optional.ofNullable(this.sample);
    }

    /**
     * Schema identifier. Applicable only if 'contentType' value is neither 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     * 
     */
    @InputImport(name="schemaId")
      private final @Nullable String schemaId;

    public Optional<String> getSchemaId() {
        return this.schemaId == null ? Optional.empty() : Optional.ofNullable(this.schemaId);
    }

    /**
     * Type name defined by the schema. Applicable only if 'contentType' value is neither 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     * 
     */
    @InputImport(name="typeName")
      private final @Nullable String typeName;

    public Optional<String> getTypeName() {
        return this.typeName == null ? Optional.empty() : Optional.ofNullable(this.typeName);
    }

    public RepresentationContractResponse(
        String contentType,
        @Nullable List<ParameterContractResponse> formParameters,
        @Nullable String sample,
        @Nullable String schemaId,
        @Nullable String typeName) {
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.formParameters = formParameters;
        this.sample = sample;
        this.schemaId = schemaId;
        this.typeName = typeName;
    }

    private RepresentationContractResponse() {
        this.contentType = null;
        this.formParameters = List.of();
        this.sample = null;
        this.schemaId = null;
        this.typeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepresentationContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentType;
        private @Nullable List<ParameterContractResponse> formParameters;
        private @Nullable String sample;
        private @Nullable String schemaId;
        private @Nullable String typeName;

        public Builder() {
    	      // Empty
        }

        public Builder(RepresentationContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.formParameters = defaults.formParameters;
    	      this.sample = defaults.sample;
    	      this.schemaId = defaults.schemaId;
    	      this.typeName = defaults.typeName;
        }

        public Builder setContentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setFormParameters(@Nullable List<ParameterContractResponse> formParameters) {
            this.formParameters = formParameters;
            return this;
        }

        public Builder setSample(@Nullable String sample) {
            this.sample = sample;
            return this;
        }

        public Builder setSchemaId(@Nullable String schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        public Builder setTypeName(@Nullable String typeName) {
            this.typeName = typeName;
            return this;
        }
        public RepresentationContractResponse build() {
            return new RepresentationContractResponse(contentType, formParameters, sample, schemaId, typeName);
        }
    }
}
