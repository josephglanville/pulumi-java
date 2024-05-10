// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBotmanBotDetectionActionResult {
    private Integer configId;
    private @Nullable String detectionId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String json;
    private String securityPolicyId;

    private GetBotmanBotDetectionActionResult() {}
    public Integer configId() {
        return this.configId;
    }
    public Optional<String> detectionId() {
        return Optional.ofNullable(this.detectionId);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String json() {
        return this.json;
    }
    public String securityPolicyId() {
        return this.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotmanBotDetectionActionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer configId;
        private @Nullable String detectionId;
        private String id;
        private String json;
        private String securityPolicyId;
        public Builder() {}
        public Builder(GetBotmanBotDetectionActionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.detectionId = defaults.detectionId;
    	      this.id = defaults.id;
    	      this.json = defaults.json;
    	      this.securityPolicyId = defaults.securityPolicyId;
        }

        @CustomType.Setter
        public Builder configId(Integer configId) {
            if (configId == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotDetectionActionResult", "configId");
            }
            this.configId = configId;
            return this;
        }
        @CustomType.Setter
        public Builder detectionId(@Nullable String detectionId) {

            this.detectionId = detectionId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotDetectionActionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            if (json == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotDetectionActionResult", "json");
            }
            this.json = json;
            return this;
        }
        @CustomType.Setter
        public Builder securityPolicyId(String securityPolicyId) {
            if (securityPolicyId == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotDetectionActionResult", "securityPolicyId");
            }
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public GetBotmanBotDetectionActionResult build() {
            final var _resultValue = new GetBotmanBotDetectionActionResult();
            _resultValue.configId = configId;
            _resultValue.detectionId = detectionId;
            _resultValue.id = id;
            _resultValue.json = json;
            _resultValue.securityPolicyId = securityPolicyId;
            return _resultValue;
        }
    }
}
