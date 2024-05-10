// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetAppSecSiemSettingsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecSiemSettingsPlainArgs Empty = new GetAppSecSiemSettingsPlainArgs();

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    private GetAppSecSiemSettingsPlainArgs() {}

    private GetAppSecSiemSettingsPlainArgs(GetAppSecSiemSettingsPlainArgs $) {
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecSiemSettingsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecSiemSettingsPlainArgs $;

        public Builder() {
            $ = new GetAppSecSiemSettingsPlainArgs();
        }

        public Builder(GetAppSecSiemSettingsPlainArgs defaults) {
            $ = new GetAppSecSiemSettingsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public GetAppSecSiemSettingsPlainArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppSecSiemSettingsPlainArgs", "configId");
            }
            return $;
        }
    }

}
