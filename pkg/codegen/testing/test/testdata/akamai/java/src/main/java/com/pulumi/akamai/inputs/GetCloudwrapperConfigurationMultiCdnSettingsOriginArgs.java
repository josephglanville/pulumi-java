// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs Empty = new GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs();

    @Import(name="hostname", required=true)
    private Output<String> hostname;

    public Output<String> hostname() {
        return this.hostname;
    }

    @Import(name="originId", required=true)
    private Output<String> originId;

    public Output<String> originId() {
        return this.originId;
    }

    @Import(name="propertyId", required=true)
    private Output<Integer> propertyId;

    public Output<Integer> propertyId() {
        return this.propertyId;
    }

    private GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs() {}

    private GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs(GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs $) {
        this.hostname = $.hostname;
        this.originId = $.originId;
        this.propertyId = $.propertyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs $;

        public Builder() {
            $ = new GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs();
        }

        public Builder(GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs defaults) {
            $ = new GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs(Objects.requireNonNull(defaults));
        }

        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        public Builder originId(Output<String> originId) {
            $.originId = originId;
            return this;
        }

        public Builder originId(String originId) {
            return originId(Output.of(originId));
        }

        public Builder propertyId(Output<Integer> propertyId) {
            $.propertyId = propertyId;
            return this;
        }

        public Builder propertyId(Integer propertyId) {
            return propertyId(Output.of(propertyId));
        }

        public GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs build() {
            if ($.hostname == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs", "hostname");
            }
            if ($.originId == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs", "originId");
            }
            if ($.propertyId == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs", "propertyId");
            }
            return $;
        }
    }

}
