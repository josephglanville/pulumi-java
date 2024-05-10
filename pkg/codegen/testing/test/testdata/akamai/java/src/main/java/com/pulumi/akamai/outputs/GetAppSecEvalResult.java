// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppSecEvalResult {
    private Integer configId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String outputText;
    private String securityPolicyId;

    private GetAppSecEvalResult() {}
    public Integer configId() {
        return this.configId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String outputText() {
        return this.outputText;
    }
    public String securityPolicyId() {
        return this.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSecEvalResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer configId;
        private String id;
        private String outputText;
        private String securityPolicyId;
        public Builder() {}
        public Builder(GetAppSecEvalResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.id = defaults.id;
    	      this.outputText = defaults.outputText;
    	      this.securityPolicyId = defaults.securityPolicyId;
        }

        @CustomType.Setter
        public Builder configId(Integer configId) {
            if (configId == null) {
              throw new MissingRequiredPropertyException("GetAppSecEvalResult", "configId");
            }
            this.configId = configId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAppSecEvalResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder outputText(String outputText) {
            if (outputText == null) {
              throw new MissingRequiredPropertyException("GetAppSecEvalResult", "outputText");
            }
            this.outputText = outputText;
            return this;
        }
        @CustomType.Setter
        public Builder securityPolicyId(String securityPolicyId) {
            if (securityPolicyId == null) {
              throw new MissingRequiredPropertyException("GetAppSecEvalResult", "securityPolicyId");
            }
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public GetAppSecEvalResult build() {
            final var _resultValue = new GetAppSecEvalResult();
            _resultValue.configId = configId;
            _resultValue.id = id;
            _resultValue.outputText = outputText;
            _resultValue.securityPolicyId = securityPolicyId;
            return _resultValue;
        }
    }
}
