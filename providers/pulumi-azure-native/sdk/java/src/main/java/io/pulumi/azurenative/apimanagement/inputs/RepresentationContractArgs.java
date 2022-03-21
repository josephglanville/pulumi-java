// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.ParameterContractArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Operation request/response representation details.
 * 
 */
public final class RepresentationContractArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepresentationContractArgs Empty = new RepresentationContractArgs();

    /**
     * Specifies a registered or custom content type for this representation, e.g. application/xml.
     * 
     */
    @Import(name="contentType", required=true)
      private final Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType;
    }

    /**
     * Collection of form parameters. Required if 'contentType' value is either 'application/x-www-form-urlencoded' or 'multipart/form-data'..
     * 
     */
    @Import(name="formParameters")
      private final @Nullable Output<List<ParameterContractArgs>> formParameters;

    public Output<List<ParameterContractArgs>> getFormParameters() {
        return this.formParameters == null ? Output.empty() : this.formParameters;
    }

    /**
     * An example of the representation.
     * 
     */
    @Import(name="sample")
      private final @Nullable Output<String> sample;

    public Output<String> getSample() {
        return this.sample == null ? Output.empty() : this.sample;
    }

    /**
     * Schema identifier. Applicable only if 'contentType' value is neither 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     * 
     */
    @Import(name="schemaId")
      private final @Nullable Output<String> schemaId;

    public Output<String> getSchemaId() {
        return this.schemaId == null ? Output.empty() : this.schemaId;
    }

    /**
     * Type name defined by the schema. Applicable only if 'contentType' value is neither 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     * 
     */
    @Import(name="typeName")
      private final @Nullable Output<String> typeName;

    public Output<String> getTypeName() {
        return this.typeName == null ? Output.empty() : this.typeName;
    }

    public RepresentationContractArgs(
        Output<String> contentType,
        @Nullable Output<List<ParameterContractArgs>> formParameters,
        @Nullable Output<String> sample,
        @Nullable Output<String> schemaId,
        @Nullable Output<String> typeName) {
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.formParameters = formParameters;
        this.sample = sample;
        this.schemaId = schemaId;
        this.typeName = typeName;
    }

    private RepresentationContractArgs() {
        this.contentType = Output.empty();
        this.formParameters = Output.empty();
        this.sample = Output.empty();
        this.schemaId = Output.empty();
        this.typeName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepresentationContractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> contentType;
        private @Nullable Output<List<ParameterContractArgs>> formParameters;
        private @Nullable Output<String> sample;
        private @Nullable Output<String> schemaId;
        private @Nullable Output<String> typeName;

        public Builder() {
    	      // Empty
        }

        public Builder(RepresentationContractArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.formParameters = defaults.formParameters;
    	      this.sample = defaults.sample;
    	      this.schemaId = defaults.schemaId;
    	      this.typeName = defaults.typeName;
        }

        public Builder contentType(Output<String> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder contentType(String contentType) {
            this.contentType = Output.of(Objects.requireNonNull(contentType));
            return this;
        }
        public Builder formParameters(@Nullable Output<List<ParameterContractArgs>> formParameters) {
            this.formParameters = formParameters;
            return this;
        }
        public Builder formParameters(@Nullable List<ParameterContractArgs> formParameters) {
            this.formParameters = Output.ofNullable(formParameters);
            return this;
        }
        public Builder formParameters(ParameterContractArgs... formParameters) {
            return formParameters(List.of(formParameters));
        }
        public Builder sample(@Nullable Output<String> sample) {
            this.sample = sample;
            return this;
        }
        public Builder sample(@Nullable String sample) {
            this.sample = Output.ofNullable(sample);
            return this;
        }
        public Builder schemaId(@Nullable Output<String> schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public Builder schemaId(@Nullable String schemaId) {
            this.schemaId = Output.ofNullable(schemaId);
            return this;
        }
        public Builder typeName(@Nullable Output<String> typeName) {
            this.typeName = typeName;
            return this;
        }
        public Builder typeName(@Nullable String typeName) {
            this.typeName = Output.ofNullable(typeName);
            return this;
        }        public RepresentationContractArgs build() {
            return new RepresentationContractArgs(contentType, formParameters, sample, schemaId, typeName);
        }
    }
}
