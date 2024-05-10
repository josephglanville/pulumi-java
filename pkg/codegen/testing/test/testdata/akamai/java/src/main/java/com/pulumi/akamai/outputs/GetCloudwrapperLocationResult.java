// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudwrapperLocationResult {
    /**
     * @deprecated
     * Required by the terraform plugin testing framework, always set to `akamai_cloudwrapper_location`
     * 
     */
    @Deprecated /* Required by the terraform plugin testing framework, always set to `akamai_cloudwrapper_location` */
    private String id;
    private String locationId;
    private String locationName;
    private String trafficType;
    private Integer trafficTypeId;

    private GetCloudwrapperLocationResult() {}
    /**
     * @deprecated
     * Required by the terraform plugin testing framework, always set to `akamai_cloudwrapper_location`
     * 
     */
    @Deprecated /* Required by the terraform plugin testing framework, always set to `akamai_cloudwrapper_location` */
    public String id() {
        return this.id;
    }
    public String locationId() {
        return this.locationId;
    }
    public String locationName() {
        return this.locationName;
    }
    public String trafficType() {
        return this.trafficType;
    }
    public Integer trafficTypeId() {
        return this.trafficTypeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudwrapperLocationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String locationId;
        private String locationName;
        private String trafficType;
        private Integer trafficTypeId;
        public Builder() {}
        public Builder(GetCloudwrapperLocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.locationId = defaults.locationId;
    	      this.locationName = defaults.locationName;
    	      this.trafficType = defaults.trafficType;
    	      this.trafficTypeId = defaults.trafficTypeId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperLocationResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder locationId(String locationId) {
            if (locationId == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperLocationResult", "locationId");
            }
            this.locationId = locationId;
            return this;
        }
        @CustomType.Setter
        public Builder locationName(String locationName) {
            if (locationName == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperLocationResult", "locationName");
            }
            this.locationName = locationName;
            return this;
        }
        @CustomType.Setter
        public Builder trafficType(String trafficType) {
            if (trafficType == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperLocationResult", "trafficType");
            }
            this.trafficType = trafficType;
            return this;
        }
        @CustomType.Setter
        public Builder trafficTypeId(Integer trafficTypeId) {
            if (trafficTypeId == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperLocationResult", "trafficTypeId");
            }
            this.trafficTypeId = trafficTypeId;
            return this;
        }
        public GetCloudwrapperLocationResult build() {
            final var _resultValue = new GetCloudwrapperLocationResult();
            _resultValue.id = id;
            _resultValue.locationId = locationId;
            _resultValue.locationName = locationName;
            _resultValue.trafficType = trafficType;
            _resultValue.trafficTypeId = trafficTypeId;
            return _resultValue;
        }
    }
}
