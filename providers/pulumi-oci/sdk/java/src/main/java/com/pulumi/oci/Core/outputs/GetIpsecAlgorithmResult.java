// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetIpsecAlgorithmAllowedPhaseOneParameter;
import com.pulumi.oci.Core.outputs.GetIpsecAlgorithmAllowedPhaseTwoParameter;
import com.pulumi.oci.Core.outputs.GetIpsecAlgorithmDefaultPhaseOneParameter;
import com.pulumi.oci.Core.outputs.GetIpsecAlgorithmDefaultPhaseTwoParameter;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIpsecAlgorithmResult {
    /**
     * @return Allowed phase one parameters.
     * 
     */
    private final List<GetIpsecAlgorithmAllowedPhaseOneParameter> allowedPhaseOneParameters;
    /**
     * @return Allowed phase two parameters.
     * 
     */
    private final List<GetIpsecAlgorithmAllowedPhaseTwoParameter> allowedPhaseTwoParameters;
    /**
     * @return Default phase one parameters.
     * 
     */
    private final List<GetIpsecAlgorithmDefaultPhaseOneParameter> defaultPhaseOneParameters;
    /**
     * @return Default phase two parameters.
     * 
     */
    private final List<GetIpsecAlgorithmDefaultPhaseTwoParameter> defaultPhaseTwoParameters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetIpsecAlgorithmResult(
        @CustomType.Parameter("allowedPhaseOneParameters") List<GetIpsecAlgorithmAllowedPhaseOneParameter> allowedPhaseOneParameters,
        @CustomType.Parameter("allowedPhaseTwoParameters") List<GetIpsecAlgorithmAllowedPhaseTwoParameter> allowedPhaseTwoParameters,
        @CustomType.Parameter("defaultPhaseOneParameters") List<GetIpsecAlgorithmDefaultPhaseOneParameter> defaultPhaseOneParameters,
        @CustomType.Parameter("defaultPhaseTwoParameters") List<GetIpsecAlgorithmDefaultPhaseTwoParameter> defaultPhaseTwoParameters,
        @CustomType.Parameter("id") String id) {
        this.allowedPhaseOneParameters = allowedPhaseOneParameters;
        this.allowedPhaseTwoParameters = allowedPhaseTwoParameters;
        this.defaultPhaseOneParameters = defaultPhaseOneParameters;
        this.defaultPhaseTwoParameters = defaultPhaseTwoParameters;
        this.id = id;
    }

    /**
     * @return Allowed phase one parameters.
     * 
     */
    public List<GetIpsecAlgorithmAllowedPhaseOneParameter> allowedPhaseOneParameters() {
        return this.allowedPhaseOneParameters;
    }
    /**
     * @return Allowed phase two parameters.
     * 
     */
    public List<GetIpsecAlgorithmAllowedPhaseTwoParameter> allowedPhaseTwoParameters() {
        return this.allowedPhaseTwoParameters;
    }
    /**
     * @return Default phase one parameters.
     * 
     */
    public List<GetIpsecAlgorithmDefaultPhaseOneParameter> defaultPhaseOneParameters() {
        return this.defaultPhaseOneParameters;
    }
    /**
     * @return Default phase two parameters.
     * 
     */
    public List<GetIpsecAlgorithmDefaultPhaseTwoParameter> defaultPhaseTwoParameters() {
        return this.defaultPhaseTwoParameters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpsecAlgorithmResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetIpsecAlgorithmAllowedPhaseOneParameter> allowedPhaseOneParameters;
        private List<GetIpsecAlgorithmAllowedPhaseTwoParameter> allowedPhaseTwoParameters;
        private List<GetIpsecAlgorithmDefaultPhaseOneParameter> defaultPhaseOneParameters;
        private List<GetIpsecAlgorithmDefaultPhaseTwoParameter> defaultPhaseTwoParameters;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIpsecAlgorithmResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedPhaseOneParameters = defaults.allowedPhaseOneParameters;
    	      this.allowedPhaseTwoParameters = defaults.allowedPhaseTwoParameters;
    	      this.defaultPhaseOneParameters = defaults.defaultPhaseOneParameters;
    	      this.defaultPhaseTwoParameters = defaults.defaultPhaseTwoParameters;
    	      this.id = defaults.id;
        }

        public Builder allowedPhaseOneParameters(List<GetIpsecAlgorithmAllowedPhaseOneParameter> allowedPhaseOneParameters) {
            this.allowedPhaseOneParameters = Objects.requireNonNull(allowedPhaseOneParameters);
            return this;
        }
        public Builder allowedPhaseOneParameters(GetIpsecAlgorithmAllowedPhaseOneParameter... allowedPhaseOneParameters) {
            return allowedPhaseOneParameters(List.of(allowedPhaseOneParameters));
        }
        public Builder allowedPhaseTwoParameters(List<GetIpsecAlgorithmAllowedPhaseTwoParameter> allowedPhaseTwoParameters) {
            this.allowedPhaseTwoParameters = Objects.requireNonNull(allowedPhaseTwoParameters);
            return this;
        }
        public Builder allowedPhaseTwoParameters(GetIpsecAlgorithmAllowedPhaseTwoParameter... allowedPhaseTwoParameters) {
            return allowedPhaseTwoParameters(List.of(allowedPhaseTwoParameters));
        }
        public Builder defaultPhaseOneParameters(List<GetIpsecAlgorithmDefaultPhaseOneParameter> defaultPhaseOneParameters) {
            this.defaultPhaseOneParameters = Objects.requireNonNull(defaultPhaseOneParameters);
            return this;
        }
        public Builder defaultPhaseOneParameters(GetIpsecAlgorithmDefaultPhaseOneParameter... defaultPhaseOneParameters) {
            return defaultPhaseOneParameters(List.of(defaultPhaseOneParameters));
        }
        public Builder defaultPhaseTwoParameters(List<GetIpsecAlgorithmDefaultPhaseTwoParameter> defaultPhaseTwoParameters) {
            this.defaultPhaseTwoParameters = Objects.requireNonNull(defaultPhaseTwoParameters);
            return this;
        }
        public Builder defaultPhaseTwoParameters(GetIpsecAlgorithmDefaultPhaseTwoParameter... defaultPhaseTwoParameters) {
            return defaultPhaseTwoParameters(List.of(defaultPhaseTwoParameters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetIpsecAlgorithmResult build() {
            return new GetIpsecAlgorithmResult(allowedPhaseOneParameters, allowedPhaseTwoParameters, defaultPhaseOneParameters, defaultPhaseTwoParameters, id);
        }
    }
}
