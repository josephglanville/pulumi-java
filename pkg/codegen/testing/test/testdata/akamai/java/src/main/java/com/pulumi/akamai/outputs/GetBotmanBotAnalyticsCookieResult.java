// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBotmanBotAnalyticsCookieResult {
    private Integer configId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String json;

    private GetBotmanBotAnalyticsCookieResult() {}
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
    public String json() {
        return this.json;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotmanBotAnalyticsCookieResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer configId;
        private String id;
        private String json;
        public Builder() {}
        public Builder(GetBotmanBotAnalyticsCookieResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.id = defaults.id;
    	      this.json = defaults.json;
        }

        @CustomType.Setter
        public Builder configId(Integer configId) {
            if (configId == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotAnalyticsCookieResult", "configId");
            }
            this.configId = configId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotAnalyticsCookieResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            if (json == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotAnalyticsCookieResult", "json");
            }
            this.json = json;
            return this;
        }
        public GetBotmanBotAnalyticsCookieResult build() {
            final var _resultValue = new GetBotmanBotAnalyticsCookieResult();
            _resultValue.configId = configId;
            _resultValue.id = id;
            _resultValue.json = json;
            return _resultValue;
        }
    }
}
