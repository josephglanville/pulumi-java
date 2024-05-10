// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetCloudwrapperConfigurationsConfigurationLocationCapacity;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudwrapperConfigurationsConfigurationLocation {
    private GetCloudwrapperConfigurationsConfigurationLocationCapacity capacity;
    private String comments;
    private String mapName;
    private Integer trafficTypeId;

    private GetCloudwrapperConfigurationsConfigurationLocation() {}
    public GetCloudwrapperConfigurationsConfigurationLocationCapacity capacity() {
        return this.capacity;
    }
    public String comments() {
        return this.comments;
    }
    public String mapName() {
        return this.mapName;
    }
    public Integer trafficTypeId() {
        return this.trafficTypeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudwrapperConfigurationsConfigurationLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetCloudwrapperConfigurationsConfigurationLocationCapacity capacity;
        private String comments;
        private String mapName;
        private Integer trafficTypeId;
        public Builder() {}
        public Builder(GetCloudwrapperConfigurationsConfigurationLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.comments = defaults.comments;
    	      this.mapName = defaults.mapName;
    	      this.trafficTypeId = defaults.trafficTypeId;
        }

        @CustomType.Setter
        public Builder capacity(GetCloudwrapperConfigurationsConfigurationLocationCapacity capacity) {
            if (capacity == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationLocation", "capacity");
            }
            this.capacity = capacity;
            return this;
        }
        @CustomType.Setter
        public Builder comments(String comments) {
            if (comments == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationLocation", "comments");
            }
            this.comments = comments;
            return this;
        }
        @CustomType.Setter
        public Builder mapName(String mapName) {
            if (mapName == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationLocation", "mapName");
            }
            this.mapName = mapName;
            return this;
        }
        @CustomType.Setter
        public Builder trafficTypeId(Integer trafficTypeId) {
            if (trafficTypeId == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationLocation", "trafficTypeId");
            }
            this.trafficTypeId = trafficTypeId;
            return this;
        }
        public GetCloudwrapperConfigurationsConfigurationLocation build() {
            final var _resultValue = new GetCloudwrapperConfigurationsConfigurationLocation();
            _resultValue.capacity = capacity;
            _resultValue.comments = comments;
            _resultValue.mapName = mapName;
            _resultValue.trafficTypeId = trafficTypeId;
            return _resultValue;
        }
    }
}
