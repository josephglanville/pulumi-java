// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertiesProperty;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPropertiesResult {
    private String contractId;
    private String groupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetPropertiesProperty> properties;

    private GetPropertiesResult() {}
    public String contractId() {
        return this.contractId;
    }
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetPropertiesProperty> properties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertiesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contractId;
        private String groupId;
        private String id;
        private List<GetPropertiesProperty> properties;
        public Builder() {}
        public Builder(GetPropertiesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contractId = defaults.contractId;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.properties = defaults.properties;
        }

        @CustomType.Setter
        public Builder contractId(String contractId) {
            if (contractId == null) {
              throw new MissingRequiredPropertyException("GetPropertiesResult", "contractId");
            }
            this.contractId = contractId;
            return this;
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            if (groupId == null) {
              throw new MissingRequiredPropertyException("GetPropertiesResult", "groupId");
            }
            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPropertiesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder properties(List<GetPropertiesProperty> properties) {
            if (properties == null) {
              throw new MissingRequiredPropertyException("GetPropertiesResult", "properties");
            }
            this.properties = properties;
            return this;
        }
        public Builder properties(GetPropertiesProperty... properties) {
            return properties(List.of(properties));
        }
        public GetPropertiesResult build() {
            final var _resultValue = new GetPropertiesResult();
            _resultValue.contractId = contractId;
            _resultValue.groupId = groupId;
            _resultValue.id = id;
            _resultValue.properties = properties;
            return _resultValue;
        }
    }
}
