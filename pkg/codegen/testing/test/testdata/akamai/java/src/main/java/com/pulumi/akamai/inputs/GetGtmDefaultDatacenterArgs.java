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


public final class GetGtmDefaultDatacenterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGtmDefaultDatacenterArgs Empty = new GetGtmDefaultDatacenterArgs();

    @Import(name="datacenter")
    private @Nullable Output<Integer> datacenter;

    public Optional<Output<Integer>> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }

    @Import(name="domain", required=true)
    private Output<String> domain;

    public Output<String> domain() {
        return this.domain;
    }

    private GetGtmDefaultDatacenterArgs() {}

    private GetGtmDefaultDatacenterArgs(GetGtmDefaultDatacenterArgs $) {
        this.datacenter = $.datacenter;
        this.domain = $.domain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGtmDefaultDatacenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGtmDefaultDatacenterArgs $;

        public Builder() {
            $ = new GetGtmDefaultDatacenterArgs();
        }

        public Builder(GetGtmDefaultDatacenterArgs defaults) {
            $ = new GetGtmDefaultDatacenterArgs(Objects.requireNonNull(defaults));
        }

        public Builder datacenter(@Nullable Output<Integer> datacenter) {
            $.datacenter = datacenter;
            return this;
        }

        public Builder datacenter(Integer datacenter) {
            return datacenter(Output.of(datacenter));
        }

        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public GetGtmDefaultDatacenterArgs build() {
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("GetGtmDefaultDatacenterArgs", "domain");
            }
            return $;
        }
    }

}
