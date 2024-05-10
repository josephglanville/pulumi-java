// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GtmGeomapDefaultDatacenterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GtmGeomapDefaultDatacenterArgs Empty = new GtmGeomapDefaultDatacenterArgs();

    @Import(name="datacenterId", required=true)
    private Output<Integer> datacenterId;

    public Output<Integer> datacenterId() {
        return this.datacenterId;
    }

    @Import(name="nickname")
    private @Nullable Output<String> nickname;

    public Optional<Output<String>> nickname() {
        return Optional.ofNullable(this.nickname);
    }

    private GtmGeomapDefaultDatacenterArgs() {}

    private GtmGeomapDefaultDatacenterArgs(GtmGeomapDefaultDatacenterArgs $) {
        this.datacenterId = $.datacenterId;
        this.nickname = $.nickname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GtmGeomapDefaultDatacenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GtmGeomapDefaultDatacenterArgs $;

        public Builder() {
            $ = new GtmGeomapDefaultDatacenterArgs();
        }

        public Builder(GtmGeomapDefaultDatacenterArgs defaults) {
            $ = new GtmGeomapDefaultDatacenterArgs(Objects.requireNonNull(defaults));
        }

        public Builder datacenterId(Output<Integer> datacenterId) {
            $.datacenterId = datacenterId;
            return this;
        }

        public Builder datacenterId(Integer datacenterId) {
            return datacenterId(Output.of(datacenterId));
        }

        public Builder nickname(@Nullable Output<String> nickname) {
            $.nickname = nickname;
            return this;
        }

        public Builder nickname(String nickname) {
            return nickname(Output.of(nickname));
        }

        public GtmGeomapDefaultDatacenterArgs build() {
            if ($.datacenterId == null) {
                throw new MissingRequiredPropertyException("GtmGeomapDefaultDatacenterArgs", "datacenterId");
            }
            return $;
        }
    }

}
