// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKeyMultiRegionConfigurationPrimaryKey {
    private final String arn;
    private final String region;

    @CustomType.Constructor
    private GetKeyMultiRegionConfigurationPrimaryKey(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("region") String region) {
        this.arn = arn;
        this.region = region;
    }

    public String getArn() {
        return this.arn;
    }
    public String getRegion() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyMultiRegionConfigurationPrimaryKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyMultiRegionConfigurationPrimaryKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.region = defaults.region;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }        public GetKeyMultiRegionConfigurationPrimaryKey build() {
            return new GetKeyMultiRegionConfigurationPrimaryKey(arn, region);
        }
    }
}
