// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudChannelV1EduDataResponse {
    /**
     * Size of the institute.
     * 
     */
    private final String instituteSize;
    /**
     * Designated institute type of customer.
     * 
     */
    private final String instituteType;
    /**
     * Web address for the edu customer's institution.
     * 
     */
    private final String website;

    @CustomType.Constructor
    private GoogleCloudChannelV1EduDataResponse(
        @CustomType.Parameter("instituteSize") String instituteSize,
        @CustomType.Parameter("instituteType") String instituteType,
        @CustomType.Parameter("website") String website) {
        this.instituteSize = instituteSize;
        this.instituteType = instituteType;
        this.website = website;
    }

    /**
     * Size of the institute.
     * 
    */
    public String getInstituteSize() {
        return this.instituteSize;
    }
    /**
     * Designated institute type of customer.
     * 
    */
    public String getInstituteType() {
        return this.instituteType;
    }
    /**
     * Web address for the edu customer's institution.
     * 
    */
    public String getWebsite() {
        return this.website;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1EduDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instituteSize;
        private String instituteType;
        private String website;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1EduDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instituteSize = defaults.instituteSize;
    	      this.instituteType = defaults.instituteType;
    	      this.website = defaults.website;
        }

        public Builder instituteSize(String instituteSize) {
            this.instituteSize = Objects.requireNonNull(instituteSize);
            return this;
        }
        public Builder instituteType(String instituteType) {
            this.instituteType = Objects.requireNonNull(instituteType);
            return this;
        }
        public Builder website(String website) {
            this.website = Objects.requireNonNull(website);
            return this;
        }        public GoogleCloudChannelV1EduDataResponse build() {
            return new GoogleCloudChannelV1EduDataResponse(instituteSize, instituteType, website);
        }
    }
}
