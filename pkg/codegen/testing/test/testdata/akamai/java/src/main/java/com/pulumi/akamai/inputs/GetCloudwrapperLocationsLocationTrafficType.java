// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetCloudwrapperLocationsLocationTrafficType extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudwrapperLocationsLocationTrafficType Empty = new GetCloudwrapperLocationsLocationTrafficType();

    @Import(name="locationId", required=true)
    private String locationId;

    public String locationId() {
        return this.locationId;
    }

    @Import(name="trafficType", required=true)
    private String trafficType;

    public String trafficType() {
        return this.trafficType;
    }

    @Import(name="trafficTypeId", required=true)
    private Integer trafficTypeId;

    public Integer trafficTypeId() {
        return this.trafficTypeId;
    }

    private GetCloudwrapperLocationsLocationTrafficType() {}

    private GetCloudwrapperLocationsLocationTrafficType(GetCloudwrapperLocationsLocationTrafficType $) {
        this.locationId = $.locationId;
        this.trafficType = $.trafficType;
        this.trafficTypeId = $.trafficTypeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperLocationsLocationTrafficType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperLocationsLocationTrafficType $;

        public Builder() {
            $ = new GetCloudwrapperLocationsLocationTrafficType();
        }

        public Builder(GetCloudwrapperLocationsLocationTrafficType defaults) {
            $ = new GetCloudwrapperLocationsLocationTrafficType(Objects.requireNonNull(defaults));
        }

        public Builder locationId(String locationId) {
            $.locationId = locationId;
            return this;
        }

        public Builder trafficType(String trafficType) {
            $.trafficType = trafficType;
            return this;
        }

        public Builder trafficTypeId(Integer trafficTypeId) {
            $.trafficTypeId = trafficTypeId;
            return this;
        }

        public GetCloudwrapperLocationsLocationTrafficType build() {
            if ($.locationId == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperLocationsLocationTrafficType", "locationId");
            }
            if ($.trafficType == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperLocationsLocationTrafficType", "trafficType");
            }
            if ($.trafficTypeId == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperLocationsLocationTrafficType", "trafficTypeId");
            }
            return $;
        }
    }

}
